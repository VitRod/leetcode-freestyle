package com.task14;
      
//14. Longest Common Prefix
//Easy
                    
//Write a function to find the longest common prefix string amongst an array of strings.
     
//If there is no common prefix, return an empty string "".
    
//Example 1:
     
//Input: strs = ["flower","flow","flight"]
//Output: "fl"
//Example 2:
          
//Input: strs = ["dog","racecar","car"]
//Output: ""
//Explanation: There is no common prefix among the input strings.
     
//Constraints:

//1 <= strs.length <= 200
//0 <= strs[i].length <= 200
//strs[i] consists of only lower-case English letters.

public class Solution14 {

	public String longestCommonPrefix(String[] strs) {
		if (strs.length == 0) // edge case
			return ""; // if no string, return empty string
		String result = strs[0]; // initialize result with first string
		for (int i = 0; i < strs.length; i++) { // loop through all strings
			String s = strs[i]; // get current string
			for (int j = 0; j < result.length(); j++) { // loop through result string
        // if j is out of range or result char is not equal to current string char
				if (j >= s.length() || result.charAt(j) != s.charAt(j)) {
					result = result.substring(0, j); // cut off result string`
					break; // break out of loop
				}
			}
		}
		return result;
	}
}
