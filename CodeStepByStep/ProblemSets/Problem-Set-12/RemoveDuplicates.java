public void removeDuplicates() {
    if (front == null) return;
    ListNode t = front;
    while (t != null && t.next != null) {
        if (t.data == t.next.data) {
            t.next = t.next.next;
        } else {
            t = t.next;
        }
    }
}
