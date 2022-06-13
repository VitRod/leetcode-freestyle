package com.task15;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class Solution15Test {

	@Test
	public void testThreeSum() {
		Solution15 solution = new Solution15();
		int[] nums = { -1, 0, 1, 2, -1, -4 };
		List<List<Integer>> result = solution.threeSum(nums);
		assertEquals(2, result.size());
		assertEquals(Arrays.asList(-1, -1, 2), result.get(0));
		assertEquals(Arrays.asList(-1, 0, 1), result.get(1));
	}
}