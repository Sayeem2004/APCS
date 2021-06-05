public TreeNode construct(int n) {
    if (n < 0) throw new IllegalArgumentException();
    if (n == 0) return null;
    return construct(0,n-1);
}

public TreeNode construct(int l, int r) {
    if (l == r) return new TreeNode(r);
    int m = (l+r)/2;
    if (m == l) return new TreeNode(m, null, new TreeNode(r));
    if (m == r) return new TreeNode(m, null, new TreeNode(l));
    return new TreeNode(m, construct(l, m-1), construct(m+1,r));
}
