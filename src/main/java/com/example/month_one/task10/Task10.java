package com.example.month_one.task10;

import com.example.utility.ListNode;

/**
 * Created by dn070578noi on 09.12.23.
 */
public class Task10 {
    public ListNode partition(ListNode head, int x) {
        ListNode smallHead = new ListNode();
        ListNode smallTail = smallHead;
        ListNode largeHead = new ListNode();
        ListNode largeTail = largeHead;

        while (head != null) {
            if (head.val < x) {
                smallTail.next = head;
                smallTail = smallTail.next;
            } else {
                largeTail.next = head;
                largeTail = largeTail.next;
            }
            head = head.next;
        }
        smallTail.next = largeHead.next;
        largeTail.next = null;
        return smallHead.next;
    }
}
