package com.task05;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Solution5Test {

	Solution5 s = new Solution5();

	@Test
	public void test1() {
		assertEquals("bab", s.longestPalindrome("babad"));
	}

	@Test
	public void test2() {
		assertEquals("bb", s.longestPalindrome("cbbd"));
	}
}