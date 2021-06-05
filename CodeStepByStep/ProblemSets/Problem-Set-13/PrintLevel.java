public void printLevel(TreeNode root, int lvl) {
    if (lvl < 1) throw new IllegalArgumentException();
    printLevel(root, lvl, 1);
}

public void printLevel(TreeNode root, int lvl, int n) {
    if (root == null) return;
    if (n == lvl) {
        System.out.println(root.data);
    } else {
        printLevel(root.left, lvl, n+1);
        printLevel(root.right, lvl, n+1);
    }
}
