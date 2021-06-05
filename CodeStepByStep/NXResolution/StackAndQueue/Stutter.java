public void stutter(Queue<Integer> q) {
    int n = q.size();
    for (int i = 0; i < n; i++) {
        q.add(q.peek());
        q.add(q.remove());
    }
}
