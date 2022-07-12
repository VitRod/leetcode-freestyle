package com.task07;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Solution7Test {
           
	@Test
    public void test1() {
        Solution7 s = new Solution7();
        
        assertEquals(0, s.reverse(0));
        assertEquals(1, s.reverse(1));
        assertEquals(-1, s.reverse(-1));
        assertEquals(123, s.reverse(321));
        assertEquals(-123, s.reverse(-321));
        assertEquals(21, s.reverse(120));
        assertEquals(0, s.reverse(Integer.MAX_VALUE));
        assertEquals(0, s.reverse(Integer.MIN_VALUE));
    }
}    
