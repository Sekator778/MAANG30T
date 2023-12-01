package com.example;

import com.example.utility.ListNode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Task7Test {
/**
 * Input: intersectVal = 8, listA = [4,1,8,4,5], listB = [5,6,1,8,4,5], skipA = 2, skipB = 3
 * Output: Intersected at '8'
 * Explanation: The intersected node's value is 8 (note that this must not be 0 if the two lists
 */
    @Test
    void getIntersectionNode() {
        Task7 task7 = new Task7();
        ListNode listSame5 = new ListNode(5, null);
        ListNode listSame4 = new ListNode(4, listSame5);
        ListNode listSame8 = new ListNode(8, listSame4);
        ListNode listSame1 = new ListNode(1, listSame8);
        ListNode listAHead = new ListNode(4, listSame1);

        ListNode listB6 = new ListNode(6, listSame1);
        ListNode listBHead = new ListNode(5, listB6);

        ListNode intersectionNode = task7.getIntersectionNode(listAHead, listBHead);
        assertEquals(1, intersectionNode.val);

    }
}