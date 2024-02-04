package com.example.recursion;

public class Task08 {
    public int findTargetSumWays(int[] nums, int target) {
      return  helper(target, 0, nums);
    }

    private int helper(int target, int index, int[] num) {
        if (index == num.length) {
            if (target == 0) {
                return 1;
            }
            else {
                return 0;
            }
        }

     return   helper(target - num[index], index+1, num) +
        helper(target + num[index], index+1, num);
    }

}
