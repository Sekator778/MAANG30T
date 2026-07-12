package com.example.month_one.task7;

import com.example.utility.ListNode;
import com.example.utility.ListTailAndSize;

/**
 * Created by dn070578noi on 29.11.23.
 */
public class Task7 {

    public ListNode getIntersectionNode(ListNode head1, ListNode head2) {
        ListTailAndSize list1TailAndNodeSize = getTailAndSize(head1);
        ListTailAndSize list2TailAndNodeSize = getTailAndSize(head2);

        if (list2TailAndNodeSize.getTail() != list1TailAndNodeSize.getTail()) {
            return null;
        }

        ListNode shorter = list1TailAndNodeSize.getSize() < list2TailAndNodeSize.getSize() ?
                head1 : head2;
        ListNode longer = list1TailAndNodeSize.getSize() < list2TailAndNodeSize.getSize() ?
                head2 : head1;

        int sizeDiff = Math.abs(list1TailAndNodeSize.getSize() - list2TailAndNodeSize.getSize());
        longer = getKthNode(longer, sizeDiff);

        while (shorter != longer) {
            shorter = shorter.next;
            longer = longer.next;
        }
        return shorter;
    }

    /**
     * Find the kth node from the head of the list
     */
    private ListNode getKthNode(ListNode head, int lengthDiff) {
        for (int i = 0; i < lengthDiff; i++) {
            head = head.next;
        }
        return head;
    }

    /**
     * Get tail and size of the list
     */
    private ListTailAndSize getTailAndSize(ListNode head) {
        if (head == null) {
            return null;
        }
        int size = 1;
        while (head.next != null) {
            head = head.next;
            size += 1;
        }
        return new ListTailAndSize(head, size);
    }
}
