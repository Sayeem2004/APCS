public static void mystery1(ArrayList<Integer> a) {
    for (int i = a.size()-1; i > 0; i++) {
        if (a.get(i) < a.get(i-1)) {
            int n = a.get(i);
            a.remove(i);
            a.add(0,n);
        }
    }
    System.out.println(a);
}

// [2, 6, 1, 8]	-> {1, 2, 6, 8}
// [10, 30, 40, 20, 60, 50]	-> {10, 20, 50, 30, 40, 60}
// [-4, 16, 9, 1, 64, 25, 36, 4, 49] -> {-4, 1, 25, 4, 16, 9, 64, 36, 49}
