package com.example.recursion;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Task47 {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> uniqPerms = new ArrayList<>();
        getUniquePermutations(nums, 0, uniqPerms);
        return uniqPerms;
    }

    public void getUniquePermutations(int[] nums, int startIndex, List<List<Integer>> uniqPerms) {
        if (startIndex == nums.length - 1) {
            List<Integer> permutation = new ArrayList<>();
            for (int num : nums) {
                permutation.add(num);
            }
            uniqPerms.add(permutation);
        }
        Set<Integer> usedNums = new HashSet<>();
        for (int i = startIndex; i < nums.length; i++) {
            if (usedNums.contains(nums[i])) {
                continue;
            }
            swap(nums, startIndex, i);
            getUniquePermutations(nums, startIndex + 1, uniqPerms);
            swap(nums, startIndex, i);
            usedNums.add(nums[i]);
        }
    }

    private void swap(int[] nums, int from, int to) {
        int temp = nums[from];
        nums[from] = nums[to];
        nums[to] = temp;
    }
}
