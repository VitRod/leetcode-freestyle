package com.task62;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
    
class Solution62Test {
                  
	Solution62 s = new Solution62();
                      
	@Test    
	public void test1() {
		assertEquals(28, s.uniquePaths(3, 7));
	}

	@Test
	public void test2() {
		assertEquals(3, s.uniquePaths(3, 2));
	}
}
