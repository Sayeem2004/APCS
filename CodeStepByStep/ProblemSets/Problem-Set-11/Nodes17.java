ListNode temp = list;
while (temp.next != null) temp = temp.next;
temp.next = new ListNode(42);
