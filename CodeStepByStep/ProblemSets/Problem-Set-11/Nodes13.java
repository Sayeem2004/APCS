ListNode t = list;
ListNode t2 = t.next;
ListNode t3 = t2.next;
t3.next = t2;
t2.next = t;
t.next = null;
list = t3;
