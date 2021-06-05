public boolean hasDuplicateValue(Map<String, String> mp) {
    ArrayList<String> arr = new ArrayList<String>(mp.values());
    for (int i = 0; i < arr.size(); i++) {
        if (arr.indexOf(arr.get(i)) != i) return true;
    }
    return false;
}
