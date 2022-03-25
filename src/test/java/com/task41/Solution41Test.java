package com.task41;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Solution41Test {

	Solution41 solution = new Solution41();

	@Test
	public void test1() {
		int[] nums = { 1, 2, 0 };
		int expected = 3;
		int actual = solution.firstMissingPositive(nums);
		assertEquals(expected, actual);
	}

	@Test
	public void test2() {
		int[] nums = { 3, 4, -1, 1 };
		int expected = 2;
		int actual = solution.firstMissingPositive(nums);
		assertEquals(expected, actual);
	}

	@Test
	public void test3() {
		int[] nums = { 7, 8, 9, 11, 12 };
		int expected = 1;
		int actual = solution.firstMissingPositive(nums);
		assertEquals(expected, actual);
	}
}