public TreeNode limitPathSum(TreeNode root, int max) {
    return limitPathSum(root, max, 0);
}

public TreeNode limitPathSum(TreeNode root, int max, int sum) {
    if (root == null) return null;
    sum += root.data;
    if (sum > max) return null;
    else {
        root.left = limitPathSum(root.left, max, sum);
        root.right = limitPathSum(root.right, max, sum);
        return root;
    }
}
