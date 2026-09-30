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
    static int max;
    public void dfs(TreeNode root,int level){
        if(root==null) return;
        if(root.left==null && root.right==null){
            level++;
            if(max<level) max=level;
            return;
        }
        level++;
        dfs(root.left,level);
        dfs(root.right,level);
    }
    public int maxDepth(TreeNode root) {
        max=0;
        dfs(root,0);
        return max;
    }
}