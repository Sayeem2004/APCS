public int evenSum() {
    ListNode t = front;
    if (t == null) return 0;
    int i = 0;
    int sum = 0;
    while (t != null) {
        if (i % 2 == 0) sum += t.data;
        t = t.next;
        i++;
    }
    return sum;
}
