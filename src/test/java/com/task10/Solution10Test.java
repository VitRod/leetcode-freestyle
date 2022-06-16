package com.task10;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;      
    
class Solution10Test {             
             
	@Test 
    public void testIsMatch() {
          Solution10 s = new Solution10();
          assertFalse(s.isMatch("aa", "a"));
          assertTrue(s.isMatch("aa", "a*"));
          assertTrue(s.isMatch("ab", ".*"));
    }
}

