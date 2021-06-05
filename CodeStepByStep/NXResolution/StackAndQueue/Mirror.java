public void mirror(Queue<String> q) {
    int n = q.size();
    Stack<String> st = new Stack<String>();
    for (int i = 0; i < n; i++) {
        String a = q.remove();
        st.push(a);
        q.add(a);
    }
    while (!st.isEmpty()) {
        q.add(st.pop());
    }
}
