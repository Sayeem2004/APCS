public void printLeaves(TreeNode root) {
    printLeaves(root, true);
}

public void printLeaves(TreeNode root, boolean b) {
    if (root == null) {
        System.out.print("no leaves");
        return;
    } else {
        if (b) System.out.print("leaves: ");
        if (root.right != null) printLeaves(root.right, false);
        if (root.left != null) printLeaves(root.left, false);
        if (root.left == null && root.right == null)
            System.out.print(root.data + " ");
    }
}
