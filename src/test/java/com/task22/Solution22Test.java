package com.task22;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;    
                  
import org.junit.jupiter.api.Test;
    
class Solution22Test {
     
	Solution22 solution = new Solution22();

	@Test
	public void test1() {
		List<String> result = solution.generateParenthesis(3);
		assertEquals(Arrays.asList("((()))", "(()())", "(())()", "()(())", "()()()"), result);
	}

	@Test
	public void test2() {
		List<String> result = solution.generateParenthesis(1);
		assertEquals(Arrays.asList("()"), result);
	}
}
