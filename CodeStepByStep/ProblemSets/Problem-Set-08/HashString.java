public static String hashString(int k) {
    if (k < 0) throw new IllegalArgumentException();
    if (k == 0) return "#";
    return hashString(k-1)+hashString(k-1);
}
