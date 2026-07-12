package com.example.utility;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Created by dn070578noi on 01.12.23.
 * <p>
 * Class for storing list tail and size.
 */
@Data
@AllArgsConstructor
public class ListTailAndSize {
    ListNode tail;
    int size;
}
