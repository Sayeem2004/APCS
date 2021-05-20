ListNode list2 = list;
list = list.next;
ListNode t = list.next;
list2.next = t;
list.next = null;
