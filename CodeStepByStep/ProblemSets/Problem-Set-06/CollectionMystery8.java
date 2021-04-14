public static void collectionMystery8(Stack<Integer> stack) {
    Queue<Integer> queue = new LinkedList<Integer>();
    TreeSet<Integer> set = new TreeSet<Integer>();
    while (!stack.isEmpty()) {
        if (stack.peek() % 2 == 0) {
            queue.add(stack.pop());
        } else {
            set.add(stack.pop());
        }
    }
    for (int n : set) {
        stack.push(n);
    }
    while (!queue.isEmpty()) {
        stack.push(queue.remove());
    }
    System.out.println(stack);
}

// {1, 2, 3, 4, 5}	-->  {1, 3, 5, 4, 2}
// {3, 2, 7, 3, 3, 4, 1, 1, 4}	-->  {1, 3, 7, 4, 4, 2}
// {9, 7, 14, 7, 22, 7, 3, 14}	-->  {3, 7, 9, 14, 22, 14}
// {8, 5, 1, 2, 1, 1, 2, 1, 4, 5}	-->  {1, 5, 4, 2, 2, 8}
