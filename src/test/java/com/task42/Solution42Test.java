package com.task42;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Solution42Test {

	 Solution42 solution = new Solution42();
	   
	    @Test
	    public void test1() {
	        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
	        int expected = 6;
	        int actual = solution.trap(height);
	        assertEquals(expected, actual);
	    }

	    @Test
	    public void test2() {
	        int[] height = {4,2,0,3,2,5};
	        int expected = 9;
	        int actual = solution.trap(height);
	        assertEquals(expected, actual);
	    }
	}