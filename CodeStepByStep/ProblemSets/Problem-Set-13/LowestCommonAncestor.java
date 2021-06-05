public int lowestCommonAncestor(TreeNode root, int a, int b) {
    if (root == null) return 0;
    if (root.data == a || root.data == b) {
        if (root.data == a && root.data == b) return root.data;
        if (lowestCommonAncestor(root.left, a, b) == -1) return root.data;
        if (lowestCommonAncestor(root.right, a, b) == -1) return root.data;
        return -1;
    } else {
        int c = lowestCommonAncestor(root.left, a, b);
        int d = lowestCommonAncestor(root.right, a, b);
        if (c == -1 && d == -1) return root.data;
        if (c == -1 || d == -1) return -1;
        if (c > 0 || d > 0) return c+d;
        return 0;
    }
}
