public boolean isSorted(Stack<Integer> st) {
    if (st.size() == 0) return true;
    int prev = st.pop();
    Stack<Integer> s = new Stack<Integer>();
    s.push(prev);
    boolean br = true;
    while (!st.isEmpty()) {
        int a = st.pop();
        if (a < prev) br = false;
        prev = a;
        s.push(a);
    }
    while (!s.isEmpty()) {
        st.push(s.pop());
    }
    return br;
}
