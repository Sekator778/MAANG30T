package com.example.month_two;

import java.util.ArrayList;
import java.util.List;

public class Task04 {
    public List<String> findParenthesis(int parenthesisCount) {
        List<String> result = new ArrayList<>();
         findParenthesis("", parenthesisCount, parenthesisCount, result);
         return result;
    }

    private void findParenthesis(String candidate, int leftCount, int rightCount, List<String> result) {
        if (rightCount < leftCount || leftCount < 0) {
            return;
        }
        if (leftCount == 0 && rightCount == 0) {
            result.add(candidate);
            return;
        }
        findParenthesis(candidate + "(", leftCount - 1, rightCount, result);
        findParenthesis(candidate + ")",leftCount, rightCount - 1, result);
    }
}
