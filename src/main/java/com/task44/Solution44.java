package com.task44;

//44. Wildcard Matching
//Hard

//Given an input string (s) and a pattern (p), implement wildcard pattern matching 
//with support for '?' and '*' where:

//'?' Matches any single character.
//'*' Matches any sequence of characters (including the empty sequence).
//The matching should cover the entire input string (not partial).

//Example 1:
//Input: s = "aa", p = "a"
//Output: false
//Explanation: "a" does not match the entire string "aa".
//Example 2:

//Input: s = "aa", p = "*"
//Output: true
//Explanation: '*' matches any sequence.
//Example 3:

//Input: s = "cb", p = "?a"
//Output: false
//Explanation: '?' matches 'c', but the second letter is 'a', which does not match 'b'.

//Constraints:

//0 <= s.length, p.length <= 2000
//s contains only lowercase English letters.
//p contains only lowercase English letters, '?' or '*'.

public class Solution44 {

	 public boolean isMatch(String s, String p) {
	        int m = s.length(); // string length
	        int n = p.length(); // pattern length
	        boolean[][] dp = new boolean[m + 1][n + 1]; // dp[i][j] = true if s[0..i-1] matches p[0..j-1]
	        dp[0][0] = true; // empty string matches empty pattern
	        for (int i = 1; i <= n; i++) { // initialize first row
	            if (p.charAt(i - 1) == '*') { // if pattern is '*'
	                dp[0][i] = dp[0][i - 1]; // then dp[0][i] = dp[0][i-1]
	            }
	        }
	        for (int i = 1; i <= m; i++) { // iterate over string
	            for (int j = 1; j <= n; j++) { // iterate over pattern
	                if (p.charAt(j - 1) == '*') { // if pattern is '*'
	                    dp[i][j] = dp[i - 1][j] || dp[i][j - 1]; // then dp[i][j] = dp[i-1][j] || dp[i][j-1]
	                } else if (p.charAt(j - 1) == '?' || s.charAt(i - 1) == p.charAt(j - 1)) { // if pattern is '?' or s[i-1] == p[j-1]
	                    dp[i][j] = dp[i - 1][j - 1]; // then dp[i][j] = dp[i-1][j-1]
	                }
	            }
	        }
	        return dp[m][n]; // return dp[m][n]
	    }
	}