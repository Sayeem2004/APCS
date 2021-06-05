public void removeRange(Set<Integer> s, int min, int max) {
    Set<Integer> s2 = new HashSet<Integer>();
    for (int x : s) {
        if (x >= min && x <= max) s2.add(x);
    }
    for (int x : s2) {
        s.remove(x);
    }
}
