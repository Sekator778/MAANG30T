package com.example.recursion;

import java.util.Arrays;

public class Task12 {
    public boolean makesquare(int[] matchsticks) {
        int perimeter = Arrays.stream(matchsticks).sum();
        if (perimeter % 4 != 0) {
            return false;
        }
        Arrays.sort(matchsticks);
        return canCreateSquare(new int[4], matchsticks.length - 1, matchsticks, perimeter / 4);
    }

    boolean canCreateSquare(int[] squareSidesLength, int endIndex, int[] matchsticks, int sideLength) {
        if (endIndex == -1) {
            return true;
        }
        for (int i = 0; i < 4; i++) {
            if (i > 0 && squareSidesLength[i - 1] == squareSidesLength[i]) {
                continue;
            }
//            Base case
            if (squareSidesLength[i] + matchsticks[endIndex] > sideLength) {
                continue;
            }
            squareSidesLength[i] += matchsticks[endIndex];
            if (canCreateSquare(squareSidesLength, endIndex - 1, matchsticks, sideLength)) {
                return true;
            }
            squareSidesLength[i] -= matchsticks[endIndex];
        }
        return false;
    }

}
