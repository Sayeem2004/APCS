/****************************************************************************************************
    Name: Mohammad Khan

    Compilation: javac Transpose.java
    Execution: java Transpose

    Notes: Takes 2d array "a" and transposes its elements.

    % java Transpose
    a[][] printed in row-major order:
        1    2    3    4
        5    6    7    8
        9   10   11   12
        13   14   15   16

    print transpose of a[][]:
        1    5    9   13
        2    6   10   14
        3    7   11   15
        4    8   12   16

    a[][] printed in row-major order:
        1    2    3    4
        5    6    7    8
        9   10   11   12
        13   14   15   16

    a[][] after transpose in place:
        1    5    9   13
        2    6   10   14
        3    7   11   15
        4    8   12   16

****************************************************************************************************/

public class Transpose {
    public static void main(String[] args) {
        int[][] a = { {1,2,3,4},
                      {5,6,7,8},
                      {9,10,11,12},
                      {13,14,15,16} };

        System.out.println("a[][] printed in row-major order:");
        for (int i = 0; i < 4; i++) {
            for (int q = 0; q < 4; q++)
                System.out.printf("%5s",a[i][q]);
            System.out.println();
        }
        System.out.println();

        System.out.println("print transpose of a[][]:");
        for (int i = 0; i < 4; i++) {
            for (int q = 0; q < 4; q++)
                System.out.printf("%5s",a[q][i]);
            System.out.println();
        }
        System.out.println();

        System.out.println("a[][] printed in row-major order:");
        for (int i = 0; i < 4; i++) {
            for (int q = 0; q < 4; q++)
                System.out.printf("%5s",a[i][q]);
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < 4; i++) {
            for (int q = 0; q < 4-i; q++) {
                int t = a[i][i+q];
                a[i][i+q] = a[i+q][i];
                a[i+q][i] = t;
            }
        }
        System.out.println("a[][] after transpose in place:");
        for (int i = 0; i < 4; i++) {
            for (int q = 0; q < 4; q++)
                System.out.printf("%5s",a[i][q]);
            System.out.println();
        }
        System.out.println();
    }
}
