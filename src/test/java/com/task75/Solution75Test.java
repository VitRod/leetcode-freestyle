package com.task75;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
    
class Solution75Test {

	Solution75 s = new Solution75();
    
	@Test
	public void test1() {
		int[] nums = { 2, 0, 2, 1, 1, 0 };

		s.sortColors(nums);
		assertEquals(0, nums[0]);
		assertEquals(0, nums[1]);
		assertEquals(1, nums[2]);
		assertEquals(1, nums[3]);
		assertEquals(2, nums[4]);
		assertEquals(2, nums[5]);
	}

	@Test
	public void test2() {
		int[] nums = { 2, 0, 1 };
		s.sortColors(nums);
		assertEquals(0, nums[0]);
		assertEquals(1, nums[1]);
		assertEquals(2, nums[2]);
	}
}
