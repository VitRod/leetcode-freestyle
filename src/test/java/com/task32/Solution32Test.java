package com.task32;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Solution32Test {
	
	 Solution32 solution = new Solution32();
	    
	    @Test
	    public void test1() {
	        assertEquals(2, solution.longestValidParentheses("(()"));
	    }

	    @Test
	    public void test2() {
	        assertEquals(4, solution.longestValidParentheses(")()())"));
	    }

	    @Test
	    public void test3() {
	        assertEquals(0, solution.longestValidParentheses(""));
	    }
	}