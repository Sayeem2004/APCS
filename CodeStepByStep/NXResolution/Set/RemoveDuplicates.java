public void removeDuplicates(List<Integer> lt) {
    Set<Integer> s = new HashSet<Integer>();
    for (int i = 0; i < lt.size(); i++) {
        if (s.contains(lt.get(i))) {
            lt.remove(i);
            i--;
        } else {
            s.add(lt.get(i));
        }
    }
}
