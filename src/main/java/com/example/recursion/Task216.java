package com.example.recursion;

import java.util.ArrayList;
import java.util.List;

public class Task216 {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> waysCount = new ArrayList<>();
        getSumsWays(new ArrayList<>(), n, 1, k, waysCount);
        return waysCount;
    }

    private void getSumsWays(List<Integer> candidate, int targetSum, int startNum, int termsCount, List<List<Integer>> sumWays) {
        if (termsCount == 0) {
            if (targetSum == 0) {
                sumWays.add(new ArrayList<>(candidate));
            }
            return;
        }
        for (int num = startNum; num <= 9; num++) {
            if (targetSum < 0) {
                return;
            }
            candidate.add(num);
            getSumsWays(candidate, targetSum - num, num + 1, termsCount - 1, sumWays);
            candidate.removeLast();
        }
    }
}
