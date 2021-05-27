public boolean hasTwoConsecutive() {
    ListNode t = front;
    if (t == null) return false;
    if (t.next == null) return false;
    while (t.next != null) {
        if (t.data == t.next.data-1) return true;
        t = t.next;
    }
    return false;
}
