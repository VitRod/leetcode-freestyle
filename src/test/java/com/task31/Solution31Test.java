package com.task31;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
              
import org.junit.jupiter.api.Test;    
                  
class Solution31Test {
	Solution31 solution = new Solution31();

	@Test
	public void test1() {
		int[] nums = { 1, 2, 3 };
		int[] expected = { 1, 3, 2 };
		solution.nextPermutation(nums);
		assertEquals(Arrays.toString(expected), Arrays.toString(nums));
	}

	@Test
	public void test2() {
		int[] nums = { 3, 2, 1 };
		int[] expected = { 1, 2, 3 };
		solution.nextPermutation(nums);
		assertEquals(Arrays.toString(expected), Arrays.toString(nums));
	}

	@Test
	public void test3() {
		int[] nums = { 1, 1, 5 };
		int[] expected = { 1, 5, 1 };
		solution.nextPermutation(nums);
		assertEquals(Arrays.toString(expected), Arrays.toString(nums));
	}

	@Test
	public void test6() {
		int[] nums = { 2, 3, 1 };
		int[] expected = { 3, 1, 2 };
		solution.nextPermutation(nums);
		assertEquals(Arrays.toString(expected), Arrays.toString(nums));
	}

}
