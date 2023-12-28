package com.example.month_one;

import com.example.month_one.task12.Task12;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Task12Test {

    //    Example 1:
//    Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
//    Output: [1,2,2,3,5,6]
//    Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
//    The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.
    @Test
    void test() {
        Task12 task12 = new Task12();
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};

        task12.merge(nums1, 3, nums2, 3);
        assertEquals(1, nums1[0]);
        assertEquals(2, nums1[1]);
        assertEquals(2, nums1[2]);
        assertEquals(3, nums1[3]);
        assertEquals(5, nums1[4]);
        assertEquals(6, nums1[5]);
    }

    //            Example 2:
//    Input: nums1 = [1], m = 1, nums2 = [], n = 0
//    Output: [1]
//    Explanation: The arrays we are merging are [1] and [].
//    The result of the merge is [1].
    @Test
    void test2() {
        Task12 task12 = new Task12();
        int[] nums1 = {1};
        int[] nums2 = {};

        task12.merge(nums1, 1, nums2, 0);
        assertEquals(1, nums1[0]);
    }

    //    Example 3:
//    Input: nums1 = [0], m = 0, nums2 = [1], n = 1
//    Output: [1]
//    Explanation: The arrays we are merging are [] and [1].
//    The result of the merge is [1].
//    Note that because m = 0, there are no elements in nums1. The 0 is only there to ensure the merge result can fit in nums1.
    @Test
    void test3() {
        Task12 task12 = new Task12();
        int[] nums1 = {0};
        int[] nums2 = {1};

        task12.merge(nums1, 0, nums2, 1);
        assertEquals(1, nums1[0]);
    }
}