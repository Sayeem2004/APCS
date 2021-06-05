public String toString(TreeNode root) {
    if (root == null) return "empty";
    if (root.left == null && root.right == null) return Integer.toString(root.data);
    String ret = "(" + root.data + ", ";
    ret += toString(root.left) + ", ";
    ret += toString(root.right) + ")";
    return ret;
}
