public static ArrayList<Integer> indexOfAll(ArrayList<Integer> list, ArrayList<Integer> sublist) {
    ArrayList<Integer> ret =  new ArrayList<Integer>();
    int l = list.size(), s = sublist.size();
    for (int i = 0; i <= l-s; i++) {
        boolean add = true;
        for (int q = 0; q < s; q++) {
            if (list.get(i+q) != sublist.get(q))
                add = false;
        }
        if (add) ret.add(i);
    }
    return ret;
}
