package com.example.month_one.task25;

import java.util.Stack;

/**
 * Created by dn070578noi on 07.01.24.
 */
public class Task25 {
    public int totalSteps(int[] nums) {
        int maxSteps = 0;
        // [0] - count times for deleted the element, [1] - value of element
        Stack<int[]> decStack = new Stack<>();

        for (int curNum : nums) {
            // always start from 1 time
            int currentCountDel = 1;
            // move to the left while the element is bigger than current
            while (!decStack.isEmpty()) {
                if (decStack.peek()[1] > curNum) break;

                // if the element is smaller than the current one, then we can't delete it
                currentCountDel = Math.max(decStack.peek()[0] + 1, currentCountDel);
                decStack.pop();
            }
            // if the stack is empty, push the element with 0 times its border element
            if (decStack.isEmpty()) {
                decStack.push(new int[]{0, curNum});
            } else {
                // if the stack is not empty, push the element with the number of times
                decStack.push(new int[]{currentCountDel, curNum});
                // update the maximum number of steps
                maxSteps = Math.max(maxSteps, currentCountDel);
            }
        }
        return maxSteps;
    }
}
