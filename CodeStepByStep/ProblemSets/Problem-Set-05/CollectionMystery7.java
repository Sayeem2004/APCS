public static void collectionMystery7(Queue<Integer> queue) {
    Stack<Integer> stack = new Stack<Integer>();
    int qsize = queue.size();
    for (int i = 0; i < qsize; i++) {
        if (queue.peek()%2 == 0) {
            queue.add(queue.remove())
        } else {
            stack.push(queue.peek());
            stack.push(queue.remove());
        }
    }
    while (!q.isEmpty()) {
        stack.push(queue.remove());
    }
    while (!stack.isEmpty()) {
        System.out.print(stack.pop() + " ");
    }
}

// {1, 2, 3, 4, 5, 6} -> {6, 4, 2, 5, 5, 3, 3, 1, 1}
// {55, 33, 0, 88, 44, 99, 77, 66} -> {66, 44, 88, 0, 77, 77, 99, 99, 33, 33, 55, 55}
// {80, 20, 65, 10, 5, 3, 40, 2, 11} -> {2, 40, 10, 20, 80, 11, 11, 3, 3, 5, 5, 65, 65}
