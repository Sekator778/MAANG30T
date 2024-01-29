package com.example.month_two;

public class Task01 {
    public void printFrogWays(int step) {
        printFrogWays("", step);
    }

    private void printFrogWays(String pathCandidate, int step) {
        if (step < 0 ) {
            return;
        }
             if (step == 0) {
            System.out.println(pathCandidate);
            return;
        }
        printFrogWays(pathCandidate + "1", step - 1);
        printFrogWays(pathCandidate + "2", step - 2);
    }
}
