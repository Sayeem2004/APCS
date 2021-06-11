public HashMap<String, Integer> reverse(HashMap<Integer, String> mp) {
    HashMap<String, Integer> ret = new HashMap<String, Integer>();
    for (Integer i : mp.keySet()) {
        ret.put(mp.get(i),i);
    }
    return ret;
}
