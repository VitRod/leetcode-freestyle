package com.task16;

import static org.junit.jupiter.api.Assertions.assertEquals;
   
import org.junit.jupiter.api.Test;
                  
class Solution16Test {    
       
	Solution16 solution = new Solution16();

	@Test    
	public void testThreeSumClosest() {
		int[] nums = { -1, 2, 1, -4 };
		int target = 1;
		int expected = 2;
		int actual = solution.threeSumClosest(nums, target);
		assertEquals(expected, actual);
	}

	@Test
	public void testThreeSumClosest2() {
		int[] nums = { 0, 0, 0 };
		int target = 1;
		int expected = 0;
		int actual = solution.threeSumClosest(nums, target);
		assertEquals(expected, actual);
	}
}
   
