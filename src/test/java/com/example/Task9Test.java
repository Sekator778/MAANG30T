package com.example;

import com.example.utility.ListNode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class Task9Test {
    //    Example 1:
//    Input: head = [1,2,3,4,5], n = 2
//    Output: [1,2,3,5]
    @Test
    void test() {
        Task9 task9 = new Task9();
        ListNode tail = new ListNode(5);
        ListNode node4 = new ListNode(4, tail);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode head = new ListNode(1, node2);

        ListNode result = task9.removeNthFromEnd(head, 2);
        assertEquals(1, result.val);
        assertEquals(2, result.next.val);
        assertEquals(3, result.next.next.val);
        assertEquals(5, result.next.next.next.val);
    }

    //    Example 2:
//    Input: head = [1], n = 1
//    Output: []
    @Test
    void test2() {
        Task9 task9 = new Task9();
        ListNode head = new ListNode(1);

        ListNode result = task9.removeNthFromEnd(head, 1);
        assertNull(result);
    }

    //    Example 3:
//    Input: head = [1,2], n = 1
//    Output: [1]
    @Test
    void test3() {
        Task9 task9 = new Task9();
        ListNode tail = new ListNode(2);
        ListNode head = new ListNode(1, tail);

        ListNode result = task9.removeNthFromEnd(head, 1);
        assertEquals(1, result.val);
        assertNull(result.next);
    }

}