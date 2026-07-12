package com.example;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Created by dn070578noi on 12.12.23.
 */
public class Task16 {
    public int findKthLargest(int[] nums, int k) {
        Queue<Integer> queue = new PriorityQueue<>(k);
        for (int num : nums) {
            if (queue.size() < k) {
                queue.add(num);
            } else {
                if (num > queue.peek()) {
                    queue.poll();
                    queue.add(num);
                }
            }
        }
        return queue.peek();
    }
}