package com.task43;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Solution43Test {
    
	Solution43 solution = new Solution43();
       
	@Test
	public void test1() {
		assertEquals("6", solution.multiply("2", "3"));
	}

	@Test
	public void test2() {
		assertEquals("56088", solution.multiply("123", "456"));
	}
}
