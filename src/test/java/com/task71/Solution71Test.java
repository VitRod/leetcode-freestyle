package com.task71;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Solution71Test {
              
	Solution71 s = new Solution71();
                                   
	@Test
	public void test1() {
		assertEquals("/home", s.simplifyPath("/home/"));
	}

	@Test
	public void test2() {
		assertEquals("/", s.simplifyPath("/../"));
	}

	@Test
	public void test3() {
		assertEquals("/home/foo", s.simplifyPath("/home//foo/"));
	}
}
