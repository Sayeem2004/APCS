public static int maxLength(Set<String> set) {
    int mx = 0;
    for (String s : set) {
        mx = Math.max(mx,s.length());
    }
    return mx;
}
