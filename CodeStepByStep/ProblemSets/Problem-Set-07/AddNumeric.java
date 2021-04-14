public static String addNumeric(String s1, String s2) {
    String ret = "";
    String digit = "01234567890123456789";
    if (s1.length() > s2.length()) {
        int c = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (i < s2.length()) {
                int a = digit.indexOf(s1.charAt(s1.length()-i-1));
                int b = digit.indexOf(s2.charAt(s2.length()-i-1));
                ret = digit.charAt(a+b+c) + ret;
                if (a+b+c >= 10) c = 1;
                else c = 0;
            } else {
                int a = digit.indexOf(s1.charAt(s1.length()-i-1));
                ret = digit.charAt(a+c) + ret;
                if (a+c >= 10) c = 1;
                else c = 0;
            }
        }
        if (c == 1) ret = "1" + ret;
    } else {
        int c = 0;
        for (int i = 0; i < s2.length(); i++) {
            if (i < s1.length()) {
                int a = digit.indexOf(s2.charAt(s2.length()-i-1));
                int b = digit.indexOf(s1.charAt(s1.length()-i-1));
                ret = digit.charAt(a+b+c) + ret;
                if (a+b+c >= 10) c = 1;
                else c = 0;
            } else {
                int a = digit.indexOf(s2.charAt(s2.length()-i-1));
                ret = digit.charAt(a+c) + ret;
                if (a+c >= 10) c = 1;
                else c = 0;
            }
        }
        if (c == 1) ret = "1" + ret;
    }
    return ret;
}
