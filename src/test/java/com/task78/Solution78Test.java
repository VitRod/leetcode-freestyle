package com.task78;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;    
    
import org.junit.jupiter.api.Test;

public class Solution78Test {

	Solution78 s = new Solution78();
    
	@Test
	public void test1() {
		int[] nums = { 1, 2, 3 };
		List<List<Integer>> result = s.subsets(nums);
		assertEquals(8, result.size());
	}

	@Test
	public void test2() {
		int[] nums = { 0 };
		List<List<Integer>> result = s.subsets(nums);
		assertEquals(2, result.size());
	}

}
