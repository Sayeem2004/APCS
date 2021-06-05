public static void arrayListMystery1(ArrayList<Integer> v) {
    for (int i = 0; i < v.size(); i++) {
        int n = v.get(i);
        if (n % 10 == 0) {
            v.remove(i);
            v.add(n);
        }
        System.out.println(v);
    }
}

// {1, 20, 3, 40} -> {1, 3, 20, 40}
// {80, 3, 40, 20, 7} -> {3, 20, 7, 40, 80}
// {40, 20, 60, 1, 80, 30} -> {20, 1, 30, 60, 40, 80}
