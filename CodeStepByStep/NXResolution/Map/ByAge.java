public TreeMap<Integer, String> byAge(Map<String, Integer> mp, int mn, int mx) {
    TreeMap<Integer, String> ret = new TreeMap<Integer, String>();
    for (String s : mp.keySet()) {
        if (mp.get(s) >= mn && mp.get(s) <= mx) {
            if (ret.containsKey(mp.get(s))) {
                ret.put(mp.get(s), ret.get(mp.get(s)) + " and " + s);
            } else {
                ret.put(mp.get(s), s);
            }
        }
    }
    return ret;
}
