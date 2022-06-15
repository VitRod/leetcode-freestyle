package com.task08;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
         
class Solution8Test {
	                   
  Solution8 s = new Solution8();
           
	@Test
    public void test1() {     
        assertEquals(42, s.myAtoi("42"));
    }

    @Test
    public void test2() {        
        assertEquals(-42, s.myAtoi("   -42"));
    }

    @Test
    public void test3() {       
        assertEquals(4193, s.myAtoi("4193 with words"));
    }
}
