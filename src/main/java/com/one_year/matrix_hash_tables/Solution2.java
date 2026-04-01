package com.one_year.matrix_hash_tables;

import java.util.HashSet;
import java.util.Set;

class Solution2 {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 1) {
            return 1;
        }
        Set<Integer> accumulator = new HashSet<>();

        for(int num:nums) {
            accumulator.add(num);
        }
        int maxConsecutive =0;
        int curentMax=0;

        for(int i:accumulator) {
            if(!accumulator.contains(i-1)){

                while(accumulator.contains(i)) {
                    curentMax++;
                    i++;
                }
            }
            maxConsecutive = Math.max(maxConsecutive, curentMax);
        }
        return maxConsecutive;
    }
}