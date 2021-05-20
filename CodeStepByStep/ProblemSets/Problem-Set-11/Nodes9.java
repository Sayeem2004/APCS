ListNode t = list.next;
t.next = temp.next;
temp.next = t;
list.next = temp;
