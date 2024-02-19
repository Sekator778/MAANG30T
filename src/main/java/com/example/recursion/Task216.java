package com.example.recursion;

import java.util.ArrayList;
import java.util.List;

public class Task216 {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> waysCount = new ArrayList<>();
        getSumsWays(new ArrayList<>(), n, 1, k, waysCount);
        return waysCount;
    }

    private void getSumsWays(List<Integer> candidate, int sum, int startNum, int termsCount, List<List<Integer>> sumWays) {
        if (sum < 0) {
            return;
        }
        if (termsCount == 0) {
            if (sum == 0) {
                sumWays.add(new ArrayList<>(candidate));
            }
            return;
        }

        for (int num = startNum; num <= 9; num++) {
            candidate.add(num);
            getSumsWays(candidate, sum - num, num + 1, termsCount - 1, sumWays);
            candidate.removeLast();
        }
    }
}
