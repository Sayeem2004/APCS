public int tiltSum(TreeNode root) {
    int[] ret = tiltSum(root, 0);
    return ret[0];
}

public int[] tiltSum(TreeNode root, int t) {
    if (root == null) {
        int[] ret = {0,0};
        return ret;
    }
    int[] a = tiltSum(root.left, 0);
    int[] b = tiltSum(root.right, 0);
    int[] ret = {a[0]+b[0]+Math.abs(a[1]-b[1]), a[1]+b[1]+root.data};
    return ret;
}
