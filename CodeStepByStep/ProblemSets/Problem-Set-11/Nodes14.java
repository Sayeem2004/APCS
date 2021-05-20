ListNode t = list;
ListNode t2 = list.next;
t.next = null;
ListNode t3 = t2.next;
t3.next = t;
list = t3;
ListNode list2 = t2;
