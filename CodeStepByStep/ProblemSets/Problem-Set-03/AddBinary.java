public String addBinary(String a, String b) {
    int dif = Math.abs(a.length() - b.length());
    char[] temp = new char[dif];
    Arrays.fill(temp, '0');
    String s = new String(temp);
    if (a.length() < b.length()) a = s + a;
    else b = s + b;
    int n = a.length();
    char[] ret = new char[n];
    boolean c = false;
    for (int i = n-1; i >= 0; i--) {
        if (!c) {
            if (a.charAt(i) == '1' && b.charAt(i) == '1') {
                ret[i] = '0'; c = true;
            } else if (a.charAt(i) == b.charAt(i)) {
                ret[i] = '0';
            } else {
                ret[i] = '1';
            }
        } else {
            if (a.charAt(i) == '1' && b.charAt(i) == '1') {
                ret[i] = '1'; c = true;
            } else if (a.charAt(i) == b.charAt(i)) {
                ret[i] = '1'; c = false;
            } else {
                ret[i] = '0'; c = true;
            }
        }
    }
    if (c) return "1" + new String(ret);
    else return new String(ret);
}
