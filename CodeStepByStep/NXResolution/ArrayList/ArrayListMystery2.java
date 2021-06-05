public static void mystery(ArrayList<Integer> list) {
    for (int i = 0; i < list.size(); i++) {
        int n = list.get(i);
        if (n % 10 == 0) {
            list.remove(i);
            list.add(n);
        }
    }
    System.out.println(list);
}

// [1, 20, 3, 40] -> {1, 3, 20, 40}
// [80, 3, 40, 20, 7] -> {3, 20, 7, 40, 80}
// [40, 20, 60, 1, 80, 30] -> {20, 1, 30, 60, 40, 80}
