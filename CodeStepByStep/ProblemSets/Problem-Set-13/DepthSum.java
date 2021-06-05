public int depthSum(TreeNode root) {
    return depthSum(root, 1);
}

public int depthSum(TreeNode root, int n) {
    if (root == null) return 0;
    int count = 0;
    count += depthSum(root.left, n+1);
    count += depthSum(root.right, n+1);
    count += root.data * n;
    return count;
}
