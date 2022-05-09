package com.task28;
    
//28. Implement strStr()       
//Easy

//Implement strStr().
     
//Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
    
//Clarification:              

//What should we return when needle is an empty string? This is a great question to ask during an interview.

//For the purpose of this problem, we will return 0 when needle is an empty string. 
//This is consistent to C's strstr() and Java's indexOf().    

//Example 1:

//Input: haystack = "hello", needle = "ll"
//Output: 2
//Example 2:

//Input: haystack = "aaaaa", needle = "bba"
//Output: -1
//Example 3:

//Input: haystack = "", needle = ""
//Output: 0

//Constraints:

//0 <= haystack.length, needle.length <= 5 * 104
//haystack and needle consist of only lower-case English characters.

public class Solution28 {

	public int strStr(String haystack, String needle) {
		// l1 = length of haystack, l2 = length of needle
		int l1 = haystack.length(), l2 = needle.length();
		if (l1 < l2)
			return -1; // if haystack is shorter than needle, return -1

		for (int i = 0;; i++) { // loop through haystack
			if (i + l2 > l1)
				return -1; // if i+l2 is greater than l1, return -1

			for (int j = 0;; j++) { // loop through needle
				if (j == l2)
					return i; // if j is equal to l2, return i
				// if haystack[i+j] is not equal to needle[j], break
				if (haystack.charAt(i + j) != needle.charAt(j))
					break;

			}
		}

	}
}
