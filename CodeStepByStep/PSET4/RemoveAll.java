public void removeAll(ArrayList<String> arr, String rem) {
    while (arr.indexOf(rem) != -1) {
        arr.remove(arr.indexOf(rem));
    }
}
