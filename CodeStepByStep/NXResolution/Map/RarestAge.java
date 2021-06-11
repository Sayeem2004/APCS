public int rarestAge(HashMap<String, Integer> mp) {
    HashMap<Integer, Integer> temp = new HashMap<Integer, Integer>();
    for (String s : mp.keySet()) {
        if (temp.containsKey(mp.get(s))) {
            temp.put(mp.get(s), temp.get(mp.get(s))+1);
        } else {
            temp.put(mp.get(s), 1);
        }
    }
    int mx = 0;
    int cnt = Integer.MAX_VALUE;
    for (Integer i : temp.keySet()) {
        if (temp.get(i) < cnt) {
            mx = i;
            cnt = temp.get(i);
            continue;
        }
        if (temp.get(i) == cnt) {
            if (i < mx) {
                mx = i;
            }
        }
    }
    return mx;
}
