public static void collectionMystery9(Queue<Integer> queue, int p) {
    Stack<Integer> stack = new Stack<Integer>();
    int count = 0;
    int size = queue.size();
    for (int i = 0; i < size; i++) {
        int element = queue.remove();
        if (element < p) {
            queue.add(element);
        } else {
            count++;
            stack.push(count);
            stack.push(element);
        }
    }

    while (!stack.isEmpty()) {
        queue.add(stack.pop());
    }

    System.out.println(queue);
}

// {1, 2, 3, 4, 5}, p=4	 ->  {1, 2, 3, 5, 2, 4, 1}
// {67, 29, 115, 84, 33, 71, 90}, p=50	->  {29, 33, 90, 5, 71, 4, 84, 3, 115, 2, 67, 1}
