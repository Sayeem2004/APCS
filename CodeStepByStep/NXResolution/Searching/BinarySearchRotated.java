public static int binarySearchRotated(int[] a, int target) {
    int l = 0, r = a.length, m = 0;
    int pivot = -1;
    while (l < r) {
        m = (l+r)/2;
        if (a.length-1 > m && a[m] > a[m+1]) {
            pivot = m; break;
        }
        if (0 < m && a[m] < a[m-1]) {
            pivot = m-1; break;
        }
        if (a[l] > a[m]) r = m-1;
        else l = m+1;
    }
    l = 0; r = a.length; m = 0;
    while (l <= r) {
        m = (l+r)/2;
        if (m < 0 || m >= a.length) return -1;
        if (a[(m+pivot+1)%a.length] == target) return (m+pivot+1)%a.length;
        if (a[(m+pivot+1)%a.length] > target) r = m-1;
        if (a[(m+pivot+1)%a.length] < target) l = m+1;
    }
    m = (l+r)/2;
    if (a[(m+pivot+1)%a.length] != target) return -1;
    else return (m+pivot+1)%a.length;
}
