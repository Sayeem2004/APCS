public static int numInCommon(List<Integer> l1, List<Integer> l2) {
    Set<Integer> s1 = new HashSet<Integer>();
    Set<Integer> s2 = new HashSet<Integer>();
    for (Integer x : l1) s1.add(x);
    for (Integer x : l2) s2.add(x);
    int count = 0;
    for (Integer x : s1) {
        if (s2.contains(x)) count++;
    }
    return count;
}
