package com.task63;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
    
class Solution63Test {    
    
	Solution63 s = new Solution63();
             
	@Test        
	public void test1() {    
		int[][] grid = new int[][] { { 0, 0, 0 }, { 0, 1, 0 }, { 0, 0, 0 } };
		assertEquals(2, s.uniquePathsWithObstacles(grid));
	}
   
	@Test
	public void test2() {
		int[][] grid = new int[][] { { 0, 1 }, { 0, 0 } };
		assertEquals(1, s.uniquePathsWithObstacles(grid));
	}
}
