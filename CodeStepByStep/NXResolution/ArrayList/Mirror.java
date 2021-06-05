public void mirror(ArrayList<String> a) {
    int n = a.size();
    for (int i = 0; i < n; i++) {
        a.add(n,a.get(i));
    }
}
