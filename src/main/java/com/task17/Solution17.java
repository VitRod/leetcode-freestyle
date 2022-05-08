package com.task17;

import java.util.ArrayList;
import java.util.List;

// 17. Letter Combinations of a Phone Number
// Medium
      
// Given a string containing digits from 2-9 inclusive, 
// return all possible letter combinations that the number could represent. Return the answer in any order.

// A mapping of digit to letters (just like on the telephone buttons) is given below. 
// Note that 1 does not map to any letters.

// Example 1:
     
// Input: digits = "23"
// Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]
// Example 2:

// Input: digits = ""
// Output: []
// Example 3:

// Input: digits = "2"
// Output: ["a","b","c"]

// Constraints:

// 0 <= digits.length <= 4
// digits[i] is a digit in the range ['2', '9'].

public class Solution17 {

	public List letterCombinations(String digits) {
		List result = new ArrayList();
		if (digits.length() == 0) { // edge case
			return result;
		}
		String[] digitToLetters = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
		// this line is important, otherwise result and java will defaul it to an empty
		// String
		result.add("");

		for (int i = 0; i < digits.length(); i++) { // for each digit
			// combine the result with the letters
			result = combine(digitToLetters[digits.charAt(i) - '0'], result);
		}
		return result;
	}

	public List combine(String letters, List result) {
		List newResult = new ArrayList(); // new result
		for (int i = 0; i < result.size(); i++) { // for each result
			String currentString = (String) result.get(i); // get the current result
			for (int j = 0; j < letters.length(); j++) { // for each letter
				newResult.add(currentString + letters.charAt(j)); // add the letter to the result
			}
		}
		return newResult;
	}
}
