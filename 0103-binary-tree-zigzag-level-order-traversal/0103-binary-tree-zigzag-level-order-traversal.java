/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
 class Pair{
    TreeNode node;
    int level;
    Pair(TreeNode node,int level){
        this.node=node;
        this.level=level;
    }
 }
class Solution {
    public void helper(TreeNode root,List<List<Integer>>ans,List<Integer>arr){
        //  arr.add(root.val);
        // if(root.left==null && root.right==null){
        //     ans.add(arr);
        //     return;
        // }
        // arr.re
        // ans.add(arr);

        Queue<Pair>q=new LinkedList<>();
        int currlevel=0;
        q.add(new Pair(root,0));
        while(q.size()>0){ 
            Pair front=q.remove();
            if(currlevel!=front.level){
                currlevel++;
                if(arr.size()!=0) ans.add(arr);
                arr=new ArrayList<>();
            }
            arr.add(front.node.val);
            if(front.node.left!=null) q.add(new Pair(front.node.left,front.level+1));
            if(front.node.right!=null) q.add(new Pair(front.node.right,front.level+1));
        }
        ans.add(arr);
    }
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer>arr=new ArrayList<>();
        if(root==null) return ans;
        helper(root,ans,arr);
        for(int i=1;i<ans.size();i+=2){
             Collections.reverse(ans.get(i));
        }
        return ans;
    }
}