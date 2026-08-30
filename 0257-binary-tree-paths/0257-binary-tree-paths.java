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
    public void sol(TreeNode root,String s,List<String>ans){
        if(root.left==null && root.right==null){
            s+=root.val;
            ans.add(s);
            return;
        }
        s+=(root.val);
        s+="->";
        if(root.left!=null) sol(root.left,s,ans);
        if(root.right!=null) sol(root.right,s,ans);
        s="";
    }
    public List<String> binaryTreePaths(TreeNode root) {
        List<String>ans=new ArrayList<>();
        sol(root,"",ans);
        return ans;
    }
}