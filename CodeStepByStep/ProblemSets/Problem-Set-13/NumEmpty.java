public int numEmpty(TreeNode root) {
    if (root == null) return 1;
    int count = 0;
    if (root.left == null) count++;
    else count += numEmpty(root.left);
    if (root.right == null) count++;
    else count += numEmpty(root.right);
    return count;
}
