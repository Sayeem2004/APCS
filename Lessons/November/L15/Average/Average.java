/****************************************************************************************************
    Name: Mohammad Khan

    Compilation:  javac Average.java
    Execution:    java Average < data.txt
    Dependencies: StdIn.java StdOut.java

    Notes: Reads in a sequence of real numbers, and computes their average.

    $ more AverageIO.txt
    1 2 3 4 5 6 7 8 9 10
    $ java Average < AverageIO.txt
    Average is 5.5

****************************************************************************************************/

public class Average {
    public static void main(String[] args) {
        int count = 0;
        double sum = 0.0;

        while (!StdIn.isEmpty()) {
            double value = StdIn.readDouble();
            sum += value;
            count++;
        }

        double average = sum / count;
        StdOut.println("Average is " + average);
    }
}
