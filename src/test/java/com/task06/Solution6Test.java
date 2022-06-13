package com.task06;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.task06.Solution6;


public class Solution6Test {
        
	Solution6 s = new Solution6();
	
    @Test
    public void test1() {
        
        assertEquals("PAHNAPLSIIGYIR", s.convert("PAYPALISHIRING", 3));
    }

    @Test
    public void test2() {
        assertEquals("PINALSIGYAHRPI", s.convert("PAYPALISHIRING", 4));
    }

    @Test
    public void test3() {
        assertEquals("A", s.convert("A", 1));
    }
}
