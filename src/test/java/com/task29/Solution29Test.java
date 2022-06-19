package com.task29;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
    
class Solution29Test {   

	Solution29 solution = new Solution29();

	@Test
	public void test1() {
		assertEquals(3, solution.divide(10, 3));
	}

	@Test
	public void test2() {
		assertEquals(-2, solution.divide(7, -3));
	}

}
