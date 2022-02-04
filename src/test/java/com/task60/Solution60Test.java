package com.task60;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Solution60Test {

	Solution60 solution = new Solution60();

	@Test
	public void test1() {
		assertEquals("213", solution.getPermutation(3, 3));
	}

	@Test
	public void test2() {
		assertEquals("2314", solution.getPermutation(4, 9));
	}

	@Test
	public void test3() {
		assertEquals("123", solution.getPermutation(3, 1));
	}

}
