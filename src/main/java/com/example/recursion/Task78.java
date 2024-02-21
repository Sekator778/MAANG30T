package com.example.recursion;

import java.util.ArrayList;
import java.util.List;

public class Task78 {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> powerSet = new ArrayList<>();
        gerPowerSet(new ArrayList<>(), 0, nums, powerSet);
        return powerSet;
    }

    private void gerPowerSet(List<Integer> subset, int startIndex, int[] nums, List<List<Integer>> powerSet) {
        powerSet.add(new ArrayList<>(subset));

        for (int i = startIndex; i < nums.length; i++) {
            subset.add(nums[i]);
            gerPowerSet(subset, i + 1, nums, powerSet);
            subset.removeLast();
        }
    }
}
