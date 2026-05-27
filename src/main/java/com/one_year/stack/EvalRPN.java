package com.one_year.stack;

import java.util.ArrayDeque;
import java.util.Deque;

class EvalRPN {
    public int evalRPN(String[] tokens) {
        Deque<Integer> stack = new ArrayDeque<>();
        for (String token : tokens) {
            switch (token) {
                case "+" -> {
                    int r = stack.pop();
                    stack.push(stack.pop() + r);
                }
                case "-" -> {
                    int r = stack.pop();
                    stack.push(stack.pop() - r);
                }
                case "*" -> {
                    int r = stack.pop();
                    stack.push(stack.pop() * r);
                }
                case "/" -> {
                    int r = stack.pop();
                    stack.push(stack.pop() / r);
                }
                default -> stack.push(Integer.parseInt(token));
            }
        }
        return stack.pop();
    }
}