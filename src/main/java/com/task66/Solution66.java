package com.task66;

//66. Plus One
//Easy

//You are given a large integer represented as an integer array digits, 
//where each digits[i] is the ith digit of the integer. 
//The digits are ordered from most significant to least significant in left-to-right order. 
//The large integer does not contain any leading 0's.

//Increment the large integer by one and return the resulting array of digits.

//Example 1:

//Input: digits = [1,2,3]
//Output: [1,2,4]
//Explanation: The array represents the integer 123.
//Incrementing by one gives 123 + 1 = 124.
//Thus, the result should be [1,2,4].
//Example 2:

//Input: digits = [4,3,2,1]
//Output: [4,3,2,2]
//Explanation: The array represents the integer 4321.
//Incrementing by one gives 4321 + 1 = 4322.
//Thus, the result should be [4,3,2,2].
//Example 3:

//Input: digits = [9]
//Output: [1,0]
//Explanation: The array represents the integer 9.
//Incrementing by one gives 9 + 1 = 10.
//Thus, the result should be [1,0].

//Constraints:

//1 <= digits.length <= 100
//0 <= digits[i] <= 9
//digits does not contain any leading 0's.

public class Solution66 {

	public int[] plusOne(int[] digits) {
		int p = digits.length - 1; // p is the index of the last digit
		if (digits[p] < 9) { // if the last digit is less than 9, we can just increment it
			digits[p] = ++digits[p]; // increment the last digit
		} else {
			do {
				digits[p--] = 0; // if the last digit is 9, we need to set it to 0 and move to the previous digit

			} while (p >= 0 && digits[p] == 9); // if the previous digit is 9, we need to set it to 0 and move to the
												// previous digit
			if (digits[0] != 0) { // if the first digit is not 0, we can just increment it
				++digits[p]; // increment the last digit
			} else {
				digits = new int[digits.length + 1]; // if the first digit is 0, we need to add a new digit to the front
				digits[0] = 1; // set the first digit to 1
			}

		}
		return digits; // return the new array
	}
}