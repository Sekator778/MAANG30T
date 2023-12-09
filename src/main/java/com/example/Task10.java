package com.example;

import com.example.utility.ListNode;

/**
 * Created by dn070578noi on 09.12.23.
 */
public class Task10 {
    public ListNode partition(ListNode head, int x) {
        ListNode mockSmallsHead = new ListNode();
        ListNode mockLargesHead = new ListNode();

        ListNode smallsTail = mockSmallsHead;
        ListNode largesTail = mockLargesHead;

        while (head != null) {
            if (head.val < x) {
                smallsTail.next = head;
                smallsTail = smallsTail.next;
            } else {
                largesTail.next = head;
                largesTail = largesTail.next;
            }
            head = head.next;
        }
        smallsTail.next = mockLargesHead.next;
        largesTail.next = null;
        return mockSmallsHead.next;
    }
}
