package com.task18;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

class Solution18Test {
     
	Solution18 s = new Solution18();
   
	@Test
	public void testFourSum() {
		int[] nums = { 1, 0, -1, 0, -2, 2 };
		int target = 0;
		List<List<Integer>> result = s.fourSum(nums, target);

		assertEquals(result.size(), 3);
		assertEquals(result.get(0).get(0), -2);
		assertEquals(result.get(0).get(1), -1);
		assertEquals(result.get(0).get(2), 1);
		assertEquals(result.get(0).get(3), 2);
		assertEquals(result.get(1).get(0), -2);
		assertEquals(result.get(1).get(1), 0);
		assertEquals(result.get(1).get(2), 0);
		assertEquals(result.get(1).get(3), 2);
		assertEquals(result.get(2).get(0), -1);
		assertEquals(result.get(2).get(1), 0);
		assertEquals(result.get(2).get(2), 0);
		assertEquals(result.get(2).get(3), 1);
	}

	@Test
	public void testFourSum2() {
		int[] nums = { 2, 2, 2, 2, 2 };
		int target = 8;
		List<List<Integer>> result = s.fourSum(nums, target);

		assertEquals(result.size(), 1);
		assertEquals(result.get(0).get(0), 2);
		assertEquals(result.get(0).get(1), 2);
		assertEquals(result.get(0).get(2), 2);
		assertEquals(result.get(0).get(3), 2);
	}
}
