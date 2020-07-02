class Solution {
    public int sumNumbers(TreeNode root) {
      if(root == null)
          return 0;
        return sumUtil(root,0);           
    }
    static int sumUtil(TreeNode root,int sum)
    {
        if(root==null)
            return 0;
        if(root.left==null && root.right==null)
            return sum*10+root.val;
        return sumUtil(root.left,sum*10+root.val)+sumUtil(root.right,sum*10+root.val);
    }
}