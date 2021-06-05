public boolean isFull(TreeNode root) {
    if (root == null) return true;
    boolean ret = true;
    ret = ret & isFull(root.left);
    ret = ret & isFull(root.right);
    if (root.left != null && root.right == null) ret = false;
    if (root.left == null && root.right != null) ret = false;
    return ret;
}
