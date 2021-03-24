public static void hanoi(int n, int s1, int s2) {
        if (n == 1) {
            System.out.println("move disk " + n + " from peg " + s1 + " to peg " + s2);
        } else {
            hanoi(n-1,s1,6-(s1+s2));
            System.out.println("move disk " + n + " from peg " + s1 + " to peg " + s2);
            hanoi(n-1,6-(s1+s2),s2);
        }
    }
