public void cumulative(ArrayList<Integer> v) {
    for (int i = 1; i < v.size(); i++) {
        v.set(i,v.get(i)+v.get(i-1));
    }
}
