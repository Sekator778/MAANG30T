package com.example.month_one;

import com.example.month_one.task6.Task6;
import com.example.utility.ListNode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Task6Test {

    @Test
    void reverseList() {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2, node1);
        ListNode node3 = new ListNode(3, node2);

        Task6 task6 = new Task6();
        ListNode reversed = task6.reverseList(node3);
        assertEquals(1, reversed.val);
        assertEquals(2, reversed.next.val);
        assertEquals(3, reversed.next.next.val);
    }
}