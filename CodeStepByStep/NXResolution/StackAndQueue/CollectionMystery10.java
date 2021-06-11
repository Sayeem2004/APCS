public static void collectionMystery10(Stack<Integer> stack, int n) {
    Stack<Integer> stack2 = new Stack<Integer>();
    Queue<Integer> queue = new LinkedList<Integer>();

    while (stack.size() > n) {
        queue.add(stack.pop());
    }
    while (!stack.isEmpty()) {
        int element = stack.pop();
        stack2.push(element);
        if (element % 2 == 0)
            queue.add(element);
    }
    while (!queue.isEmpty()) {
        stack.push(queue.remove());
    }
    while (!stack2.isEmpty()) {
        stack.push(stack2.pop());
    }

    System.out.println(stack);
}

// {1, 2, 3, 4, 5, 6}, n=3	->  {6, 5, 4, 2, 1, 2, 3}
// {67, 29, 115, 84, 33, 71, 90}, n=5  ->  {90, 71, 84, 67, 29, 115, 84, 33}
