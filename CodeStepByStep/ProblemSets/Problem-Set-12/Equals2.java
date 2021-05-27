public boolean equals2(LinkedIntList other) {
    ListNode t = front;
    ListNode t2 = other.front;
    if (t == null && t2 == null) return true;
    while (t.next != null && t2.next != null) {
        if (t.data != t2.data) return false;
        t = t.next;
        t2 = t2.next;
    }
    if (t.next == null && t2.next != null) return false;
    if (t.next != null && t2.next == null) return false;
    return true;
}
