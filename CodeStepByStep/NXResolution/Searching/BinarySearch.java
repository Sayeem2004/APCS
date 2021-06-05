public static int binarySearch(int[] a, int n) {
    return binarySearch(a, n, 0, a.length-1);
}
public static int binarySearch(int[] a, int n, int s, int e) {
    if (s > e) return -1;
    if (a[(s+e)/2] == n) return (s+e)/2;
    else if (a[(s+e)/2] < n) return binarySearch(a, n, (s+e)/2+1, e);
    else return binarySearch(a, n, s, (s+e)/2-1);

}
