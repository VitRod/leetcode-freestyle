package com.task70;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Solution70Test {       
                   
	Solution70 s = new Solution70();
             
	@Test
	public void test1() {
		assertEquals(2, s.climbStairs(2));
	}

	@Test
	public void test2() {
		assertEquals(3, s.climbStairs(3));
	}

}
