/****************************************************************************************************
    Name: Mohammad Khan

    Compilation: javac Divisors.java
    Execution: java Divisors a b
    Dependencies: none

    Notes: Prints the output of various divisor related functions with inputs a and b.

    > java Divisors 1440 408
    gcd(1440, 408) = 24
    lcm(1440, 408) = 24480
    areRelativelyPrime(1440, 408) = false
    totient(1440) = 384
    totient(408) = 128

    > java Divisors 987 610
    gcd(987, 610) = 1
    lcm(987, 610) = 602070
    areRelativelyPrime(987, 610) = true
    totient(987) = 552
    totient(610) = 240
****************************************************************************************************/

public class Divisors {
    // Returns the greatest common divisor of a and b.
    public static int gcd(int a, int b) {
        if (a == 0) return b;
        if (b == 0) return a;
        int x = Math.max(Math.abs(a),Math.abs(b));
        int y = Math.min(Math.abs(a),Math.abs(b));
        return gcd(y,x%y);
    }
    // Returns the least common multiple of a and b.
    public static int lcm(int a, int b) {
        if (a == 0 || b == 0) return 0;
        int x = Math.abs(a);
        int y = Math.abs(b);
        return (y / gcd(x,y)) * x;
    }
    // Returns true if a and b are relatively prime; false otherwise.
    public static boolean areRelativelyPrime(int a, int b) {
        int x = Math.abs(a);
        int y = Math.abs(b);
        return (gcd(x,y) == 1 ? true : false);
    }
    // Returns the number of integers between 1 and n that are relatively prime with n.
    public static int totient(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            count += (gcd(n,i) == 1 ? 1 : 0);
        }
        return count;
    }
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        System.out.println("gcd(" + a + ", " + b + ") = " + gcd(a,b));
        System.out.println("lcm(" + a + ", " + b + ") = " + lcm(a,b));
        System.out.println("areRelativelyPrime(" + a + ", " + b + ") = " + areRelativelyPrime(a,b));
        System.out.println("totient(" + a + ") = " + totient(a));
        System.out.println("totient(" + b + ") = " + totient(b));
    }
}
