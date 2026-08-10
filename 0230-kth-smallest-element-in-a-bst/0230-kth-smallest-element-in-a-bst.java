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
    public void ans(TreeNode root,ArrayList<Integer>arr){
        if(root==null) return;
        ans(root.left,arr);
        arr.add(root.val);
        ans(root.right,arr);
    }
    public int kthSmallest(TreeNode root, int k) {
        ArrayList<Integer>arr=new ArrayList<>();
         ans(root,arr);
         if(arr.size()<k) return -1;
         return arr.get(k-1);
    }
}