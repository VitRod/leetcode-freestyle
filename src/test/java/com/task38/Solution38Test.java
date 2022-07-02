package com.task38;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
                
class Solution38Test {
	    
	  Solution38 solution = new Solution38();
	       
	    @Test
	    public void test1() {
	        assertEquals("1", solution.countAndSay(1));
	    }

	    @Test
	    public void test2() {
	        assertEquals("11", solution.countAndSay(2));
	    }

	    @Test
	    public void test3() {
	        assertEquals("21", solution.countAndSay(3));
	    }
	}
