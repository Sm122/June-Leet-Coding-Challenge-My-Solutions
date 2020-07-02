class Solution {
    public int countNodes(TreeNode root) {
       if(root == null)
           return 0;
        int count = 0;
       Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.add(root);
        while(!q.isEmpty())
        {
          TreeNode node = q.remove();
            count++;
            if(node.left!=null)
                q.add(node.left);
            if(node.right!=null)
                q.add(node.right);
        }
        return count;
    }
}