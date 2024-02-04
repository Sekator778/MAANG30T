package com.example.recursion;

/**
 * Created by dn070578noi on 14.01.24.
 */
public class SumElArray {
    public int sumElInArray(int[] arr, int n) {
        /* Base case: If n is 0, return 0 element */
        if (n == 0) return 0;
        /* Recursive case: otherwise, return sum of current element and n-1 elements */
        return arr[n - 1] + sumElInArray(arr, n - 1);
    }

    public int factorial(int n) {
        /* Base case: Factorial of 0 is 1 */
        if (n == 0) {
            return 1;
        } else {
            /* Recursive call: Factorial of n is n * factorial(n-1) */
            return n * factorial(n - 1);
        }
    }
}
