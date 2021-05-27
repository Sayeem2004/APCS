public int middle() {
    ListNode t = front;
    ListNode t2 = front;
    if (t == null) throw new NoSuchElementException();
    int i = 1;
    while (t != null) {
        if (i % 2 == 0) t2 = t2.next;
        t = t.next;
        i++;
    }
    return t2.data;
}
