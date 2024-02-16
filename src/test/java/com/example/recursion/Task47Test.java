package com.example.recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task47Test {

    //    Example 1:
//
//Input: nums = [1,1,2]
//Output:
//[[1,1,2],
// [1,2,1],
// [2,1,1]]
    @Test
    void permuteUnique() {
        Task47 task47 = new Task47();
        int[] nums = {1, 1, 2};
        int[][] expected = {
                {1, 1, 2},
                {1, 2, 1},
                {2, 1, 1}
        };
        assertEquals(3, task47.permuteUnique(nums).size());
    }

    //Example 2:
//
//Input: nums = [1,2,3]
//Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
    @Test
    void permuteUnique2() {
        Task47 task47 = new Task47();
        int[] nums = {1, 2, 3};
        int[][] expected = {
                {1, 2, 3},
                {1, 3, 2},
                {2, 1, 3},
                {2, 3, 1},
                {3, 1, 2},
                {3, 2, 1}
        };
        assertEquals(6, task47.permuteUnique(nums).size());
    }
}