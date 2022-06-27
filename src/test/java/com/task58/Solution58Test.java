package com.task58;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Solution58Test {   

	Solution58 s = new Solution58();
    
	@Test
	public void test1() {
		assertEquals(5, s.lengthOfLastWord("Hello World"));
	}

	@Test
	public void test2() {
		assertEquals(4, s.lengthOfLastWord("   fly me   to   the moon  "));
	}

	@Test
	public void test3() {
		assertEquals(6, s.lengthOfLastWord("luffy is still joyboy"));
	}
}
