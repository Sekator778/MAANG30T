package com.example.recursion;

public class Task1947 {
    public int maxCompatibilitySumLow(int[][] students, int[][] mentors) {
        int[] sum = new int[1];
        getMaxSum(students, 0, mentors, sum);
        return sum[0];
    }

    public int maxCompatibilitySum(int[][] students, int[][] mentors) {
        int[] maxSum = new int[1];
        getMaxSumImprove(students, mentors, 0, 0, maxSum);
        return maxSum[0];
    }

    private void getMaxSumImprove(int[][] arr1, int[][] arr2Permutation, int startIndex, int sum, int[] maxSum) {
        if (startIndex == arr1.length) {
            maxSum[0] = Math.max(maxSum[0], sum);
            return;
        }
        for (int i = startIndex; i < arr1.length; i++) {
            swap(arr1, startIndex, i);
            int newSum = sum + getSum(arr1[startIndex], arr2Permutation[startIndex]);
            getMaxSumImprove(arr1, arr2Permutation, startIndex + 1, newSum, maxSum);
            swap(arr1, startIndex, i);
        }
    }

    private void getMaxSum(int[][] arr1Permutation, int startIndex, int[][] arr2, int[] max) {
        if (startIndex == arr1Permutation.length - 1) {
            max[0] = Math.max(max[0], getSum(arr1Permutation, arr2));
            return;
        }
        for (int i = 0; i < arr1Permutation.length; i++) {
            swap(arr1Permutation, startIndex, i);
            getMaxSum(arr1Permutation, startIndex + 1, arr2, max);
            swap(arr1Permutation, startIndex, i);
        }
    }

    private void swap(int[][] arr1Permutation, int from, int to) {
        int[] temp = arr1Permutation[from];
        arr1Permutation[from] = arr1Permutation[to];
        arr1Permutation[to] = temp;
    }

    private int getSum(int[] arr1, int[] arr2) {
        int sum = 0;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == arr2[i]) {
                sum += 1;
            }
        }
        return sum;
    }

    private int getSum(int[][] arr1, int[][] arr2) {
        int sum = 0;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                if (arr1[i][j] == arr2[i][j]) {
                    sum += 1;
                }
            }
        }
        return sum;
    }
}
