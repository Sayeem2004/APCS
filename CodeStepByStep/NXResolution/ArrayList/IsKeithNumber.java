public static boolean isKeithNumber(int n) {
    ArrayList<Integer> temp = new ArrayList<Integer>();
    String str = Integer.toString(n);
    int s = str.length();
    for (int i = 0; i < s; i++) {
        temp.add(Character.getNumericValue(str.charAt(i)));
    }
    while (temp.get(temp.size()-1) < n) {
        int sum = 0;
        for (int i = 0; i < s; i++) {
            sum += temp.get(temp.size()-1-i);
        }
        temp.add(sum);
    }
    if (temp.get(temp.size()-1) == n)
        return true;
    return false;
}
