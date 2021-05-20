ListNode t = list.next;
list.next = temp;
temp.next = t;
