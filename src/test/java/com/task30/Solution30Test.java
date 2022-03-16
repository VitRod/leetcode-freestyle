package com.task30;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class Solution30Test {

	Solution30 solution = new Solution30();

	@Test
	public void test1() {
		String s = "barfoothefoobarman";
		String[] words = { "foo", "bar" };
		List<Integer> expected = Arrays.asList(0, 9);
		List<Integer> actual = solution.findSubstring(s, words);
		assertEquals(expected, actual);
	}

	@Test
	public void test2() {
		String s = "wordgoodgoodgoodbestword";
		String[] words = { "word", "good", "best", "word" };
		List<Integer> expected = Arrays.asList();
		List<Integer> actual = solution.findSubstring(s, words);
		assertEquals(expected, actual);
	}

	@Test
	public void test3() {
		String s = "barfoofoobarthefoobarman";
		String[] words = { "bar", "foo", "the" };
		List<Integer> expected = Arrays.asList(6, 9, 12);
		List<Integer> actual = solution.findSubstring(s, words);
		assertEquals(expected, actual);
	}
}