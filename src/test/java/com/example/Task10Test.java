package com.example;

import com.example.month_one.task10.Task10;
import com.example.utility.ListNode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Task10Test {
    //    Example 1:
//    Input: head = [1,4,3,2,5,2], x = 3
//    Output: [1,2,2,4,3,5]
    @Test
    void test() {
        Task10 task10 = new Task10();
        ListNode tail = new ListNode(2);
        ListNode node5 = new ListNode(5, tail);
        ListNode node4 = new ListNode(2, node5);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(4, node3);
        ListNode head = new ListNode(1, node2);

        ListNode result = task10.partition(head, 3);
        assertEquals(1, result.val);
        assertEquals(2, result.next.val);
        assertEquals(2, result.next.next.val);
        assertEquals(4, result.next.next.next.val);
        assertEquals(3, result.next.next.next.next.val);
        assertEquals(5, result.next.next.next.next.next.val);
    }

    //    Example 2:
//    Input: head = [2,1], x = 2
//    Output: [1,2]
    @Test
    void test2() {
        Task10 task10 = new Task10();
        ListNode tail = new ListNode(1);
        ListNode head = new ListNode(2, tail);

        ListNode result = task10.partition(head, 2);
        assertEquals(1, result.val);
        assertEquals(2, result.next.val);
    }
}