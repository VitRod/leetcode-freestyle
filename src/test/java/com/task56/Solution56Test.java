package com.task56;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class Solution56Test {
     
	Solution56 s = new Solution56();
     
	@Test
	public void test1() {
		int[][] intervals = new int[][] { { 1, 3 }, { 2, 6 }, { 8, 10 }, { 15, 18 } };
		int[][] expected = new int[][] { { 1, 6 }, { 8, 10 }, { 15, 18 } };
		assertEquals(Arrays.deepToString(expected), Arrays.deepToString(s.merge(intervals)));
	}

	@Test
	public void test2() {
		int[][] intervals = new int[][] { { 1, 4 }, { 4, 5 } };
		int[][] expected = new int[][] { { 1, 5 } };
		assertEquals(Arrays.deepToString(expected), Arrays.deepToString(s.merge(intervals)));
	}

	@Test
	public void test3() {
		int[][] intervals = new int[][] { { 1, 5 }, { 2, 3 } };
		int[][] expected = new int[][] { { 1, 5 } };
		assertEquals(Arrays.deepToString(expected), Arrays.deepToString(s.merge(intervals)));
	}
}
