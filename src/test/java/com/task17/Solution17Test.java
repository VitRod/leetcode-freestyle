package com.task17;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class Solution17Test {

	Solution17 s = new Solution17();

	@Test
	public void testLetterCombinations() {
		List<String> result = s.letterCombinations("23");
		assertEquals(Arrays.asList("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"), result);
	}

	@Test
	public void testLetterCombinations2() {
		List<String> result = s.letterCombinations("");
		assertEquals(Arrays.asList(), result);
	}

	@Test
	public void testLetterCombinations3() {
		List<String> result = s.letterCombinations("2");
		assertEquals(Arrays.asList("a", "b", "c"), result);
	}
}