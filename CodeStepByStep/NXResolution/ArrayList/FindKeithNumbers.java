public static void findKeithNumbers(int mn, int mx) {
    for (int i = mn; i <= mx; i++) {
        ArrayList<Integer> list = checkKeithNumber(i);
        String str = Integer.toString(i);
        if (list.size() >= str.length()) {
            System.out.println(i + ": " + list);
        }
    }
}

public static ArrayList<Integer> checkKeithNumber(int n) {
    ArrayList<Integer> ret = new ArrayList<Integer>();
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
    if (temp.get(temp.size()-1) == n) {
        return temp;
    } else {
        return ret;
    }
}
