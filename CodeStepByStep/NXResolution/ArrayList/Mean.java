public double mean(ArrayList<Double> v) {
    double sum = 0;
    for (int i = 0; i < v.size(); i++) {
        sum += v.get(i);
    }
    if (v.size() == 0) return 0;
    return sum / v.size();
}
