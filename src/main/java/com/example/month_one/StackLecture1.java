package com.example.month_one;

import lombok.extern.slf4j.Slf4j;

/**
 * Created by dn070578noi on 12.01.24.
 */
@Slf4j
public class StackLecture1 {
    public static void foo(String[] arr) {
        arr[0] = "i am changed in foo";
        arr = null;
    }

    public static void main(String[] args) {
        String[] arr = new String[]{"i am arr"};
        log.info(arr[0]);
        foo(arr);
        log.info(arr[0]);
    }
}
