package com.task3;

//3. Longest Substring Without Repeating Characters
//Medium

//Given a string s, find the length of the longest substring without repeating characters.



//Example 1:

//Input: s = "abcabcbb"
//Output: 3
//Explanation: The answer is "abc", with the length of 3.
//Example 2:

//Input: s = "bbbbb"
//Output: 1
//Explanation: The answer is "b", with the length of 1.
//Example 3:

//Input: s = "pwwkew"
//Output: 3
//Explanation: The answer is "wke", with the length of 3.
//Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.


//Constraints:

//0 <= s.length <= 5 * 104
//s consists of English letters, digits, symbols and spaces.

class Solution3 {
 public int lengthOfLongestSubstring(String s) {
     int len; // length of the longest substring without repeating characters
     if(s == null || (len = s.length()) == 0) return 0; // edge case
     int preP = 0, max = 0; // preP is the index of the previous character
     int [] hash = new int [128]; // 
     for (int i = 0; i < len; i++) { 
         char c = s.charAt(i); // current character
         if (hash[c] > preP) {   // if the current character is already in the substring
             preP = hash[c]; // update preP
         }
         int l = i - preP + 1; // length of the current substring
         hash[c] = i + 1; // update hash with the current character
         if (l > max)  
             max = l; // update max
     }
     return max; 
 }
}