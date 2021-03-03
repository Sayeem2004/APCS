/****************************************************************************************************
    Name: Mohammad Khan

    Compilation: javac Peaks.java
    Execution: java Peaks < PeaksIO.txt
    Dependencies: StdIn.java StdOut.java

    Notes: Returns the number of values where the 4 surrounding values(not diagonally) are less than
    the original value

    > less PeaksIO.txt
    4 5
    1 2 3 6 1
    4 9 2 8 1
    7 8 9 4 5
    5 6 3 8 2
    > java Peaks < PeaksIO.txt
    3
****************************************************************************************************/

public class Peaks {
    public static void main(String[] args) {
        int n = StdIn.readInt();
        int m = StdIn.readInt();
        int[][] v = new int[n][m];
        for (int i = 0; i < n; i++)
            for (int q = 0; q < m; q++)
                v[i][q] = StdIn.readInt();
        int count = 0;
        for (int i = 1; i < n-1; i++) {
            for (int q = 1; q < m-1; q++) {
                if (v[i][q]>v[i+1][q] && v[i][q]>v[i-1][q] && v[i][q]>v[i][q+1] && v[i][q]>v[i][q-1])
                    count++;
            }
        }
        System.out.println("Number of peaks: " + count);
    }
}
