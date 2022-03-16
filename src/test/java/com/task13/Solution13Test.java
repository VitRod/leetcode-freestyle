package com.task13;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Solution13Test {

	@Test
	public void testRomanToInt() {
		Solution13 solution = new Solution13();
		assertEquals(3, solution.romanToInt("III"));
		assertEquals(58, solution.romanToInt("LVIII"));
		assertEquals(1994, solution.romanToInt("MCMXCIV"));
	}
}