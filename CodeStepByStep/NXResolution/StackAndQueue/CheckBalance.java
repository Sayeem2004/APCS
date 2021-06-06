public int checkBalance(String s) {
    Stack<Character> st = new Stack<Character>();
    int i = 0;
    for (char c : s.toCharArray()) {
        if (c == '(' || c == '{') st.push(c);
        if (c == ')') {
            if (st.isEmpty() || !(st.peek() == '(')) return i;
            else st.pop();
        }
        if (c == '}') {
            if (st.isEmpty() || !(st.peek() == '{')) return i;
            else st.pop();
        }
        i++;
    }
    if (!st.isEmpty()) return i;
    return -1;
}
