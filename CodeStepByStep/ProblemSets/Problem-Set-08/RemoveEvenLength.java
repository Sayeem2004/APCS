public static void removeEvenLength(ArrayList<String> arr) {
    int i = 0;
    while (i < arr.size()) {
        if (arr.get(i).length() % 2 == 0) {
            arr.remove(i);
            i--;
        }
        i++;
    }
}
