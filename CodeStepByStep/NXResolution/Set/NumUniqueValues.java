public static int numUniqueValues(List<Integer> l) {
    Set<Integer> s = new HashSet<Integer>();
    for (Integer x : l) {
        s.add(x);
    }
    return s.size();
}
