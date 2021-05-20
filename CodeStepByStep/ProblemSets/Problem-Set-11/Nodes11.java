ListNode t = list.next;
ListNode t2 = t.next;
t2.next = list;
list = list.next;
t2 = t2.next;
t2.next = null;
