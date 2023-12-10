package com.example;

/**
 * Created by dn070578noi on 10.12.23.
 */
public class Task12 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int lastIndexLeft = m - 1;
        int lastIndexRight = n - 1;

        int insertionIndex = nums1.length - 1;

        while (lastIndexLeft != -1 && lastIndexRight != -1) {
            if (nums1[lastIndexLeft] > nums2[lastIndexRight]) {
                nums1[insertionIndex] = nums1[lastIndexLeft];
                lastIndexLeft -= 1;
            } else {
                nums1[insertionIndex] = nums2[lastIndexRight];
                lastIndexRight -= 1;
            }
            insertionIndex -= 1;
        }
        while (lastIndexRight != -1) {
            nums1[insertionIndex] = nums2[lastIndexRight];
            lastIndexRight -= 1;
            insertionIndex -= 1;
        }
    }
}
