public void splitStack(Stack<Integer> st) {
    Queue<Integer> q = new LinkedList<Integer>();
    int n = st.size();
    for (int i = 0; i < n; i++) {
        q.add(st.pop());
    }
    for (int i = 0; i < n; i++) {
        int a = q.remove();
        if (a < 0) st.push(a);
        else q.add(a);
    }
    while (!q.isEmpty()) {
        st.push(q.remove());
    }
}
