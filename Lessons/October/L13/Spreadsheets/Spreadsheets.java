/****************************************************************************************************
    Name: Mohammad Khan

    Compilation: javac Spreadsheets.java
    Execution: java Spreadsheets a b c

    Notes: Calculates averages from 2d array of test scores and weights a,b,c.

    % java Spreadsheets .25 .25 .50
                    Test1           Test2           Test3           Student Average
    Student 1       99.0            85.0            98.0            94.0
    Student 2       98.0            57.0            79.0            78.0
    Student 3       92.0            77.0            74.0            81.0
    Student 4       94.0            62.0            81.0            79.0
    Student 5       99.0            94.0            92.0            95.0
    Student 6       80.0            76.5            67.0            74.5
    Student 7       76.0            58.5            90.5            75.0
    Student 8       92.0            66.0            91.0            83.0
    Student 9       97.0            70.5            66.5            78.0
    Student 10      89.0            89.5            81.0            86.5
    Test Average    91.6            73.6            82.0            82.3
    Weighted Average = 82.3
****************************************************************************************************/

public class Spreadsheets {
    public static void main(String[] args) {
        double[][] a = {
        { 99.0, 85.0, 98.0, 0.0 },
        { 98.0, 57.0, 79.0, 0.0 },
        { 92.0, 77.0, 74.0, 0.0 },
        { 94.0, 62.0, 81.0, 0.0 },
        { 99.0, 94.0, 92.0, 0.0 },
        { 80.0, 76.5, 67.0, 0.0 },
        { 76.0, 58.5, 90.5, 0.0 },
        { 92.0, 66.0, 91.0, 0.0 },
        { 97.0, 70.5, 66.5, 0.0 },
        { 89.0, 89.5, 81.0, 0.0 },
        {  0.0,  0.0,  0.0, 0.0 }
        };

        for (int i = 0; i < 10; i++)
            a[i][3] = (a[i][0]+a[i][1]+a[i][2])/3;

        for (int i = 0; i < 3; i++) {
            double sum = 0;
            for (int q = 0; q < 10; q++)
                sum += a[q][i];
            a[10][i] = sum/10;
        }

        double sum = 0;
        for (int i = 0; i < 3; i++)
            sum += a[10][i] * Double.parseDouble(args[i]);
        a[10][3] = sum;

        System.out.printf("%-15s %-15s %-15s %-15s %-15s\n","","Test1","Test2","Test3","Student Average");
        for (int i = 0; i < 11; i++) {
            if (i < 10)
                System.out.printf("%-16s","Student " + (i+1));
            else
                System.out.printf("%-16s","Test Average");
            for (int q = 0; q < 4; q++)
                System.out.printf("%-16s",a[i][q]);
            System.out.println();
        }
        System.out.printf("%-16s\n","Weighted Average = "+a[10][3]);
    }
}
