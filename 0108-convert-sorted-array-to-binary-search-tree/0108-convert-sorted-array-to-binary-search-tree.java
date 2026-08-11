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
    public TreeNode ans(int []arr,int lo,int hi){
        int mid=(lo+hi)/2;
        if(lo>hi) return null;
        TreeNode temp=new TreeNode(arr[mid]);
        temp.left=ans(arr,lo,mid-1);
        temp.right=ans(arr,mid+1,hi);
        return temp;
    }
    public TreeNode sortedArrayToBST(int[] nums) {
        int n=nums.length;
        return ans(nums,0,n-1);
    }
}