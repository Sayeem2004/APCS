public ArrayList<Integer> intersect(ArrayList<Integer> v1, ArrayList<Integer> v2) {
    ArrayList<Integer> ret = new ArrayList<Integer>();
    for (int i = 0; i < v1.size(); i++) {
        if (v2.indexOf(v1.get(i)) != -1) ret.add(v1.get(i));
    }
    return ret;
}
