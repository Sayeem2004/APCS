public int editDistance(String s1, String s2) {
    if (s1.length() == 0 || s2.length() == 0) return s2.length()+s1.length();
    return Math.min(1+editDistance(s1,s2.substring(1)),
                    Math.min(1+editDistance(s1.substring(1),s2),
                             (s1.charAt(0) == s2.charAt(0) ? 0 : 1)+editDistance(s1.substring(1),s2.substring(1))));
}
