package com.example.month_one;

import com.example.month_one.task18.Task18;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Task1415Test {

//    Example 1:
//    Input
//["MedianFinder", "addNum", "addNum", "findMedian", "addNum", "findMedian"]
//        [[], [1], [2], [], [3], []]
//    Output
//[null, null, null, 1.5, null, 2.0]
//
//    Explanation
//    MedianFinder medianFinder = new MedianFinder();
//medianFinder.addNum(1);    // arr = [1]
//medianFinder.addNum(2);    // arr = [1, 2]
//medianFinder.findMedian(); // return 1.5 (i.e., (1 + 2) / 2)
//medianFinder.addNum(3);    // arr[1, 2, 3]
//medianFinder.findMedian(); // return 2.0

    @Test
    void test1() {
        Task18 task18 = new Task18();
        task18.addNum(1);
        task18.addNum(2);
        assertEquals(1.5, task18.findMedian());
        task18.addNum(3);
        assertEquals(2.0, task18.findMedian());
    }

//    Example 2:
//    Input
//["MedianFinder", "addNum", "findMedian", "addNum", "findMedian"]
//        [[], [2], [], [3], []]
//    Output
//[null, null, 2.0, null, 2.5]
//
//    Explanation
//    MedianFinder medianFinder = new MedianFinder();
//medianFinder.addNum(2);    // arr = [2]
//medianFinder.findMedian(); // return 2.0
//medianFinder.addNum(3);    // arr = [2, 3]
//medianFinder.findMedian(); // return 2.5

    @Test
    void test2() {
        Task18 task18 = new Task18();
        task18.addNum(2);
        assertEquals(2.0, task18.findMedian());
        task18.addNum(3);
        assertEquals(2.5, task18.findMedian());
    }

    @Test
    void test3() {
        Task18 task18 = new Task18();
        task18.addNum(1);
        task18.addNum(5);
        task18.addNum(8);
        task18.addNum(9);
        task18.addNum(2);
        assertEquals(5.0, task18.findMedian());
        task18.addNum(12);
        assertEquals(6.5, task18.findMedian());
    }
}