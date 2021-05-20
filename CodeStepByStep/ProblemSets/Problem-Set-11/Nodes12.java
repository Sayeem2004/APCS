ListNode t = list.next;
ListNode t2 = t.next;
list.next = t2;
t.next = list;
list = t;
