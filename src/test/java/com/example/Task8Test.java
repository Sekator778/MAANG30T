package com.example;

import com.example.task8.Task8;
import com.example.utility.ListNode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Task8Test {
    /**
     * 1 -> 2 -> 2 -> 1
     */
    @Test
    void test() {
        Task8 task8 = new Task8();
        ListNode tail = new ListNode(1);
        ListNode node2 = new ListNode(2, tail);
        ListNode node3 = new ListNode(2, node2);
        ListNode head = new ListNode(1, node3);

        assertTrue(task8.isPalindrome(head));
    }

    /**
     * 1 -> 2 -> 3 -> 2 -> 1
     */
    @Test
    void test2() {
        Task8 task8 = new Task8();
        ListNode tail = new ListNode(1);
        ListNode node2 = new ListNode(2, tail);
        ListNode node3 = new ListNode(3, node2);
        ListNode node4 = new ListNode(2, node3);
        ListNode head = new ListNode(1, node4);

        assertTrue(task8.isPalindrome(head));
    }

    /**
     * 1 -> 2 -> 3 -> 3 -> 2 -> 1
     */
    @Test
    void test3() {
        Task8 task8 = new Task8();
        ListNode tail = new ListNode(1);
        ListNode node2 = new ListNode(2, tail);
        ListNode node3 = new ListNode(3, node2);
        ListNode node4 = new ListNode(3, node3);
        ListNode node5 = new ListNode(2, node4);
        ListNode head = new ListNode(1, node5);
        System.out.println("++++++++++++++++++++++++++++++");
        System.out.println(head);
        assertTrue(task8.isPalindrome(head));
        System.out.println("++++++++++++++++++++++++++++++");
        System.out.println(head);
    }

    /**
     * 1 -> 2 -> 3 -> 4 -> 5 -> 6
     */
    @Test
    void test4() {
        Task8 task8 = new Task8();
        ListNode tail = new ListNode(6);
        ListNode node1 = new ListNode(5, tail);
        ListNode node2 = new ListNode(4, node1);
        ListNode node3 = new ListNode(3, node2);
        ListNode node4 = new ListNode(2, node3);
        ListNode head = new ListNode(1, node4);

        assertFalse(task8.isPalindrome(head));
    }

    /**
     * 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 7
     */
    @Test
    void test5() {
        Task8 task8 = new Task8();
        ListNode tail = new ListNode(7);
        ListNode node1 = new ListNode(6, tail);
        ListNode node2 = new ListNode(5, node1);
        ListNode node3 = new ListNode(4, node2);
        ListNode node4 = new ListNode(3, node3);
        ListNode node5 = new ListNode(2, node4);
        ListNode head = new ListNode(1, node5);

        assertFalse(task8.isPalindrome(head));
    }

    /**
     * 1 -> 2 -> 2 -> 1
     */
    @Test
    void test6() {
        Task8 task8 = new Task8();
        ListNode tail = new ListNode(1);
        ListNode node2 = new ListNode(2, tail);
        ListNode node3 = new ListNode(2, node2);
        ListNode head = new ListNode(1, node3);

        assertTrue(task8.isPalindrome2(head));
    }

    /**
     * 1 -> 2 -> 3 -> 2 -> 1
     */
    @Test
    void test7() {
        Task8 task8 = new Task8();
        ListNode tail = new ListNode(1);
        ListNode node2 = new ListNode(2, tail);
        ListNode node3 = new ListNode(3, node2);
        ListNode node4 = new ListNode(2, node3);
        ListNode head = new ListNode(1, node4);

        assertTrue(task8.isPalindrome2(head));
    }

    /**
     * 1 -> 2 -> 3 -> 3 -> 2 -> 1
     */
    @Test
    void test8() {
        Task8 task8 = new Task8();
        ListNode tail = new ListNode(1);
        ListNode node2 = new ListNode(2, tail);
        ListNode node3 = new ListNode(3, node2);
        ListNode node4 = new ListNode(3, node3);
        ListNode node5 = new ListNode(2, node4);
        ListNode head = new ListNode(1, node5);
        System.out.println("++++++++++++++++++++++++++++++");
        System.out.println(head);
        assertTrue(task8.isPalindrome2(head));
        System.out.println("++++++++++++++++++++++++++++++");
        System.out.println(head);
    }

    /**
     * 1 -> 2 -> 3 -> 4 -> 5 -> 6
     */
    @Test
    void test9() {
        Task8 task8 = new Task8();
        ListNode tail = new ListNode(6);
        ListNode node1 = new ListNode(5, tail);
        ListNode node2 = new ListNode(4, node1);
        ListNode node3 = new ListNode(3, node2);
        ListNode node4 = new ListNode(2, node3);
        ListNode head = new ListNode(1, node4);

        assertFalse(task8.isPalindrome2(head));
    }

    /**
     * 1 -> 2 -> 3 -> 3 -> 2 -> 6
     */
    @Test
    void test10() {
        Task8 task8 = new Task8();
        ListNode tail = new ListNode(6);
        ListNode node1 = new ListNode(2, tail);
        ListNode node2 = new ListNode(3, node1);
        ListNode node3 = new ListNode(3, node2);
        ListNode node4 = new ListNode(2, node3);
        ListNode head = new ListNode(1, node4);
        System.out.println("++++++++++++++++++++++++++++++"); /*TODO список поламаний якщо не паліндром */
        System.out.println(head);
        assertFalse(task8.isPalindrome2(head));
        System.out.println("++++++++++++++++++++++++++++++");
        System.out.println(head);
    }



}