/****************************************************************************************************
    Name: Mohammad Khan & Asa Muhammad & Caroline Leung & Dylan Hu & Jishan Chowdhury

    Compilation: javac TowersOfHanoi.java
    Execution: java TowersOfHanoi n
    Dependencies: none

    Notes: Takes in the number of disks and prints out the moves and the # of moves required to solve
    the Tower Of Hanoi problem with n disks. The program can print out the moves using either a
    recursive or an iterative method.

    > java TowersOfHanoi 4
    move disk 1 from peg 1 to peg 2
    move disk 2 from peg 1 to peg 3
    move disk 1 from peg 2 to peg 3
    move disk 3 from peg 1 to peg 2
    move disk 1 from peg 3 to peg 1
    move disk 2 from peg 3 to peg 2
    move disk 1 from peg 1 to peg 2
    move disk 4 from peg 1 to peg 3
    move disk 1 from peg 2 to peg 3
    move disk 2 from peg 2 to peg 1
    move disk 1 from peg 3 to peg 1
    move disk 3 from peg 2 to peg 3
    move disk 1 from peg 1 to peg 2
    move disk 2 from peg 1 to peg 3
    move disk 1 from peg 2 to peg 3
    # moves: 15
****************************************************************************************************/
import java.util.*;

public class TowersOfHanoi {
    public static void hanoi(int n, int s1, int s2) {
        if (n == 1) {
            System.out.println("move disk " + n + " from peg " + s1 + " to peg " + s2);
        } else {
            hanoi(n-1,s1,6-(s1+s2));
            System.out.println("move disk " + n + " from peg " + s1 + " to peg " + s2);
            hanoi(n-1,6-(s1+s2),s2);
        }
    }

    public static int countHanoiMoves(int n) {
        if (n == 1) return 1;
        else return countHanoiMoves(n-1)+1+countHanoiMoves(n-1);
    }

    public static void hanoiStack(int n, int s1, int s2) {
        Stack<int[]> s = new Stack<int[]>();
        int[] a = {n, s1, s2, 0};
        s.push(a);
        while (!s.isEmpty()) {
            int[] b = s.pop();
            if (b[0] == 1) {
                System.out.println("move disk " + b[0] + " from peg " + b[1] + " to peg " + b[2]);
            } else {
                if (b[3] == 1) {
                    System.out.println("move disk " + b[0] + " from peg " + b[1] + " to peg " + b[2]);
                } else {
                    int[] c = {b[0]-1, b[1], 6-(b[1]+b[2]), 0};
                    int[] d = {b[0]-1, 6-(b[1]+b[2]), b[2], 0};
                    int[] e = {b[0], b[1], b[2], 1};
                    s.push(d);
                    s.push(e);
                    s.push(c);
                }
            }
        }
    }

    public static void main(String args[]) {
        int n = Integer.parseInt(args[0]);
        hanoiStack(n,1,3);
        System.out.println("# moves: " + countHanoiMoves(n));
    }
}
