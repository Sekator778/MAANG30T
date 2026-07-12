package com.one_year.kadano;

/**
 * @author Sekator
 * @created 15 Mar, 2026
 */
public class MaximumSumCircularSubarray {
    public int maxSubarraySumCircular(int[] nums) {
        if(nums.length == 1) return nums[0];

        int maxSumIn = getMaxSubArray(nums);
        if(maxSumIn < 0) return maxSumIn;
        int sumOfAll = 0;

        for(int i=0; i< nums.length; i++) {
            sumOfAll += nums[i];
            nums[i] = -nums[i];
        }
        int maxSumForNegative = -getMaxSubArray(nums);

        return Math.max(maxSumIn, (sumOfAll - maxSumForNegative));

    }

    int getMaxSubArray(int[] nums) {
        int curSum = 0;
        int maxSum = nums[0];

        for(int num: nums){
            curSum = curSum + num;
            if(curSum > maxSum) maxSum = curSum;
            if(curSum < 0) curSum = 0;
        }
        return maxSum;
    }
}
