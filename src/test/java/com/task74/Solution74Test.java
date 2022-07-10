package com.task74;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Solution74Test {
    
	Solution74 s = new Solution74();
               
	@Test
	public void test1() {
		int[][] matrix = new int[][] { { 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34, 60 } };
		int target = 3;
		boolean expected = true;
		boolean actual = s.searchMatrix(matrix, target);
		assertEquals(expected, actual);
	}
   
	@Test
	public void test2() {
		int[][] matrix = new int[][] { { 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34, 60 } };
		int target = 13;
		boolean expected = false;
		boolean actual = s.searchMatrix(matrix, target);
		assertEquals(expected, actual);
	}
}
