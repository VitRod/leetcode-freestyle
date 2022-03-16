package com.task11;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Solution11Test {

	Solution11 s = new Solution11();

	@Test
	public void test1() {
		int[] input = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
		int expected = 49;
		assertEquals(expected, s.maxArea(input));
	}

	@Test
	public void test2() {
		int[] input = { 1, 1 };
		int expected = 1;
		assertEquals(expected, s.maxArea(input));
	}
}
