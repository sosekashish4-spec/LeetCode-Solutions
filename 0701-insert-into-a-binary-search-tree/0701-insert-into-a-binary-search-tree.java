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
    public void check(TreeNode root,int val,TreeNode temp){
        if(root==null) return;
        if(root.val<val){
             check(root.right,val,temp);
            if(root.right==null){
                root.right=temp;
                return;
            }
        } 
        else{
             check(root.left,val,temp);
            if(root.left==null){
                root.left=temp;
                return;
            }
        }
    }
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root==null) return new TreeNode(val);
        check(root,val,new TreeNode(val));
        return root;
    }
}