public int deleteBack() {
    ListNode t = front;
    if (t == null) throw new NoSuchElementException();
    if (t.next == null) {
        int a = t.data;
        front = null;
        return a;
    }
    while (t.next.next != null) {
        t = t.next;
    }
    int a = t.next.data;
    t.next = null;
    return a;
}
