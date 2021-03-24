import java.util.*;

public static void mystery1(Stack<Integer> s) {
    Queue<Integer> q = new LinkedList<Integer>();
    while (!s.isEmpty()) {
        q.add(s.peek());
        q.add(s.pop());
    }
    while (!q.isEmpty()) {
        s.push(q.peek());
        q.remove();
    }
    System.out.println(s);
}

// [2, 3, 1] -> [1, 1, 3, 3, 2, 2]
// [42, -1, 4, 15, 9] -> [9, 9, 15, 15, 4, 4, -1, -1, 42, 42]
// [30, 20, 10, 70, 50, 40] -> [40, 40, 50, 50, 70, 70, 10, 10, 20, 20, 30, 30]
