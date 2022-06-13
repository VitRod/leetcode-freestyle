package com.task20;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Solution20Test {

	Solution20 solution = new Solution20();

	@Test
	public void test1() {
		assertEquals(true, solution.isValid("()"));
	}

	@Test
	public void test2() {
		assertEquals(true, solution.isValid("()[]{}"));
	}

	@Test
	public void test3() {
		assertEquals(false, solution.isValid("(]"));
	}
}
