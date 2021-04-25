// part A
public static void longestStreak(String str) {
    int pos = 0, len = 0;
    int p = 0, temp = 0;
    for (int i = 0; i < str.length(); i++) {
        if (i == 0) {
            temp++;
        } else {
            if (str.charAt(i) == str.charAt(i-1)) temp++;
            else {
                temp = 1; p = i;
            }
        }
        if (temp > len) {
            pos = p;
            len = temp;
        }
    }
    System.out.println(str.charAt(pos) + " " + len);
}
