package com.example.month_one.task24;

import java.util.Stack;

/**
 * Created by dn070578noi on 06.01.24.
 */
public class Task24 {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> decStack = new Stack<>();
        int[] temperatureDistance = new int[temperatures.length];

        for (int end = 0; end < temperatures.length; end++) {
            while (!decStack.isEmpty()) {
                int start = decStack.peek();
                if (temperatures[start] >= temperatures[end]) break;

                int distance = end - start;
                temperatureDistance[start] = distance;
                decStack.pop();
            }
            decStack.push(end);
        }
        return temperatureDistance;
    }
}
