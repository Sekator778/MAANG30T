package com.example.recursion;

import java.util.ArrayList;
import java.util.List;

/**
 * all arrangements of an array(as task 16 but with a size)
 */
public class Task19 {

    public List<List<Integer>> getArrangements(int[] nums, int size) {
        List<List<Integer>> arrangements = new ArrayList<>();
        getArrangements(nums, 0, size, arrangements);
        return arrangements;
    }

    private void getArrangements(int[] nums, int startIndex, int size, List<List<Integer>> arrangements) {
        if (startIndex == size) {
            List<Integer> arrangement = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                arrangement.add(nums[i]);
            }
            arrangements.add(arrangement);
        }
        for (int i = startIndex; i < nums.length; i++) {
            swap(nums, startIndex, i);

            getArrangements(nums, startIndex + 1, size, arrangements);
            swap(nums, startIndex, i);
        }
    }

    private void swap(int[] nums, int from, int to) {
        int temp = nums[from];
        nums[from] = nums[to];
        nums[to] = temp;
    }
}
