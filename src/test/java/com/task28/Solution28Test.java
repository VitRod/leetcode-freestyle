package com.task28;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Solution28Test {

	Solution28 solution = new Solution28();

	@Test
	public void test1() {
		assertEquals(2, solution.strStr("hello", "ll"));
	}

	@Test
	public void test2() {
		assertEquals(-1, solution.strStr("aaaaa", "bba"));
	}

	@Test
	public void test3() {
		assertEquals(0, solution.strStr("", ""));
	}
}