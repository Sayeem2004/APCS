/****************************************************************************************************
    Name: Mohammad Khan, Dylan Hu, Asa Muhammad, Caroline Leung, Han Zhang, Jishan Chowdhury

    Compilation: javac TimeStrings.java
    Execution: java TimeStrings
    Dependencies: Stopwatch.java StdOut.java

    Notes:
    Part 1) String Creation Complexities
        A)  Create1

            Prediction: O(logN) because in every recursive call your dividing the size of the by 2.

            Result: Our data below shows that the order of growth is indeed O(logN) because although
            the time does increase as the size increases, it is too small of an increase to be O(N),
            so it has to be O(logN).

        B)  Create2

            Prediction: O(N^2) because there is one for loop and in that for loop a concatenation,
            which is O(N), occurs in every iteration, so the total time complexity is O(N^2).

            Result: Our data below shows that the order of growth is indeed O(N^2) because other
            than the outlier of 10000, the ratio between consecutive times is between 3 and 4.

        C)  Create3

            Prediction: O(NlogN) because it has a recursive depth of logN and has a concatenation
            in every recursive depth.

            Result: Our data below shows that the order of growth is indeed O(NlogN) because the
            ratio between consecutive times is approximately 2 and its larger than the 4th method
            which is O(N).

        D)  Create4

            Prediction: O(N) because it has one for loop and character replacement is constant time.

            Result: Our data below shows that the order of growth is indeed O(N) because the ratio
            between consecutive times is approximately 2.

    Part 2) String Reversal Complexities
        A)  Reverse1

            Prediction: O(N^2) because it has one for loop with concatenation in every iteration.

            Result: Our data below shows that the order of growth is indeed O(N^2) because the ratio
            between consecutive times, other than the outlier of the 10000, is approximately 4

        B)  Reverse2

            Prediction: O(NlogN) because it has a recursive depth of logN and in each recursive depth
            a concatenation of N is occuring.

            Result: Our data below shows that the order of growth is indeed O(NlogN) because the ratio
            between consecutive times is approximately 2 and the overall time is comparable to Create3
            which is also NlogN

    Part 3) Linear Reversal Algorithm
        The test cases below show that our linear reversal algorithm does indeed work and the time data
        shows that it has an order of growth of O(N) because ratio between consecutive times is
        approximately 2. Our solution is also similar to the one given in the book site.

    Part 4) Find Majority Element Algorithm
        The test cases below show that our find majority element does indeed work and there are only 3
        int initializations in the algorithm so it is indeed O(1) space. The time data below shows that
        this algorithm is also O(N) because the ration between consecutive times is approximately 2. The
        values in the original array are also never changed.

    > java TimeStrings
    Size            Create1         Create2         Create3         Create4
    10000           82.000000       58.000000       15.000000       0.000000
    20000           1.000000        25.000000       1.000000        1.000000
    40000           0.000000        77.000000       1.000000        2.000000
    80000           0.000000        305.000000      2.000000        1.000000
    160000          0.000000        978.000000      3.000000        0.000000
    320000          0.000000        3784.000000     5.000000        1.000000
    640000          1.000000        15731.000000    12.000000       1.000000
    1280000         1.000000        Took Too Long   26.000000       2.000000
    2560000         1.000000        Took Too Long   48.000000       3.000000
    5120000         1.000000        Took Too Long   91.000000       6.000000
    10240000        2.000000        Took Too Long   214.000000      12.000000
    20480000        2.000000        Took Too Long   378.000000      20.000000

    Size            Reverse1        Reverse2
    10000           38.000000       5.000000
    20000           15.000000       3.000000
    40000           65.000000       4.000000
    80000           229.000000      5.000000
    160000          908.000000      7.000000
    320000          3639.000000     12.000000
    640000          15203.000000    23.000000
    1280000         Took Too Long   46.000000
    2560000         Took Too Long   95.000000
    5120000         Took Too Long   187.000000
    10240000        Took Too Long   377.000000
    20480000        Took Too Long   749.000000

    S =                            LinearReverse(S) =
    S = A                          LinearReverse(S) = A
    S = AB                         LinearReverse(S) = BA
    S = ABCDEFGHIJKLMNOPQRSTUVWXYZ LinearReverse(S) = ZYXWVUTSRQPONMLKJIHGFEDCBA
    Size            LinearReverse
    10000           0.000000
    20000           1.000000
    40000           1.000000
    80000           0.000000
    160000          1.000000
    320000          1.000000
    640000          1.000000
    1280000         2.000000
    2560000         3.000000
    5120000         7.000000
    10240000        13.000000
    20480000        27.000000

    A = []                         FindMajorityElement(A) = -1
    A = [1]                        FindMajorityElement(A) = 1
    A = [2,2]                      FindMajorityElement(A) = 2
    A = [1,2,3]                    FindMajorityElement(A) = -1
    A = [2,2,4,4]                  FindMajorityElement(A) = -1
    A = [1,2,2,4,2,4,1,2,4,2,2,2]  FindMajorityElement(A) = 2
    Size            FindMajorityElement
    10000           1.000000
    20000           1.000000
    40000           0.000000
    80000           0.000000
    160000          1.000000
    320000          1.000000
    640000          1.000000
    1280000         2.000000
    2560000         4.000000
    5120000         7.000000
    10240000        13.000000
    20480000        25.000000
****************************************************************************************************/
public class TimeStrings {
    public static String method1(int n) {
        if (n == 0) return "";
        String temp = method1(n/2);
        if (n%2 == 0) return temp + temp;
        else          return temp + temp + "x";
    }

