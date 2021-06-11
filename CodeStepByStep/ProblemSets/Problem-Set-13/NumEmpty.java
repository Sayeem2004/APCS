public int numEmpty(TreeNode root) {
    if (root == null) return 1;
    int count = 0;
    count += numEmpty(root.left);
    count += numEmpty(root.right);
    return count;
}
