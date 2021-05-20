ListNode temp2 = temp.next;
temp2.next = list.next;
list.next = temp;
