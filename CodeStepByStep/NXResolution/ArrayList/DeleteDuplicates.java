public void deleteDuplicates(ArrayList<String> a) {
    for (int i = 0; i < a.size(); i++) {
        if (a.indexOf(a.get(i)) != i) {
            a.remove(i);
            i--;
        }
    }
}
