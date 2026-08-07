/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean exists(TreeNode root, int n){
        if(root==null) return false;
        if(root.val==n) return true;
        return(exists(root.left,n)|| exists(root.right,n));
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        Boolean a=exists(root.left,p.val);
        Boolean b=exists(root.left,q.val);
        if(root.val==p.val || root.val==q.val) return root;
        if(a&&b==true) return lowestCommonAncestor(root.left,p,q);
        else if(a||b==true) return root;
        else return lowestCommonAncestor(root.right,p,q);
    }
}