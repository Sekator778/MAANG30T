package com.example.recursion;

import java.util.ArrayList;
import java.util.List;

public class Task39 {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> uniqueCombinations = new ArrayList<>();
        getUniqueCombs(new ArrayList<>(), target, 0, candidates, uniqueCombinations);
        return uniqueCombinations;
    }

    private void getUniqueCombs(List<Integer> candidate, int targetSum, int startIndex, int[] nums, List<List<Integer>> uniqueCombinations) {
        if (targetSum == 0) {
            uniqueCombinations.add(new ArrayList<>(candidate));
            return;
        }

        for (int i = startIndex; i < nums.length; i++) {
            if (targetSum < 0) {
                return;
            }
            int newSum = targetSum - nums[i];
            candidate.add(nums[i]);
            getUniqueCombs(candidate, newSum, i, nums, uniqueCombinations);
            candidate.removeLast();
        }
    }
}
