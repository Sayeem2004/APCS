/****************************************************************************************************
    Compilation: javac AverageChildren.java
    Execution: java AverageChildren

    Notes: Simulates the average number of children needed to get at least 1 boy and 1 girl
    (using the Monte Carlo method).

    % java AverageChildren
    Average Number of Children Needed: 3.00319
    Number Of Children       Occurences
    ------------------------------------------
    0                        0
    1                        0
    2                        49849
    3                        25139
    4                        12475
    5                        6198
    6                        3152
    7                        1625
    8                        799
    9                        374
    10                       202
    11                       93
    12                       49
    13                       21
    14                       11
    15                       7
    16                       2
    17                       1
    18                       1
    19                       1
    20                       1
    21                       0
    22                       0
    23                       0
    24                       0
    25                       0
****************************************************************************************************/

public class AverageChildren {
    public static void main(String[] args) {
        int ans = 0;
        int[] v = new int[26];
        for (int i = 0; i < 100000; i++) {
            int g = 0;
            int b = 0;
            int count = 0;
            while (b < 1 || g < 1) {
                double a = Math.random();
                if (a < .5) b++;
                else g++;
                count++;
            }
            ans += count;
            v[count]++;
        }
        System.out.println("Average Number of Children Needed: " + (double)ans/100000);
        System.out.println("Number Of Children \t Occurences");
        System.out.println("------------------------------------------");
        for (int i = 0; i <= 25; i++)
            System.out.println(i + "\t\t\t " + v[i]);
    }
}
