public static void removeBadPairs(ArrayList<Integer> arr) {
    for (int i = 1; i < arr.size(); i++) {
        if (i%2 == 1 && arr.get(i) < arr.get(i-1)) {
            arr.remove(i); arr.remove(i-1); i-=2;
        }
    }
    if (arr.size()%2 == 1) arr.remove(arr.size()-1);
}
