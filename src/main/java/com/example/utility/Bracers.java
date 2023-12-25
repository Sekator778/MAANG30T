package com.example.utility;

/**
 * Created by dn070578noi on 25.12.23.
 */
public class Bracers {
    public static void main(String[] args) {
        System.out.println("first");
        System.out.println(getFirst(10, 5));
        System.out.println("second");
        System.out.println(getSecond(10, 5));

    }

    private static int getFirst(int a, int b) {
        return 1 + a - (b + 1);
    }

    private static int getSecond(int a, int b) {
        return 1 + (a - b + 1);
    }
}
