package com.task46;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class Solution46Test {

	Solution46 solution = new Solution46();
	 
    @Test
    public void test1() {
        int[] nums = {1, 2, 3};
        List<List<Integer>> result = solution.permute(nums);
        List<List<Integer>> expected = Arrays.asList(
            Arrays.asList(1, 2, 3),
            Arrays.asList(1, 3, 2),
            Arrays.asList(2, 1, 3),
            Arrays.asList(2, 3, 1),
            Arrays.asList(3, 1, 2),
            Arrays.asList(3, 2, 1)
        );
        assertEquals(expected, result);
    }

    @Test
    public void test2() {
        int[] nums = {0, 1};
        List<List<Integer>> result = solution.permute(nums);
        List<List<Integer>> expected = Arrays.asList(
            Arrays.asList(0, 1),
            Arrays.asList(1, 0)
        );
        assertEquals(expected, result);
    }
}