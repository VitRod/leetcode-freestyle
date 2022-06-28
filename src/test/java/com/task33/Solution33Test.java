package com.task33;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
       
class Solution33Test {
            
	Solution33 solution = new Solution33();
   
	@Test
	public void test1() {
		int[] nums = { 4, 5, 6, 7, 0, 1, 2 };
		int target = 0;
		int expected = 4;
		int actual = solution.search(nums, target);
		assertEquals(expected, actual);
	}

	@Test
	public void test2() {
		int[] nums = { 4, 5, 6, 7, 0, 1, 2 };
		int target = 3;
		int expected = -1;
		int actual = solution.search(nums, target);
		assertEquals(expected, actual);
	}

	@Test   
	public void test3() {
		int[] nums = { 1 };
		int target = 0;
		int expected = -1;
		int actual = solution.search(nums, target);
		assertEquals(expected, actual);
	}
}
