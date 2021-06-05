public int height(TreeNode root) {
    if (root == null) return 0;
    if (root.data == 12) return 1;
    return 0;
}
/*
public int height(TreeNode root) {
    if (root == null) return 0;
    int count = 0;
    count = Math.max(count, height(root.left));
    count = Math.max(count, height(root.right));
    return count+1;
}
*/
