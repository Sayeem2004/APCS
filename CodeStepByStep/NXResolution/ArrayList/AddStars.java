public void addStars(ArrayList<String> a) {
    for (int i = 0; i <= a.size(); i+=2) {
        a.add(i,"*");
    }
}
