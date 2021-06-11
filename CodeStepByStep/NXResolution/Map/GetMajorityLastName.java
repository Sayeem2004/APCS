public String getMajorityLastName(HashMap<String, String> mp) {
    HashMap<String, Integer> count = new HashMap<String, Integer>();
    for (String s : mp.keySet()) {
        if (count.containsKey(mp.get(s))) {
            count.put(mp.get(s), count.get(mp.get(s))+1);
        } else {
            count.put(mp.get(s), 1);
        }
    }
    for (String s : count.keySet()) {
        if (count.get(s) > mp.size()/2) {
            return s;
        }
    }
    return "?";
}
