public static void collectionMystery4(ArrayList<Integer> v) {
    for (int i = 0; i < v.size(); i+= 2) {
        if (v.get(i-1) >= v.get(i)) {
            v.remove(i);
            v.add(0,0);
        }
    }
    System.out.println(v);
}

// {10, 20, 10, 5} -> {0, 10, 20, 10}
// {8, 2, 9, 7, -1, 55} -> {0, 0, 8, 9, -1, 55}
// {0, 16, 9, 1, 64, 25, 25, 14, 0}	-> {0, 0, 0, 0, 16, 9, 64, 25, 0}
