public int min() {
    ListNode t = front;
    if (t == null) throw new NoSuchElementException();
    int min = Integer.MAX_VALUE;
    while (t != null) {
        min = Math.min(t.data,min);
        t = t.next;
    }
    return min;
}
