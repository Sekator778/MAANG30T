package com.example.recursion;

import java.util.ArrayList;
import java.util.List;

/**
 * all permutations of an array
 */
public class Task16 {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> permutations = new ArrayList<>();
        getPermutation(0, nums, permutations);
        return permutations;
    }

    private void getPermutation(int startIndex, int[] nums, List<List<Integer>> permutations) {
        if (startIndex == nums.length) {
            List<Integer> permutation = new ArrayList<>();
            for (int num : nums) {
                permutation.add(num);
            }
            permutations.add(permutation);
        }
        for (int i = startIndex; i < nums.length; i++) {
            swap(nums, startIndex, i);

            getPermutation(startIndex + 1, nums, permutations);
            swap(nums, startIndex, i);
        }
    }

    private void swap(int[] nums, int from, int to) {
        int temp = nums[from];
        nums[from] = nums[to];
        nums[to] = temp;
    }
}
