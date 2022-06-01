package com.task32;

//32. Longest Valid Parentheses
//Hard            
            
//Given a string containing just the characters '(' and ')', 
//find the length of the longest valid (well-formed) parentheses substring.

         
        
//Example 1:
     
//Input: s = "(()"
//Output: 2
//Explanation: The longest valid parentheses substring is "()".
//Example 2:

//Input: s = ")()())"
//Output: 4
//Explanation: The longest valid parentheses substring is "()()".
//Example 3:

//Input: s = ""
//Output: 0


//Constraints:

//0 <= s.length <= 3 * 104
//s[i] is '(', or ')'.

public class Solution32 {
	public int longestValidParentheses(String s) {
        int max = 0; // max length of valid parentheses
        // dp[i] is the length of longest valid parentheses ending at i
        int[] dp = new int[s.length()]; 
        // i is the index of the last char of the current valid parentheses
        for (int i = 1; i < s.length(); i++) { 
            if (s.charAt(i) == ')') { // if the last char is ')'
            // if the char before the last char is '('
                if (s.charAt(i - 1) == '(') { 
         // dp[i] is the length of longest valid parentheses ending at i
                    dp[i] = (i >= 2 ? dp[i - 2] : 0) + 2; 
     // if the char before the last char is ')' and the char before the last char is '('
                } else if (i - dp[i - 1] > 0 && s.charAt(i - dp[i - 1] - 1) == '(') { 
    // dp[i] is the length of longest valid parentheses ending at i
                    dp[i] = dp[i - 1] + ((i - dp[i - 1]) >= 2 ? dp[i - dp[i - 1] - 2] : 0) + 2; 
                }
                max = Math.max(max, dp[i]); // update max
            }
        }
        return max;
    }
}

