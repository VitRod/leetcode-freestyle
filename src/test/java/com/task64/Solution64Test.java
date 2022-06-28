package com.task64;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
     
class Solution64Test {
                 
	Solution64 s = new Solution64();
                    
	@Test    
	public void test1() {
		int[][] grid = { { 1, 3, 1 }, { 1, 5, 1 }, { 4, 2, 1 } };
		assertEquals(7, s.minPathSum(grid));
	}

	@Test
	public void test2() {
		int[][] grid = { { 1, 2, 3 }, { 4, 5, 6 } };
		assertEquals(12, s.minPathSum(grid));
	}
}
