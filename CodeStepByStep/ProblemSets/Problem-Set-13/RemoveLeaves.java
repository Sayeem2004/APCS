public TreeNode removeLeaves(TreeNode root) {
    if (root == null) return null;
    if (root.left == null && root.right == null) return null;
    return new TreeNode(root.data, removeLeaves(root.left), removeLeaves(root.right));
}
