package com.task39;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class Solution39Test {

	 Solution39 solution = new Solution39();
	   
	    @Test
	    public void test1() {
	        int[] candidates = {2,3,6,7};
	        int target = 7;
	        List<List<Integer>> result = solution.combinationSum(candidates, target);
	        assertEquals(2, result.size());
	        assertEquals(Arrays.asList(2,2,3), result.get(0));
	        assertEquals(Arrays.asList(7), result.get(1));
	    }
	    
	    @Test
	    public void test2() {
	        int[] candidates = {2,3,5};
	        int target = 8;
	        List<List<Integer>> result = solution.combinationSum(candidates, target);
	        assertEquals(3, result.size());
	        assertEquals(Arrays.asList(2,2,2,2), result.get(0));
	        assertEquals(Arrays.asList(2,3,3), result.get(1));
	        assertEquals(Arrays.asList(3,5), result.get(2));
	    }
	}
