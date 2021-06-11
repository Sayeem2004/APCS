public TreeMap<Integer, String> lastNamesByAge(TreeMap<String, Integer> mp, int mn, int mx) {
    TreeMap<Integer, String> ret = new TreeMap<Integer, String>();
    for (String s : mp.keySet()) {
        if (mp.get(s) >= mn && mp.get(s) <= mx) {
            String[] name = s.split(" ");
            String last = name[name.length-1];
            if (ret.containsKey(mp.get(s))) {
                ret.put(mp.get(s), ret.get(mp.get(s)) + " and " + last);
            } else {
                ret.put(mp.get(s), last);
            }
        }
    }
    return ret;
}
