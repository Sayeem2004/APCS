public static boolean isHappyNumber(int n) {
    Set<Integer> s = new HashSet<Integer>();
    int curr = n;
    while (!s.contains(curr)) {
        int sum = 0;
        int c = curr;
        while (c != 0) {
            sum += (c%10) * (c%10);
            c /= 10;
        }
        if (sum == 1) return true;
        else s.add(curr);
        curr = sum;
    }
    return false;
}
