package com.example.month_one.task26;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Task26Test {
    //    Example 1:
//
//Input: nums1 = [1,7,11], nums2 = [2,4,6]
//Output: [1,2]
//Explanation: The closest pair is [1,2]. There are no other pairs with a smaller difference.
    @Test
    void findMinAbsDiff() {
        int[] nums1 = {1, 7, 11};
        int[] nums2 = {2, 4, 6};
        int[] expected = {1, 2};
        int[] actual = new Task26().findMinAbsDiff(nums1, nums2);
        assertArrayEquals(expected, actual);
    }

    //    Example 2:
//
//Input: nums1 = [1,4,6,10], nums2 = [2,4,11,12]
//Output: [4,4]
    @Test
    void findMinAbsDiff2() {
        int[] nums1 = {1, 4, 6, 10};
        int[] nums2 = {2, 4, 11, 12};
        int[] expected = {4, 4};
        int[] actual = new Task26().findMinAbsDiff(nums1, nums2);
        assertArrayEquals(expected, actual);
    }

    //    Example 3:
//
//Input: nums1 = [6, 10, 19], nums2 = [1, 2, 9, 11, 25]
//Output: [10, 9]
    @Test
    void findMinAbsDiff3() {
        int[] nums1 = {6, 10, 19};
        int[] nums2 = {1, 2, 9, 11, 25};
        int[] expected = {10, 9};
        int[] actual = new Task26().findMinAbsDiff(nums1, nums2);
        assertArrayEquals(expected, actual);
    }
}