public void removeAll(int val) {
    if (front == null) return;
    while (front.data == val)
        front = front.next;
    ListNode t = front;
    while (t != null && t.next != null) {
        if (t.next.data == val) {
            t.next = t.next.next;
        } else {
            t = t.next;
        }
    }
}
