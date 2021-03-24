public static boolean digitsSorted(int n) {
    if (n/10 == 0) return true;
    if (Math.abs(n%10) >= Math.abs(n/10%10))
        return digitsSorted(n/10);
    return false;
}
