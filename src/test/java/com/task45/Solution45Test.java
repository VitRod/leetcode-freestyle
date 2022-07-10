package com.task45;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
     
class Solution45Test {
            
	Solution45 solution = new Solution45();
    
	@Test
	public void test1() {
		int[] nums = { 2, 3, 1, 1, 4 };
		int expected = 2;
		int actual = solution.jump(nums);
		assertEquals(expected, actual);
	}
     
	@Test
	public void test2() {
		int[] nums = { 2, 3, 0, 1, 4 };
		int expected = 2;
		int actual = solution.jump(nums);
		assertEquals(expected, actual);
	}
}
