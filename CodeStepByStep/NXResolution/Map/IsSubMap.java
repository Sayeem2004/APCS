public boolean isSubMap(Map<String, String> sp, Map<String, String> mp) {
    for (String s : sp.keySet()) {
        if (!mp.containsKey(s)) return false;
        if (!mp.get(s).equals(sp.get(s))) return false;
    }
    return true;
}
