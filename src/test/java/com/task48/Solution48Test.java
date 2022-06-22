package com.task48;

import static org.junit.jupiter.api.Assertions.*;
       
import java.util.Arrays;            
    
import org.junit.jupiter.api.Test;
        
class Solution48Test {

	Solution48 solution = new Solution48();
   
	@Test
	public void test1() {
		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int[][] expected = { { 7, 4, 1 }, { 8, 5, 2 }, { 9, 6, 3 } };
		solution.rotate(matrix);
		assertEquals(Arrays.deepToString(expected), Arrays.deepToString(matrix));
	}

	@Test
	public void test2() {
		int[][] matrix = { { 5, 1, 9, 11 }, { 2, 4, 8, 10 }, { 13, 3, 6, 7 }, { 15, 14, 12, 16 } };
		int[][] expected = { { 15, 13, 2, 5 }, { 14, 3, 4, 1 }, { 12, 6, 8, 9 }, { 16, 7, 10, 11 } };
		solution.rotate(matrix);
		assertEquals(Arrays.deepToString(expected), Arrays.deepToString(matrix));
	}
}
