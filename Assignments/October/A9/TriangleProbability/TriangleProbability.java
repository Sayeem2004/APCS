/****************************************************************************************************
    Name: Mohammad Khan

    Compilation: javac TriangleProbability.java
    Execution: java TriangleProbability

    Notes: Prints the probability of creating a triangle given 3 random numbers between 0 and 1
    (using the Monte Carlo method).

    % java TriangleProbability
    0.5000216

    % java TriangleProbability
    0.4999151
****************************************************************************************************/

public class TriangleProbability {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 0; i < 10000000; i++) {
            double a = Math.random();
            double b = Math.random();
            double c = Math.random();
            double mx = Math.max(a,Math.max(b,c));
            double mn = Math.min(a,Math.min(b,c));
            double mid = a+b+c-mx-mn;
            if (mn + mid > mx) count++;
        }
        System.out.println((double)count/10000000);
    }
}
