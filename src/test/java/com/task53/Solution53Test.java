package com.task53;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
    
public class Solution53Test {    

	Solution53 s = new Solution53();
                               
	@Test
	public void test1() {
		int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		assertEquals(6, s.maxSubArray(nums));
	}

	@Test
	public void test2() {
		int[] nums = { 1 };
		assertEquals(1, s.maxSubArray(nums));
	}

	@Test
	public void test3() {
		int[] nums = { 5, 4, -1, 7, 8 };
		assertEquals(23, s.maxSubArray(nums));
	}
}
