public ArrayList<ArrayList<Integer>> insertInterval(ArrayList<ArrayList<Integer>> intervals, ArrayList<Integer> interval) {
    int n = intervals.size();
    for (int i = 0; i < n; i++) {
        if (intervals.get(i).get(0) >= interval.get(0)) {
            intervals.add(i, interval);
            break;
        }
    }
    if (n == intervals.size()) intervals.add(interval);
    return mergeIntervals(intervals);
}

public ArrayList<ArrayList<Integer>> mergeIntervals(ArrayList<ArrayList<Integer>> intervals) {
    ArrayList<ArrayList<Integer>> temp = intervals;
    for (int i = 0; i < temp.size()-1; i++) {
        ArrayList<Integer> int1 = temp.get(i);
        ArrayList<Integer> int2 = temp.get(i+1);
        if (int1.get(1) >= int2.get(0)) {
            if (int1.get(1) > int2.get(1)) {
                ArrayList<Integer> int3 = new ArrayList<Integer>();
                int3.add(int1.get(0));
                int3.add(int1.get(1));
                temp.set(i, int3);
                temp.remove(i+1);
                i--;
            } else {
                ArrayList<Integer> int3 = new ArrayList<Integer>();
                int3.add(int1.get(0));
                int3.add(int2.get(1));
                temp.set(i, int3);
                temp.remove(i+1);
                i--;
            }
        }
    }
    return temp;
}
