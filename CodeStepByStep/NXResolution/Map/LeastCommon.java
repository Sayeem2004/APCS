public int leastCommon(Map<String, Integer> mp) {
    if (mp.isEmpty()) throw new IllegalArgumentException();
    Map<Integer, Integer> temp = new HashMap<Integer, Integer>();
    for (String x : mp.keySet()) {
        if (temp.containsKey(mp.get(x))) {
            temp.put(mp.get(x), temp.get(mp.get(x))+1);
        } else {
            temp.put(mp.get(x), 1);
        }
    }
    int mn = Integer.MAX_VALUE, count = Integer.MAX_VALUE;
    for (Integer x : temp.keySet()) {
        if (temp.get(x) < count) {
            mn = x;
            count = temp.get(x);
        } else if (temp.get(x) == count && x < mn) {
            mn = x;
        }
    }
    return mn;
}
