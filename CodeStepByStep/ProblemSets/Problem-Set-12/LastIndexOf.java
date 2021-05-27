public int lastIndexOf(int val) {
    int ret = -1, i = 0;
    ListNode t = front;
    while (t != null) {
        if (t.data == val) ret = i;
        t = t.next;
        i++;
    }
    return ret;
}
