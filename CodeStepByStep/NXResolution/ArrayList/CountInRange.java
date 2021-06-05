public int countInRange(ArrayList<Integer> v, int min, int max) {
    int count = 0;
    for (int i = 0; i < v.size(); i++) {
        if (v.get(i) >= min && v.get(i) <= max) count++;
    }
    return count;
}





S
