package com.task40;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;    
    
import org.junit.jupiter.api.Test;
        
class Solution40Test {
    
	Solution40 solution = new Solution40();
    
	@Test
	public void test1() {
		int[] candidates = { 10, 1, 2, 7, 6, 1, 5 };
		int target = 8;
		List<List<Integer>> result = solution.combinationSum2(candidates, target);
		List<List<Integer>> expected = Arrays.asList(Arrays.asList(1, 1, 6), Arrays.asList(1, 2, 5),
				Arrays.asList(1, 7), Arrays.asList(2, 6));
		assertEquals(expected, result);
	}

	@Test
	public void test2() {
		int[] candidates = { 2, 5, 2, 1, 2 };
		int target = 5;
		List<List<Integer>> result = solution.combinationSum2(candidates, target);
		List<List<Integer>> expected = Arrays.asList(Arrays.asList(1, 2, 2), Arrays.asList(5));
		assertEquals(expected, result);
	}
}
