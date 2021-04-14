public static void removeConsecutiveDuplicates(ArrayList<Integer> list) {
    int i = 0;
    while (i < list.size()-1) {
        if (list.get(i) == list.get(i+1)) {
            list.remove(i);
            continue;
        }
        i++;
    }
}
