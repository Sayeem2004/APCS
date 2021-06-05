public int size(TreeNode root) {
    if (root == null) return 0;
    int count = 1;
    count += size(root.left);
    count += size(root.right);
    return count;
}
