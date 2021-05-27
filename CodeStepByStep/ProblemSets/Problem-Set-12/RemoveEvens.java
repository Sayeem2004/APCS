public LinkedIntList removeEvens() {
    if (front == null || front.next == null) return new LinkedIntList();
    LinkedIntList list2 = new LinkedIntList(front.data);
    front = front.next;
    ListNode t = front;
    ListNode t2 = list2.front;
    while (t != null && t.next != null) {
        t2.next = t.next;
        t2 = t2.next;
        t.next = t.next.next;
        t = t.next;
    }
    t2.next = null;
    return list2;
}
