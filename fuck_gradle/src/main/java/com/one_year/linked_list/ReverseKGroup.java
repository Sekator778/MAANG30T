package com.one_year.linked_list;

import com.example.utility.ListNode;

/**
 * @author Sekator
 * @created 27 May, 2026
 */
public class ReverseKGroup {
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || head.next == null || k == 1) {
            return head;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode groupPrev = dummy;
        while (true) {
            ListNode kth = getKth(groupPrev, k);
            if (kth == null) {
                break;
            }
            ListNode groupNext = kth.next;

            // reverse first part
            ListNode current = groupPrev.next;
            ListNode prev = groupNext;
            while (current != groupNext) {
                ListNode next = current.next;
                current.next = prev;
                prev = current;
                current = next;
            }
            ListNode tail = groupPrev.next;
            groupPrev.next = kth;
            groupPrev = tail;
        }

        return dummy.next;
    }


    private ListNode getKth(ListNode node, int k) {
        while (node != null && k > 0) {
            node = node.next;
            k--;
        }
        return node;
    }
}
