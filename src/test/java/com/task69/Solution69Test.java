package com.task69;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Solution69Test {
             
	Solution69 s = new Solution69();
            
	@Test    
	public void test1() {
		assertEquals(2, s.mySqrt(4));
	}    

	@Test
	public void test2() {
		assertEquals(2, s.mySqrt(8));
	}
}
