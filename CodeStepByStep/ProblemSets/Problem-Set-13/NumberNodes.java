public int numberNodes(TreeNode root) {
    return numberNodes(root, 1);
}

public int numberNodes(TreeNode root, int n) {
    if (root == null) return 0;
    root.data = n;
    int mx = n;
    mx = Math.max(mx, numberNodes(root.left, mx+1));
    mx = Math.max(mx, numberNodes(root.right, mx+1));
    return mx;
}
