class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        TreeNode node = null;
        if(root==null || root.val==val)
            return root;
        if(root.val>val)
            node= searchBST(root.left,val);
        if(root.val<val)
           node= searchBST(root.right,val);
        return node;
        
    }
}