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
    public void pre(TreeNode root,ArrayList<Integer>a){
        if(root==null){
            a.add(10000);
            return;
        }
        a.add(root.val);
        pre(root.left,a);
        pre(root.right,a);
    }

    public void post(TreeNode root,ArrayList<Integer>a){
        if(root==null){
            a.add(10000);
            return;
        }
        a.add(root.val);
        post(root.right,a);
        post(root.left,a);
    }

    public boolean isSymmetric(TreeNode root) {
         ArrayList<Integer>a1=new ArrayList<>();
         ArrayList<Integer>a2=new ArrayList<>();
         pre(root.left,a1);
         post(root.right,a2);
          
         if(a1.size()!=a2.size()) return false;
         for(int i=0;i<a1.size();i++){
            if(!a1.get(i).equals(a2.get(i))) return false;
         }
         return true;
    }
}