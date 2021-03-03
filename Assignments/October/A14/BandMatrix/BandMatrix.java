/****************************************************************************************************
    Name: Mohammad Khan

    Compilation: javac BandMatrix.java
    Execution: java BandMatrix n width

    Notes: Takes two integer command-line arguments n and width and prints an n-by-n pattern like the
    ones below, with a zero (0) for each element whose distance from the main diagonal is strictly
    more than width, and an asterisk (*) for each entry that is not, and two spaces between each 0 or *.

    % java BandMatrix 8 0
    *  0  0  0  0  0  0  0
    0  *  0  0  0  0  0  0
    0  0  *  0  0  0  0  0
    0  0  0  *  0  0  0  0
    0  0  0  0  *  0  0  0
    0  0  0  0  0  *  0  0
    0  0  0  0  0  0  *  0
    0  0  0  0  0  0  0  *

    % java BandMatrix 8 1
    *  *  0  0  0  0  0  0
    *  *  *  0  0  0  0  0
    0  *  *  *  0  0  0  0
    0  0  *  *  *  0  0  0
    0  0  0  *  *  *  0  0
    0  0  0  0  *  *  *  0
    0  0  0  0  0  *  *  *
    0  0  0  0  0  0  *  *

    % java BandMatrix 8 2
    *  *  *  0  0  0  0  0
    *  *  *  *  0  0  0  0
    *  *  *  *  *  0  0  0
    0  *  *  *  *  *  0  0
    0  0  *  *  *  *  *  0
    0  0  0  *  *  *  *  *
    0  0  0  0  *  *  *  *
    0  0  0  0  0  *  *  *

    % java BandMatrix 8 3
    *  *  *  *  0  0  0  0
    *  *  *  *  *  0  0  0
    *  *  *  *  *  *  0  0
    *  *  *  *  *  *  *  0
    0  *  *  *  *  *  *  *
    0  0  *  *  *  *  *  *
    0  0  0  *  *  *  *  *
    0  0  0  0  *  *  *  *
****************************************************************************************************/

public class BandMatrix {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int width = Integer.parseInt(args[1]);
        for (int i = 0; i < n; i++) {
            for (int q = 0; q < n; q++) {
                if (Math.abs(q-i) <= width)
                    System.out.print("*  ");
                else
                    System.out.print("0  ");
            }
            System.out.println();
        }
    }
}
