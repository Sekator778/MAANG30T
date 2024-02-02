package com.example.month_two;

import java.util.ArrayList;
import java.util.List;

/**
 * if  you add something to result
 * and went to recursion
 * you should remove it from result !!!
 */
public class Lecture08 {
    public static void main(String[] args) {
        new Lecture08().printBin(new ArrayList<>(), 2);
    }
    void printBin(List<Character> bin, int size) {
        if (bin.size() == size) {
            System.out.println(bin);
            return;
        }
//        add element to result
        bin.add('0');
//        go to recursion
        printBin(bin, size);
//        remove element from result
        bin.removeLast();

        bin.add('1');
        printBin(bin, size);
        bin.remove(bin.size() - 1);
    }

}
