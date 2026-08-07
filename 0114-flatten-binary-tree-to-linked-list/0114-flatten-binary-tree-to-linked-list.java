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
    public void trav(TreeNode root,ArrayList<TreeNode>ans){
        if(root==null) return;
        ans.add(root);
        trav(root.left,ans);
        trav(root.right,ans);
    }
    public void flatten(TreeNode root) {
        ArrayList<TreeNode>ans=new ArrayList<>();
        trav(root,ans);
        TreeNode temp=root;
        for(int i=1;i<ans.size();i++){
            temp.right=ans.get(i);
            temp.left=null;
            temp=temp.right;
        }
    }
}