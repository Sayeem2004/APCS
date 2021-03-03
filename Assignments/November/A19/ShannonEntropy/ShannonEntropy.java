/****************************************************************************************************
    Name: Mohammad Khan

    Compilation: javac ShannonEntropy.java
    Execution: java ShannonEntropy n < ShannonEntropyIO.txt
    Dependencies: StdIn.java StdOut.java

    Notes: Prints the shannon entropy of a variable amount of random integers from 1 to n.
    
    > less ShannonEntropyIO.txt
    1 1 1 1 2 1 2 1 1 2
    2 2 2 2 1 2 1 2 2 1
    > java ShannonEntropy 2 < ShannonEntropyIO.txt
    1.0000
****************************************************************************************************/

public class ShannonEntropy {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        double sum = 0;
        int[] v = new int[n+1];
        double count = 0;
        while (!StdIn.isEmpty()) {
            int a = StdIn.readInt();
            v[a]++;
            count++;
        }
        for (int i = 1; i <= n; i++) {
            if (v[i] == 0) continue;
            else {
                sum += v[i]/count * (Math.log(v[i]/count) / Math.log(2));
            }
        }
        System.out.printf("%.4f \n",-1*sum);
    }
}
