package com.task34;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Solution34Test {
	 Solution34 solution = new Solution34();
	    
	    @Test
	    public void test1() {
	        int[] nums = {5,7,7,8,8,10};
	        int target = 8;
	        int[] result = solution.searchRange(nums, target);
	        assertEquals(3, result[0]);
	        assertEquals(4, result[1]);
	    }

	    @Test
	    public void test2() {
	        int[] nums = {5,7,7,8,8,10};
	        int target = 6;
	        int[] result = solution.searchRange(nums, target);
	        assertEquals(-1, result[0]);
	        assertEquals(-1, result[1]);
	    }

	    @Test
	    public void test3() {
	        int[] nums = {};
	        int target = 0;
	        int[] result = solution.searchRange(nums, target);
	        assertEquals(-1, result[0]);
	        assertEquals(-1, result[1]);
	    }
	}