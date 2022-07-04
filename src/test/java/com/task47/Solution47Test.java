package com.task47;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;
        
import org.junit.jupiter.api.Test;
               
class Solution47Test {

	Solution47 solution = new Solution47();

	@Test     
	public void test1() {
		int[] nums = { 1, 1, 2 };
		List<List<Integer>> expected = Arrays.asList(Arrays.asList(1, 1, 2), Arrays.asList(1, 2, 1),
				Arrays.asList(2, 1, 1));
		List<List<Integer>> actual = solution.permuteUnique(nums);
		assertEquals(expected, actual);
	}

	@Test
	public void test2() {
		int[] nums = { 1, 2, 3 };
		List<List<Integer>> expected = Arrays.asList(Arrays.asList(1, 2, 3), Arrays.asList(1, 3, 2),
				Arrays.asList(2, 1, 3), Arrays.asList(2, 3, 1), Arrays.asList(3, 1, 2), Arrays.asList(3, 2, 1));
		List<List<Integer>> actual = solution.permuteUnique(nums);
		assertEquals(expected, actual);
	}
}
