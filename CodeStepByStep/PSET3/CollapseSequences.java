public String collapseSequences(String s, char c) {
    if (s.length() == 0) return "";
    if (s.length() == 1) return s;
    if (s.charAt(0) == c) {
        if (s.charAt(1) != c)
            return c + collapseSequences(s.substring(1),c);
        else
            return collapseSequences(s.substring(1),c);
    }
    return s.charAt(0) + collapseSequences(s.substring(1),c);
}
