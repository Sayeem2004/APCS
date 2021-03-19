public void countToBy(int n, int m) {
    if (n < 1 || m < 1) throw new IllegalArgumentException();
    if (n <= m) {
        System.out.print(n);
        return;
    }
    countToBy(n-m,m);
    System.out.print(", " + n);
}
