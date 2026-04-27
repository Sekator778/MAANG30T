package com.one_year.stack;

import java.util.ArrayDeque;
import java.util.Deque;

class EvalRPN {
    public int evalRPN(String[] tokens) {
        Deque<Integer> stack = new ArrayDeque<>();
        for (String token : tokens) {
            switch (token) {
                case "+", "-", "*", "/" -> {
                    int right = stack.pop();
                    int left = stack.pop();
                    int result = switch (token) {
                        case "+" -> left + right;
                        case "-" -> left - right;
                        case "*" -> left * right;
                        case "/" -> left / right;
                        default -> 0;
                    };
                    stack.push(result);
                }
                default -> stack.push(Integer.parseInt(token));
            }
        }
        return stack.pop();
    }
}