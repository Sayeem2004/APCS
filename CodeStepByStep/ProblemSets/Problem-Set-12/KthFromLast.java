public int kthFromLast(int k) {
    if (k < 0) throw new NoSuchElementException();
    ListNode t = front;
    int count = 0;
    while (t != null) {
        t = t.next;
        count++;
    }
    if (k > count) throw new NoSuchElementException();
    ListNode t2 = front;
    for (int i = 0; i < count-k; i++) {
        t2 = t2.next;
    }
    return t2.data;
}
