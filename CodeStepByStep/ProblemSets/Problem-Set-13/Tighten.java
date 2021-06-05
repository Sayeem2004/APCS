public TreeNode tighten(TreeNode root) {
    if (root == null) return null;
    if (root.left != null && root.right == null) return tighten(root.left);
    if (root.left == null && root.right != null) return tighten(root.right);
    return new TreeNode(root.data, tighten(root.left), tighten(root.right));
}
