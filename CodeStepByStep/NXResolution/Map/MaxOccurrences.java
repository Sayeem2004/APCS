public int maxOccurrences(ArrayList<Integer> list) {
    HashMap<Integer, Integer> temp = new HashMap<Integer, Integer>();
    for (Integer i : list) {
        if (temp.containsKey(i))
            temp.put(i, temp.get(i)+1);
        else
            temp.put(i, 1);
    }
    int mx = 0;
    for (Integer i : temp.keySet()) {
        mx = Math.max(temp.get(i), mx);
    }
    return mx;
}
