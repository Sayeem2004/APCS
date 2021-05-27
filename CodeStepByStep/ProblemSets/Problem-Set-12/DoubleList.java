public void doubleList() {
    ListNode t = front;
    if (t == null) return;
    int count = 1;
    while (t.next != null) {
        count++;
        t = t.next;
    }
    ListNode t2 = front;
    for (int i = 0; i < count; i++) {
        t.next = new ListNode(t2.data);
        t2 = t2.next;
        t = t.next;
    }
}
