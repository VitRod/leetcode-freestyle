package com.task06;
    
//6. Zigzag Conversion
//Medium
        
//The string "PAYPALISHIRING" is written in a zigzag pattern on a given 
//number of rows like this: (you may want to display this pattern 
//in a fixed font for better legibility)
   
//P   A   H   N
//A P L S I I G
//Y   I   R
//And then read line by line: "PAHNAPLSIIGYIR"
        
//Write the code that will take a string and make this conversion given a number of rows:
    
//string convert(string s, int numRows);

//Example 1:

//Input: s = "PAYPALISHIRING", numRows = 3
//Output: "PAHNAPLSIIGYIR"
//Example 2:

//Input: s = "PAYPALISHIRING", numRows = 4
//Output: "PINALSIGYAHRPI"
//Explanation:
//P     I    N
//A   L S  I G
//Y A   H R
//P     I
//Example 3:
    
//Input: s = "A", numRows = 1
//Output: "A"

//Constraints:

//1 <= s.length <= 1000
//s consists of English letters (lower-case and upper-case), ',' and '.'.
//1 <= numRows <= 1000

public class Solution6 {

	public String convert(String s, int numRows) {
		if (numRows <= 1) // if numRows is 1, return the original string s
			return s;
		int len = s.length(); // length of the string
		char[] chars = s.toCharArray(); // convert the string to char array
		int cycle = 2 * (numRows - 1); // cycle length of each row
		StringBuilder sb = new StringBuilder();
		for (int j = 0; j < len; j += cycle) { // for each row
			sb.append(chars[j]); // add the first char of the row
		}
		for (int i = 1; i < numRows - 1; i++) { // for each row except the first and last row
			int step = 2 * i; // step length of each row
			for (int j = i; j < len; j += step) { // for each char in the row
				sb.append(chars[j]); // add the char to the string
				step = cycle - step; // change the step length
			}
		}
		for (int j = numRows - 1; j < len; j += cycle) { // for each row except the first and last row
			sb.append(chars[j]); // add the last char of the row
		}
		return sb.toString();
	}
}
