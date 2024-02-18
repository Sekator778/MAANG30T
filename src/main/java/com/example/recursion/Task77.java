package com.example.recursion;

import java.util.ArrayList;
import java.util.List;

public class Task77 {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> combinations = new ArrayList<>();
        getCombinations(new ArrayList<>(), 1, n, k, combinations);
        return combinations;
    }

    private void getCombinations(List<Integer> combinationCandidate, int startNum, int lastNum,
                                 int size, List<List<Integer>> combinations) {
        if (combinationCandidate.size() == size) {
            combinations.add(new ArrayList<>(combinationCandidate));
            return;
        }
        for (int num = startNum; num <= lastNum; num++) {
            combinationCandidate.add(num);
            getCombinations(combinationCandidate, num + 1, lastNum, size, combinations);
            combinationCandidate.removeLast();

        }
    }
}
