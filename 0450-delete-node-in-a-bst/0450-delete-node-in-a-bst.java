class Solution {
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null) return null;
        if(root.val>key) root.left=deleteNode(root.left,key);
        else if(root.val<key) root.right=deleteNode(root.right,key);
        else{
            if(root.left==null && root.right==null) return null;
            if(root.left==null) return root.right;
            if(root.right==null) return root.left;

            TreeNode temp=root.left;
            while(temp.right!=null) temp=temp.right;
            temp.left=deleteNode(root.left,temp.val);
             root.val = temp.val;
            root.left = deleteNode(root.left, temp.val);
            // temp.right=root.right;
            // temp.left=root.left;
            // return temp;
        }
        return root;
    }
}