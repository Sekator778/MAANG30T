package com.one_year.matrix_hash_tables;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> distinctNums = new HashSet<>();

        for(int num:nums) {
            if (!distinctNums.add(num)) {
                return true;
            }
        }
        return false;
    }
}