    public static String method2(int n) {
        String s = "";
        for (int i = 0; i < n; i++)
            s = s + "x";
        return s;
    }

    public static String method3(int n) {
        if (n == 0) return "";
        if (n == 1) return  "x";
        return method3(n/2) + method3(n - n / 2);
    }

    public static String method4(int n) {
        char [] temp = new char[n];
        for (int i  = 0; i < n; i++){
            temp[i] = 'x';
        }
        return new String(temp);
    }

    public static String reverse1(String s) {
        int n = s.length();
	    String reverse = "";
	    for (int i = 0; i < n; i++){
	     	reverse = s.charAt(i) + reverse;
	    }
	    return reverse;
    }

    public static String reverse2(String s) {
        int n = s.length();
	    if (n <= 1) return s;
	    String left = s.substring(0,n/2);
	    String right = s.substring(n/2, n);
	    return reverse2(right) + reverse2(left);
    }

    public static String linearReverse(String s) {
        char[] ret = new char[s.length()];
        for (int i = 0; i < s.length(); i++)
            ret[i] = s.charAt(s.length()-i-1);
        return new String(ret);
    }

    public static int findMajorityElement(int[] array) {
        if (array.length == 0) return -1;
        int count = 1, curr = array[0];
        for (int i = 1; i < array.length; i++) {
            if (curr == array[i]) count++;
            else count--;
            if (count == 0) {
                count = 1;
                curr = array[i];
            }
        }
        int freq = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == curr) freq++;
        }
        if (freq > array.length/2) return curr;
        else return -1;
    }

    public static String print(int[] array) {
        String ret = "[";
        for (int i = 0; i < array.length; i++) {
            ret += array[i];
            if (i != array.length-1) ret += ",";
        }
        return ret + "]";
    }

    public static void main(String[] args) {
        // Determing Time Complexity For 4 Different String Creation Methods
        System.out.printf("%-15s %-15s %-15s %-15s %-15s \n","Size","Create1","Create2","Create3","Create4");
        for (int i = 10000; i <= 20480000; i *= 2) {
            double[] times = new double[4];
            Stopwatch sw1 = new Stopwatch();
            String s1 = method1(i);
            times[0] = sw1.elapsedTime()*1000;
            if (i <= 640000) {
                Stopwatch sw2 = new Stopwatch();
                String s2 = method2(i);
                times[1] = sw2.elapsedTime()*1000;
            } else {
                times[1] = 0;
            }
            Stopwatch sw3 = new Stopwatch();
            String s3 = method3(i);
            times[2] = sw3.elapsedTime()*1000;
            Stopwatch sw4 = new Stopwatch();
            String s4 = method4(i);
            times[3] = sw4.elapsedTime()*1000;
            if (i <= 640000) {
                System.out.printf("%-15s %-15f %-15f %-15f %-15f \n",i,times[0],times[1],times[2],times[3]);
            } else {
                System.out.printf("%-15s %-15f %-15s %-15f %-15f \n",i,times[0],"Took Too Long",times[2],times[3]);
            }
        }
        System.out.println();

        // Determing Time Complexity For 2 Different String Reversal Methods
        System.out.printf("%-15s %-15s %-15s \n","Size","Reverse1","Reverse2");
        for (int i = 10000; i <= 20480000; i *= 2) {
            double[] times = new double[2];
            String s = new String(new char[i]).replace('\0', 'x');
            if (i <= 640000) {
                Stopwatch sw1 = new Stopwatch();
                String s1 = reverse1(s);
                times[0] = sw1.elapsedTime()*1000;
            } else {
                times[0] = 0;
            }
            Stopwatch sw2 = new Stopwatch();
            String s2 = reverse2(s);
            times[1] = sw2.elapsedTime()*1000;
            if (i <= 640000) {
                System.out.printf("%-15s %-15f %-15f \n",i,times[0],times[1]);
            } else {
                System.out.printf("%-15s %-15s %-15f \n",i,"Took Too Long",times[1]);
            }
        }
        System.out.println();

        // Showing That Our Reversal Algorithm Is Actually Linear And Testing It Out
        String s5 = "";
        System.out.printf("%-30s %-50s \n", "S = "+s5, "LinearReverse(S) = "+linearReverse(s5));
        String s6 = "A";
        System.out.printf("%-30s %-50s \n", "S = "+s6, "LinearReverse(S) = "+linearReverse(s6));
        String s7 = "AB";
        System.out.printf("%-30s %-50s \n", "S = "+s7, "LinearReverse(S) = "+linearReverse(s7));
        String s8 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.printf("%-30s %-50s \n", "S = "+s8, "LinearReverse(S) = "+linearReverse(s8));
        System.out.printf("%-15s %-15s \n","Size","LinearReverse");
        for (int i = 10000; i <= 20480000; i *= 2) {
            String s = new String(new char[i]).replace('\0', 'x');
            Stopwatch sw1 = new Stopwatch();
            String s1 = linearReverse(s);
            double time = sw1.elapsedTime()*1000;
            System.out.printf("%-15s %-15f \n",i,time);
        }
        System.out.println();

        // Testing Out Find Majority Element Algorithm And Finding Time Complexity
        int[] a1 = {};
        System.out.printf("%-30s %-50s \n", "A = "+print(a1), "FindMajorityElement(A) = "+findMajorityElement(a1));
        int[] a2 = {1};
        System.out.printf("%-30s %-50s \n", "A = "+print(a2), "FindMajorityElement(A) = "+findMajorityElement(a2));
        int[] a3 = {2, 2};
        System.out.printf("%-30s %-50s \n", "A = "+print(a3), "FindMajorityElement(A) = "+findMajorityElement(a3));
        int[] a4 = {1, 2, 3};
        System.out.printf("%-30s %-50s \n", "A = "+print(a4), "FindMajorityElement(A) = "+findMajorityElement(a4));
        int[] a5 = {2, 2, 4, 4};
        System.out.printf("%-30s %-50s \n", "A = "+print(a5), "FindMajorityElement(A) = "+findMajorityElement(a5));
        int[] a6 = {1, 2, 2, 4, 2, 4, 1, 2, 4, 2, 2, 2};
        System.out.printf("%-30s %-50s \n", "A = "+print(a6), "FindMajorityElement(A) = "+findMajorityElement(a6));
        for (int i = 10000; i <= 20480000; i *= 2) {
            int[] a = new int[i];
            Stopwatch sw1 = new Stopwatch();
            int res = findMajorityElement(a);
            double time = sw1.elapsedTime()*1000;
            System.out.printf("%-15s %-15f \n",i,time);
        }
    }
}
