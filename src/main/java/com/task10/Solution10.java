package com.task10;
    
//10. Regular Expression Matching   
//Hard       
             
//Given an input string s and a pattern p, implement regular expression matching with support for '.' and '*' where:
      
//'.' Matches any single character.​​​​
//'*' Matches zero or more of the preceding element.
//The matching should cover the entire input string (not partial).
   
//Example 1:
         
//Input: s = "aa", p = "a"
//Output: false
//Explanation: "a" does not match the entire string "aa".
//Example 2:
    
//Input: s = "aa", p = "a*"
//Output: true
//Explanation: '*' means zero or more of the preceding element, 'a'. Therefore, by repeating 'a' once, it becomes "aa".
//Example 3:

//Input: s = "ab", p = ".*"
//Output: true
//Explanation: ".*" means "zero or more (*) of any character (.)".

//Constraints:

//1 <= s.length <= 20
//1 <= p.length <= 30
//s contains only lowercase English letters.
//p contains only lowercase English letters, '.', and '*'.
//It is guaranteed for each appearance of the character '*', there will be a previous valid character to match.

public class Solution10 {

	public boolean isMatch(String s, String p) {
		int sLen = s.length();
		int pLen = p.length();
		boolean[][] dp = new boolean[sLen + 1][pLen + 1];
		dp[0][0] = true;
		for (int i = 0; i < pLen; i++) {
			// if the previous char is '*' and the previous string is empty, then true
			if (p.charAt(i) == '*' && dp[0][i - 1]) {
				dp[0][i + 1] = true;
			}
		}
		for (int i = 1; i <= sLen; i++) { // for each char in s
			for (int j = 1; j <= pLen; j++) { // for each char in p
				// if the char in s and p are the same, then true
				if (p.charAt(j - 1) == '.' || s.charAt(i - 1) == p.charAt(j - 1)) {
					dp[i][j] = dp[i - 1][j - 1];
				}
				if (p.charAt(j - 1) == '*') { // if the char in p is '*'
					// if the char in p is '*' and the char in s is not the same as the previous
					// char in p
					if (p.charAt(j - 2) != s.charAt(i - 1) && p.charAt(j - 2) != '.') {
						dp[i][j] = dp[i][j - 2];
					} else {
						dp[i][j] = dp[i][j - 2] || dp[i - 1][j]; //
					}
				}
			}
		}
		return dp[sLen][pLen];
	}
}
