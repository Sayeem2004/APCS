public void flipHalf(Queue<Integer> q) {
    int n = q.size();
    Stack<Integer> st = new Stack<Integer>();
    for (int i = 0; i < n; i++) {
        if (i % 2 == 0) q.add(q.remove());
        else st.push(q.remove());
    }
    for (int i = 0; i < n/2; i++) {
        q.add(q.remove());
        q.add(st.pop());
    }
    if (n % 2 == 1) q.add(q.remove());
}
