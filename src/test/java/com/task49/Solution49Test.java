package com.task49;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;
             
import org.junit.jupiter.api.Test;
        
class Solution49Test {
     
	Solution49 solution = new Solution49();

	@Test
	public void test1() {
		String[] strs = new String[] { "" };
		List<List<String>> expected = Arrays.asList(Arrays.asList(""));
		List<List<String>> actual = solution.groupAnagrams(strs);
		assertEquals(expected, actual);
	}
}
