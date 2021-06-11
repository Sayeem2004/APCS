public HashSet<Integer> unionSets(HashSet<HashSet<Integer>> s) {
    HashSet<Integer> ret = new HashSet<Integer>();
    for (Set<Integer> x : s) {
        for (Integer y : x) {
            ret.add(y);
        }
    }
    return ret;
}
