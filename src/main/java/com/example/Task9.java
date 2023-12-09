package com.example;

import com.example.utility.ListNode;

/**
 * Created by dn070578noi on 29.11.23.
 */
public class Task9 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode windowStart = head;
        ListNode windowEnd = head;

        while (n != 0) {
            windowEnd = windowEnd.next;
            n -= 1;
        }
        if (windowEnd == null) {
            return windowStart.next;
        }
        while (windowEnd.next != null) {
            windowStart = windowStart.next;
            windowEnd = windowEnd.next;
        }
        windowStart.next = windowStart.next.next;
        return head;
    }
}
