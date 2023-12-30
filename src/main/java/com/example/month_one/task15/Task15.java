package com.example.month_one.task15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Created by dn070578noi on 11.12.23.
 */
public class Task15 {
    public int maximumSumBad(int[] nums) {
        int SIZE = 81;
        List<Integer>[] array = new ArrayList[SIZE + 1];

        for (int i : nums) {
            int digitSum = getDigitSum(i);
            if (array[digitSum] == null) {
                array[digitSum] = new ArrayList<>();
            }
            array[digitSum].add(i);
        }
        int max = -1;

        for (List<Integer> list : array) {
            if (list != null && list.size() > 1) {
                if (list.size() > 2) list.sort(Collections.reverseOrder());
                max = Math.max(max, (list.getFirst() + list.get(1)));
            }
        }
        return max;
    }

    public int maximumSum(int[] nums) {
        int[] array = new int[82];
        int result = -1;
        for (int i : nums) {
            int index = getDigitSum(i);
            if (array[index] != 0) {
                int candidate = i + array[index];
                result = Math.max(result, candidate);
                if (i > array[index]) {
                    array[index] = i;
                }
            } else {
                array[index] = i;
            }
        }
        return result;
    }

    public int maximumSumQueue(int[] nums) {
        int DIGITAL_MAX_SUM = 81;
        int[] groupedNums = new int[DIGITAL_MAX_SUM + 1];
        Queue<Integer>[] queue = new PriorityQueue[DIGITAL_MAX_SUM + 1];
        queue[0] = new PriorityQueue<>(Comparator.reverseOrder());
        int maxSum = -1;

        for (int num : nums) {
            int digitalSum = getDigitSum(num);

            if (groupedNums[digitalSum] == 0) {
                groupedNums[digitalSum] = num;
            } else {
                int currentMaxSum = groupedNums[digitalSum];
                int maxSumCandidate = currentMaxSum + num;
                if (maxSumCandidate > maxSum) {
                    maxSum = maxSumCandidate;
                }
                if (num > currentMaxSum) {
                    groupedNums[digitalSum] = num;
                }
            }
        }
        return maxSum;
    }


    int getDigitSum(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
