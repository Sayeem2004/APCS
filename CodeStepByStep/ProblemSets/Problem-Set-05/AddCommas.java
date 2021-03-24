public static String addCommas(String s) {
    String ret = "";
    for (int i = 1; i <= s.length(); i++) {
        ret = s.charAt(s.length()-i) + ret;
        if (i%3 == 0 && i != s.length())
            ret = "," + ret;
    }
    return ret;
}
