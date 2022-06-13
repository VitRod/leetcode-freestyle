package com.task04;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Solution4Test {
      
	Solution4 s = new Solution4();
          
	@Test
	public void test1() {
		assertEquals(2.0, s.findMedianSortedArrays(new int[] { 1, 3 }, new int[] { 2 }));
	}

	@Test
	public void test2() {
		assertEquals(2.5, s.findMedianSortedArrays(new int[] { 1, 2 }, new int[] { 3, 4 }));
	}
}
