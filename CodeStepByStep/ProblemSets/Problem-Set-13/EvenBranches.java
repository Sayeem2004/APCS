public int evenBranches(TreeNode root) {
    if (root == null) return 0;
    int count = 0;
    count += evenBranches(root.left);
    count += evenBranches(root.right);
    if (root.left != null || root.right != null) {
        if (root.data % 2 == 0) count++;
    }
    return count;
}
