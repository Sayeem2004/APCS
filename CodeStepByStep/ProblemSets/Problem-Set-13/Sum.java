public int sum(TreeNode root) {
    if (root == null) return 0;
    int count = root.data;
    count += sum(root.left);
    count += sum(root.right);
    return count;
}
