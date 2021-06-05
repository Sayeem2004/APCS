public boolean hasThree(ArrayList<String> arr) {
    Map<String, Integer> mp = new HashMap<String, Integer>();
    for (String x : arr) {
        if (mp.containsKey(x)) {
            mp.put(x, mp.get(x)+1);
        } else {
            mp.put(x, 1);
        }
    }
    for (String x : mp.keySet()) {
        if (mp.get(x) >= 3) return true;
    }
    return false;
}
