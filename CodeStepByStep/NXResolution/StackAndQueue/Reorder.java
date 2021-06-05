public void reorder(Queue<Integer> q) {
    int n = q.size();
    int c = 0;
    Stack<Integer> st = new Stack<Integer>();
    for (int i = 0; i < n; i++) {
        int a = q.remove();
        if (a < 0) {
            c++;
            st.push(a);
        } else {
            q.add(a);
        }
    }
    while (!st.isEmpty()) {
        q.add(st.pop());
    }
    for (int i = 0; i < n-c; i++) {
        q.add(q.remove());
    }
}
