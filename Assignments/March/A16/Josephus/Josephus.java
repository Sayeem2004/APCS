/****************************************************************************************************
    Name: Mohammad Khan

    Compilation: javac Josephus.java
    Execution: java HotPotato n k
    Dependencies: none

    Notes: Simulates the Josephus problem with n people and a step size of k using a round robin
    scheduler.

    > java Josephus 5 2
    members: [1, 2, 3, 4, 5]
    poisoned: 2
    poisoned: 4
    poisoned: 1
    poisoned: 5
    Survivor: 3

    > java Josephus 8 5
    members: [1, 2, 3, 4, 5, 6, 7, 8]
    poisoned: 5
    poisoned: 2
    poisoned: 8
    poisoned: 7
    poisoned: 1
    poisoned: 4
    poisoned: 6
    Survivor: 3
****************************************************************************************************/
import java.util.*;

public class Josephus {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int k = Integer.parseInt(args[1]);
        int count = 0;

        Queue<Integer> people = new LinkedList<Integer>();
        for (int i = 1; i <= n; i++)
            people.add(i);
        System.out.println("members: " + people);

        while (people.size() != 1) {
            count++;
            if (count%k == 0)
                System.out.println("poisoned: " + people.remove());
            else
                people.add(people.remove());
        }

        System.out.println("Survivor: " + people.remove());
    }
}
