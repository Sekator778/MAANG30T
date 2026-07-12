package com.one_year.prefix_sum;

import java.util.PriorityQueue;
import java.util.Queue;

class KthLargest {
    private Queue<Integer> minHeap;
    private int k;
    public KthLargest(int k, int[] nums) {
        this.minHeap = new PriorityQueue<>();
        for(int num:nums) {
            minHeap.offer(num);
            if (minHeap.size() > k) minHeap.poll();
        }
        this.k=k;
    }

    public int add(int val) {
        minHeap.offer(val);
        if(minHeap.size()>k) {
            minHeap.poll();
        }
        return minHeap.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */