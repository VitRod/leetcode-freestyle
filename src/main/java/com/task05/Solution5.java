package com.task05;
           
//5. Longest Palindromic Substring
//Medium
    
//Given a string s, return the longest palindromic substring in s.
        
//Example 1:
                   
//Input: s = "babad"
//Output: "bab"
//Explanation: "aba" is also a valid answer.
//Example 2:
         
//Input: s = "cbbd"
//Output: "bb"
        

//Constraints:

//1 <= s.length <= 1000
//s consist of only digits and English letters.

class Solution5 {
 int st; 
 int end;
 public String longestPalindrome(String s) {
     int len = s.length(); // length of string
     if(len <= 1)  // if length is 1 or 0, return the string s;
     	return s;
     char[] chars = s.toCharArray(); // convert string to char array
     for(int i = 0; i < len; i++) { // loop through the string
     	helper(chars, i, i); // call helper function
     	helper(chars, i, i+1); 
     }
     return s.substring(st, end + 1); // return substring of s
 }
    
 
 public void helper(char[] chars, int l, int r) {
     // while l and r are in bounds and chars[l] and chars[r] are equal
 	while(l >= 0 && r < chars.length && chars[l] == chars[r]) { 
 		--l;
 		++r;
 	}
     // if the substring is longer than the current substring, update the substring
 	if(end - st < r - l - 2) { 
 		st = l + 1; // update start
 		end = r - 1; // update end
 	}
 }
}
