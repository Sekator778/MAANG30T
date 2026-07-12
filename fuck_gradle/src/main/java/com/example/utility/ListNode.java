package com.example.utility;

import lombok.ToString;

/**
 * Created by dn070578noi on 01.12.23.
 */
@ToString
public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int x) {
        val = x;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public ListNode() {
    }
}

