package com.task09;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class Solution9Test {

	@Test
	public void testIsPalindrome() {
		Solution9 solution = new Solution9();
		assertTrue(solution.isPalindrome(121));
		assertFalse(solution.isPalindrome(-121));
		assertFalse(solution.isPalindrome(10));
	}
}
