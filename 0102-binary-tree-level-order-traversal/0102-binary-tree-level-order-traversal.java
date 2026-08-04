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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>>ans=new ArrayList<>();
        if(root==null) return ans;
        Queue<Pair>q=new LinkedList<>();
        int currlevel=0;
         List<Integer>arr=new ArrayList<>();
        q.add(new Pair(root,0));
        while(q.size()>0){ 
            Pair front=q.remove();
            if(currlevel!=front.level){
                currlevel++;
                if(arr.size()!=0) ans.add(arr);
                arr=new ArrayList<>();
            }
            //if(front.node!=null) return ans;
            arr.add(front.node.val);
            if(front.node.left!=null) q.add(new Pair(front.node.left,front.level+1));
            if(front.node.right!=null) q.add(new Pair(front.node.right,front.level+1));
        }
        ans.add(arr);
        return ans;
    }
}