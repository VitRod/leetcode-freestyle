package com.task14;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
    
class Solution14Test {

	Solution14 s = new Solution14();
	
	@Test 
    public void test1() {      
          String[] strs = {"flower","flow","flight"};
          assertEquals("fl", s.longestCommonPrefix(strs));
    }

    @Test
    public void test2() {
          String[] strs = {"dog","racecar","car"};
          assertEquals("", s.longestCommonPrefix(strs));
    }
}
