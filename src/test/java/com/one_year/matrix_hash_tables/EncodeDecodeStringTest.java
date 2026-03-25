package com.one_year.matrix_hash_tables;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Sekator
 * @created 25 Mar, 2026
 */
class EncodeDecodeStringTest {

    EncodeDecodeString task = new EncodeDecodeString();

    @Test
    void test1(){
     List<String> dummy_input = List.of("Hello", "World");

        List<String> expect = List.of("Hello", "World");

        String encode = task.encode(dummy_input);
        List<String> actual = task.decode(encode);

        assertEquals(expect, actual);
    }

}