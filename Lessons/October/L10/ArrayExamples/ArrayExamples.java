/****************************************************************************************************
    Compilation: javac ArrayExamples.java
    Execution: java ArrayExamples n

    Notes: Creates 2 random arrays with length n and calculates the distance between them.

    % java ArrayExamples 15
    160.90680532531866

    % java ArrayExamples 5
    101.49876846543509
****************************************************************************************************/

public class ArrayExamples {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = (int)(Math.random()*100);
        }
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            b[i] = (int)(Math.random()*100);
        }
        int sum = 0;
        for (int i = 0; i < n; i++)
            sum += (a[i]-b[i]) * (a[i]-b[i]);
        System.out.println(Math.sqrt(sum));
    }

}
