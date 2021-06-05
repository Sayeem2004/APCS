public TreeNode doublePositives(TreeNode root) {
    if (root == null) return null;
    TreeNode left = doublePositives(root.left);
    TreeNode right = doublePositives(root.right);
    return new TreeNode((root.data > 0) ? root.data*2 : root.data, left, right);
}
