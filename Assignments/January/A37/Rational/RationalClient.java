/****************************************************************************************************
    Names: Mohammad Khan & Bryan Zhang

    Compilation: javac RationalClient.java
    Execution: java RationalClient
    Dependencies: Rational.java

    Notes: Prints a bunch of tests for the Rational class.

    > java RationalClient
    Rational() = 0/1
    Rational(0,3) = 0/1
    Rational(0) =  0/1
    Rational(0,-3) = 0/1

    Rational(1,3) = 1/3
    Rational(-1,3) = -1/3
    Rational(1,-3) = -1/3
    Rational(-1,-3) = 1/3

    a = 1/2
    b = 1/3
    c = 1/4
    d = 1/5
    a + b + c + d = 77/60
    a(b + c) - d = 11/120
    (a + b) / (c + d) = 50/27

    ArrayList = [1/2, 1/3, 1/4, 1/5]
    summation(ArrayList) = 77/60

    e = -15/4
    e.invert() = -4/15
    e.negated() = 15/4
    e.abs() = 15/4
    e.doubleValue() = -3.75

    Term   Sum                  Double Sum
    --------------------------------------
    0      0/1                  0.00000000
    1      1/1                  1.00000000
    2      2/1                  2.00000000
    3      5/2                  2.50000000
    4      8/3                  2.66666667
    5      65/24                2.70833333
    6      163/60               2.71666667
    7      1957/720             2.71805556
    8      685/252              2.71825397
    9      109601/40320         2.71827877
    10     1454877/2273984      0.63979210

    Array = [1/2, 1/3, 1/4, 1/5, -15/4, 77/60, 11/120]
    Key = 77/60
    linearSearch(Array,Key) = 5
    Key2 = 50/27
    linearSearch(Array,Key2) = -1

    Arr = [1/2, 1/3, 1/4, 1/5, 77/60, 11/120, 1/2]
    Arr.contains(new Rational(1,2)) = true
    f = 1/2
    Arr.get(0).equals(f) = true
    Arr.get(1).equals(f) = false
    Arr.get(2).equals(f) = false
    Arr.get(3).equals(f) = false
    Arr.get(4).equals(f) = false
    Arr.get(5).equals(f) = false
    Arr.get(6).equals(f) = true

****************************************************************************************************/
import java.util.*;

public class RationalClient {
    public static Rational summation(ArrayList<Rational> rats) {
        Rational sum = new Rational();
        for (int i = 0; i < rats.size(); i++) {
            sum = sum.plus(rats.get(i));
        }
        return sum;
    }
    public static int linearSearch(Rational[] rats, Rational key) {
        int ret = -1;
        for (int i = 0; i < rats.length; i++) {
            if (rats[i].equals(key)) {
                return i;
            }
        }
        return ret;
    }
    public static int factorial(int n) {
        if (n < 0) return -1;
        if (n == 0 || n == 1) return 1;
        return n * factorial(n - 1);
    }
    public static void main(String[] args) {
        // 10. Test that your code enforces that only 1 value of zero exists.
        System.out.println("Rational() = " + new Rational());
        System.out.println("Rational(0,3) = " + new Rational(0,3));
        System.out.println("Rational(0) =  " + new Rational(0));
        System.out.println("Rational(0,-3) = " + new Rational(0,-3));
        System.out.println();

        // 11. For negative rational numbers, the negation sign should only be associated with the numerator.
        System.out.println("Rational(1,3) = " + new Rational(1,3));
        System.out.println("Rational(-1,3) = " + new Rational(-1,3));
        System.out.println("Rational(1,-3) = " + new Rational(1,-3));
        System.out.println("Rational(-1,-3) = " + new Rational(-1,-3));
        System.out.println();

        // 12. Assume a, b, c, and d are references to rational objects, write the Java code to represent each of
        // the following expressions.
        Rational a = new Rational(1,2);
        Rational b = new Rational(1,3);
        Rational c = new Rational(1,4);
        Rational d = new Rational(1,5);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        Rational sum = a.plus(b.plus(c.plus(d)));
        System.out.println("a + b + c + d = " + sum);
        Rational sum2 = a.times(b).plus(a.times(c)).minus(d);
        System.out.println("a(b + c) - d = " + sum2);
        Rational sum3 = a.plus(b).dividesBy(c.plus(d));
        System.out.println("(a + b) / (c + d) = " + sum3);
        System.out.println();

        // 13. Assume rats is an ArrayList of Rational numbers, write code to compute the sum of the rationals from list rats.
        ArrayList<Rational> rats = new ArrayList<Rational>();
        rats.add(a); rats.add(b); rats.add(c); rats.add(d);
        System.out.println("Arr = " + rats);
        System.out.println("summation(Arr) = " + summation(rats));
        System.out.println();

        // Testing out methods from 14.
        Rational e = new Rational(-15,4);
        System.out.println("e = " + e);
        System.out.println("e.invert() = "+ e.invert());
        System.out.println("e.negated() = " + e.negated());
        System.out.println("e.abs() = " + e.abs());
        System.out.println("e.doubleValue() = " + e.doubleValue());
        System.out.println();

        // 15. Write a code to approximate e using first 10 terms of the Taylor series:
        Rational sum4 = new Rational();
        System.out.println("Term   Sum                  Double Sum");
        System.out.println("--------------------------------------");
        System.out.println("0      0/1                  0.00000000");
        for (int i = 0; i < 10; i++) {
            Rational temp = new Rational(1,factorial(i));
            sum4 = sum4.plus(temp);
            System.out.printf("%-7d",i+1);
            System.out.printf("%-21s",sum4);
            System.out.printf("%-10.8f \n",sum4.doubleValue());
        }
        System.out.println();

        // 17. Test your code with a static method int linearSearch(Rational[] rats, Rational key)
        // that returns the index of the first occurrence of key in the [] or -1 if not found.
        Rational[] arr = {a,b,c,d,e,sum,sum2};
        System.out.print("Array = [");
        for (int i = 0; i < 6; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println(sum2 + "]");
        System.out.println("Key = " + sum);
        System.out.println("linearSearch(Array,Key) = " + linearSearch(arr,sum));
        System.out.println("Key2 = " + sum3);
        System.out.println("linearSearch(Array,Key2) = " + linearSearch(arr,sum3));
        System.out.println();

        // 18. Test that your class works nicely with the ArrayList class, test your equals method
        // by using the contains method of the Arraylist class.
        ArrayList<Rational> r = new ArrayList<Rational>();
        r.add(a); r.add(b); r.add(c); r.add(d); r.add(sum); r.add(sum2); r.add(a);
        System.out.println("Arr = " + r);
        System.out.println("Arr.contains(new Rational(1,2)) = " + r.contains(new Rational(1,2)));
        Rational f = new Rational(1,2);
        System.out.println("f = " + f);
        for (int i = 0; i < r.size(); i++) {
            System.out.println("Arr.get(" + i + ").equals(f) = " + r.get(i).equals(f));
        }
        System.out.println();
    }
}
