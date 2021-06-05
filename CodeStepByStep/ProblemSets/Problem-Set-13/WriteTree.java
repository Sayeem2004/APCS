public void writeTree(TreeNode root) {
    if (root == null) return;
    if (root.left == null && root.right == null) {
        System.out.println("0 " + root.data);
        return;
    }
    if (root.left != null && root.right != null) {
        System.out.println("3 " + root.data);
        writeTree(root.left);
        writeTree(root.right);
        return;
    }
    if (root.left != null) {
        System.out.println("1 " + root.data);
        writeTree(root.left);
        return;
    }
    if (root.right != null) {
        System.out.println("2 " + root.data);
        writeTree(root.right);
        return;
    }
}
