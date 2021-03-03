/****************************************************************************************************
    Compilation: javac DiscreteProbability.java
    Execution: java DiscreteProbability a b c d ... n

    Notes: Takes a variable number of inputs and n, the number of trials, and then performs n trials
    choosing a random position in the numbers based on their size. Finally it prints out the number
    of times the position was chosen and its probabilty.

    % java 1 2 1 10000000
    1       2500441         0.2500441
    2       4999017         0.4999017
    1       2500542         0.2500542

    % java 1 1 1 10000000
    1       3332951         0.3332951
    1       3333872         0.3333872
    1       3333177         0.3333177
****************************************************************************************************/

public class DiscreteProbability {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[args.length-1]);
        int[] count = new int[args.length-1];
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int q = 0; q < args.length-1; q++)
                sum += Integer.parseInt(args[q]);
            int a = (int) (Math.random() * sum);
            int temp = 0;
            for (int q = 0; q < args.length-1; q++) {
                temp += Integer.parseInt(args[q]);
                if (temp > a) {
                    count[q]++;
                    break;
                }
            }
        }
        for (int i = 0; i < args.length-1; i++) {
            System.out.println(args[i] + "  \t" + count[i] + "\t\t" + ((double)count[i] / n));
        }
    }
}
