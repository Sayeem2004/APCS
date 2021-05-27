public int indexOf(int val) {
    ListNode t = front;
    int curr = 0;
    if (t == null) return -1;
    while (t != null) {
        if (t.data == val) return curr;
        t = t.next;
        curr++;
    }
    return -1;
}
