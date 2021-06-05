public TreeNode completeToLevel(TreeNode root, int n) {
    if (n > 0) {
        if (root == null) {
            return new TreeNode(-1, completeToLevel(null, n-1),  completeToLevel(null, n-1));
        } else {
            root.left = completeToLevel(root.left, n-1);
            root.right = completeToLevel(root.right, n-1);
            return root;
        }
    } else {
        return root;
    }
}
