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
