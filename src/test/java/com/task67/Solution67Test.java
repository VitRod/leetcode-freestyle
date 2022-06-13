package com.task67;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Solution67Test {

	Solution67 s = new Solution67();

    @Test
    public void test1() {
        assertEquals("100", s.addBinary("11", "1"));
    }

    @Test
    public void test2() {
        assertEquals("10101", s.addBinary("1010", "1011"));
    }
}