public static void collectionMystery1(ArrayList<Integer> list) {
    for (int i = 0; i < list.size(); i++) {
        int n = list.get(i);
        list.remove(i);
        if (n % 2 == 0) {
            list.add(i);
        }
    }
}

// {5, 2, 5, 2} -> {2, 2}
// {3, 5, 8, 9, 2} -> {5, 9, 1, 3}
// {0, 1, 4, 3, 1, 3} -> {1, 3, 3, 1}
