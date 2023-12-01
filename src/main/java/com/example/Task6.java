package com.example;

import com.example.utility.ListNode;

/**
 * Created by dn070578noi on 29.11.23.
 */
public class Task6 {

    public ListNode reverseList(ListNode head) {
        ListNode reversed = null;

        while (head != null) {
            ListNode originalHead = head.next;
            head.next = reversed;
            reversed = head;

            head = originalHead;
        }
        return reversed;
    }
}
