package com.example;

import com.example.utility.ListNode;

import java.util.Stack;

/**
 * Created by dn070578noi on 29.11.23.
 */
public class Task8 {

    public boolean isPalindrome(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            stack.push(slow.val);
            slow = slow.next;
            fast = fast.next.next;
        }
        if (fast != null) {
            slow = slow.next;
        }
        while (slow != null) {
            if (slow.val != stack.pop()) {
                return false;
            }
            slow = slow.next;
        }
        return true;
    }

    public boolean isPalindrome2(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        if (fast != null) {
            slow = slow.next;
        }
        Task6 task6 = new Task6();
        slow = task6.reverseList(slow);

        while (slow != null) {
            if (slow.val != head.val) {
                return false;
            }
            slow = slow.next;
            head = head.next;
        }
        task6.reverseList(head);
        return true;
    }
}
