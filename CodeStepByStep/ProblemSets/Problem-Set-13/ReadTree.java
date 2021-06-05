public TreeNode readTree(Scanner in) {
    int a = in.nextInt();
    int b = in.nextInt();
    if (a == 0) return new TreeNode(b);
    if (a == 1) {
        return new TreeNode(b, readTree(in), null);
    }
    if (a == 2) {
        return new TreeNode(b, null, readTree(in));
    }
    return new TreeNode(b, readTree(in), readTree(in));
}
