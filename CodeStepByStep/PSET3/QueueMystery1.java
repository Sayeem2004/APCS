import java.util.*;

public static void main(String[] args) {
    Queue<Integer> queue = new LinkedList<Integer>();
    for (int i = 1; i <= 6; i++) {
        queue.add(i);
    } // {1, 2, 3, 4, 5, 6}

    for (int i = 0; i < queue.size(); i++) {
        System.out.print(queue.remove() + " ");
    }
    System.out.println(queue + " size " + queue.size());
}

// 1 2 3 {4, 5, 6} size 3
