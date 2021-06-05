public static void collectionMystery6(Stack<Integer> s) {
    Queue<Integer> q = new LinkedList<Integer>();
    Stack<Integer> s2 = new Stack<Integer>();

    while (!s.isEmpty()) {
        if (s.peek()%2 == 0) {
            q.add(s.pop());
        } else {
            s2.push(s.pop());
        }
    }

    while (!q.isEmpty()) {
        s.push(q.remove());
    }
    while (!s2.isEmpty()) {
        s.push(s2.pop());
    }

    System.out.println(s);
}

// {1, 2, 3, 4, 5, 6} -> {6, 4, 2, 1, 3, 5}

// {42, 3, 12, 15, 9, 71, 88} -> {88, 12, 42, 3, 15, 9, 71}

// {65, 30, 10, 20, 45, 55, 6, 1} -> {6, 20, 10, 30, 65, 45, 55, 1}
