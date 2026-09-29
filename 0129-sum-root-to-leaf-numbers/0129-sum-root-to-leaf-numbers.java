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
    static int result;
    public void dfs(TreeNode root,int ans){
        if(root==null) return;
        ans=ans*10+root.val;
        if(root.left==null && root.right==null) {
            result+=ans;
            return;
        }
        if(root.left!=null) dfs(root.left,ans);
        if(root.right!=null) dfs(root.right,ans);
    }
    public int sumNumbers(TreeNode root) {
         result=0;
         dfs(root,0);
         return result;
    }
}