package com.task79;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Solution79Test {

	Solution79 s = new Solution79();
    
	@Test
	public void test1() {
		char[][] board = { { 'A', 'B', 'C', 'E' }, { 'S', 'F', 'C', 'S' }, { 'A', 'D', 'E', 'E' } };
		String word = "ABCCED";
		assertEquals(true, s.exist(board, word));
	}

	@Test
	public void test2() {
		char[][] board = { { 'A', 'B', 'C', 'E' }, { 'S', 'F', 'C', 'S' }, { 'A', 'D', 'E', 'E' } };
		String word = "SEE";
		assertEquals(true, s.exist(board, word));
	}

	@Test
	public void test3() {
		char[][] board = { { 'A', 'B', 'C', 'E' }, { 'S', 'F', 'C', 'S' }, { 'A', 'D', 'E', 'E' } };
		String word = "ABCB";
		assertEquals(false, s.exist(board, word));
	}
}
