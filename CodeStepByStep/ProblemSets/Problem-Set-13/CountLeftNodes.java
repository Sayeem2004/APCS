public int countLeftNodes(TreeNode root) {
    return countLeftNodes(root, false);
}

public int countLeftNodes(TreeNode root, boolean b) {
    if (root == null) return 0;
    int count = 0;
    count += countLeftNodes(root.left, true);
    count += countLeftNodes(root.right, false);
    if (b == true) count++;
    return count;
}
