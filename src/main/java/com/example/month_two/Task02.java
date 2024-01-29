package com.example.month_two;

public class Task02 {

    public void findParenthesisCount(int parenthesisCount) {
        findParenthesisCount("", parenthesisCount, parenthesisCount);
    }

    private void findParenthesisCount(String result, int leftCount, int rightCount) {
        if (rightCount < leftCount || leftCount < 0) {
            return;
        }
        if (leftCount == 0 && rightCount == 0) {
            System.out.println(result);
            return;
        }
        findParenthesisCount(result + "(", leftCount - 1, rightCount);
        findParenthesisCount(result + ")", leftCount, rightCount - 1);
    }
}
