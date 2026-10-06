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
class Solution {
    public void traverse(TreeNode t,ArrayList<Integer>arr){
        if(t==null){
            arr.add(Integer.MIN_VALUE);
            return;
        }
        arr.add(t.val);
        traverse(t.left,arr);
        traverse(t.right,arr);
    }
    public boolean isSameTree(TreeNode p, TreeNode q) {
        TreeNode t1=p;
        TreeNode t2=q;
        if(p==null && q==null) return true;
        if(p==null || q==null) return false;

        ArrayList<Integer>a1=new ArrayList<>();
        ArrayList<Integer>a2=new ArrayList<>();
        traverse(p,a1);
        traverse(q,a2);
        System.out.println(a1);
        System.out.println(a2);
        if(a1.size()!=a2.size()) return false;
        for(int i=0;i<a1.size();i++){
             if (!a1.get(i).equals(a2.get(i))) return false;
        }
        return true;
    }
}