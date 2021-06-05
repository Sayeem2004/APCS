public int countLeaves(TreeNode root) {
    if (root == null) return 0;
    int count = 0;
    count += countLeaves(root.left);
    count += countLeaves(root.right);
    if (root.left == null && root.right == null) return 1;
    return count;
}
