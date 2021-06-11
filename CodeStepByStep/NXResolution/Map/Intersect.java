public HashMap<String, Integer> intersect(HashMap<String, Integer> m1, HashMap<String, Integer> m2) {
    HashMap<String, Integer> ret = new HashMap<String, Integer>();
    for (String s : m1.keySet()) {
        if (!m2.containsKey(s)) continue;
        if (m1.get(s) == m2.get(s)) ret.put(s, m1.get(s));
    }
    return ret;
}
