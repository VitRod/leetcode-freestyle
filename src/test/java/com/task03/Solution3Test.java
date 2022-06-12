package com.task03;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.task03.Solution3;

public class Solution3Test {        
	
     Solution3 s = new Solution3();
     
    @Test
    public void test1() {      
        assertEquals(3, s.lengthOfLongestSubstring("abcabcbb"));
    }

    @Test
    public void test2() {  
        assertEquals(1, s.lengthOfLongestSubstring("bbbbb"));
    }

    @Test
    public void test3() {
        assertEquals(3, s.lengthOfLongestSubstring("pwwkew"));
    }
}

