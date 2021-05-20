public class Hailstone {
    // Part A
    public static int hailstoneLength(int n) {
        int length = 1;
        while (n != 1) {
            if (n % 2 == 0) n /= 2;
            else {
                 n *= 3;
                 n++;
             }
             length++;
         }
         return length;
    }

    // Part B
    public static boolean isLongSeq(int n) {
        if (hailstoneLength(n) > n) return true;
        return false;
    }

    // Part C
    public static double propLong(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (isLongSeq(i)) count++;
        }
        return 1.0 * count / n;
    }
}
