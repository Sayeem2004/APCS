public boolean isSorted() {
    ListNode t = front;
    if (t == null) return true;
    if (t.next == null) return true;
    while (t.next != null) {
        if (t.data > t.next.data) return false;
        t = t.next;
    }
    return true;
}
