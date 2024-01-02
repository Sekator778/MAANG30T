package com.example.month_one.task18;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Created by dn070578noi on 13.12.23.
 * <p>
 * * Your MedianFinder object will be instantiated and called as such:
 * * MedianFinder obj = new MedianFinder();
 * * obj.addNum(num);
 * * double param_2 = obj.findMedian();
 */
public class Task18 {
    public final Queue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
    public final Queue<Integer> minHeap = new PriorityQueue<>();

    public Task18() {

    }

    public void addNum(int num) {
        if (maxHeap.size() == 0) {
            maxHeap.add(num);
        } else if (maxHeap.size() > minHeap.size()) {
            if (num < maxHeap.peek()) {
                minHeap.add(maxHeap.poll());
                maxHeap.add(num);
            } else {
                minHeap.add(num);
            }
        } else if (minHeap.size() == maxHeap.size()) {
            if (num > maxHeap.peek() && num > minHeap.peek()) {
                maxHeap.add(minHeap.poll());
                minHeap.add(num);
            } else {
                maxHeap.add(num);
            }
        }
    }

    public double findMedian() {
        if (maxHeap.size() == minHeap.size()) {
            return (maxHeap.peek() + minHeap.peek()) / 2.0;
        }
        return (double) maxHeap.peek();
    }
}
