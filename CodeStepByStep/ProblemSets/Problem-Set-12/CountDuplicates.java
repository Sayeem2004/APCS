public int countDuplicates() {
    ListNode t = front;
    int count = 0;
    if (t == null) return count;
    while (t.next != null) {
        if (t.next.data == t.data) count++;
        t = t.next;
    }
    return count;
}
