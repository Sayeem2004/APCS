/****************************************************************************************************
    Name: Mohammad Khan

    Compilation: javac ReverseQueue.java
    Execution: java ReverseQueue a b c d ...
    Dependencies: none;

    Notes: Takes a variable number of elements and creates a queue from those elements and then prints
    out a reversed version of the queue using two different methods.

    > java ReverseQueue alice ben carol dave eunice
    queue: [alice, ben, carol, dave, eunice]
    reversed queue: [eunice, dave, carol, ben, alice]
    recursively reversed queue: [eunice, dave, carol, ben, alice]
****************************************************************************************************/
import java.util.*;

public class ReverseQueue {
    public static void reverseQueue(Queue<String> queue) {
        Stack<String> stack = new Stack<String>();
        while (!queue.isEmpty()) {
            stack.push(queue.remove());
        }
        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }
    }

    public static void reverseQueueR(Queue<String> queue) {
        if (!queue.isEmpty()) {
            String temp = queue.remove();
            reverseQueueR(queue);
            queue.add(temp);
        }
    }

    public static void main(String [] args) {
	    // Declare and create a queue.
        // Either one works
        // Queue <String> queue = new ArrayDeque<String>();
	    Queue<String> queue = new LinkedList<String>();
        Queue<String> rqueue = new LinkedList<String>();

	    // Initialize the queue
	    for (String s: args) {
	        queue.add(s);
            rqueue.add(s);
        }

	    // Print the results
	    System.out.println("queue: " + queue);
	    reverseQueue(queue);
	    System.out.println("reversed queue: " + queue);
        reverseQueueR(rqueue);
        System.out.println("recursively reversed queue: " + rqueue);
    }
}
