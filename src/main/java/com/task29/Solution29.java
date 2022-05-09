package com.task29;

//29. Divide Two Integers
//Medium       

//Given two integers dividend and divisor, divide two integers without using multiplication,
//division, and mod operator.    
   
//The integer division should truncate toward zero, which means losing its fractional part.
//For example, 8.345 would be truncated to 8, and -2.7335 would be truncated to -2.

//Return the quotient after dividing dividend by divisor.
     
//Note: Assume we are dealing with an environment that could only store integers 
//within the 32-bit signed integer range: [−231, 231 − 1]. For this problem, 
//if the quotient is strictly greater than 231 - 1, then return 231 - 1, 
//and if the quotient is strictly less than -231, then return -231.
     
//Example 1:

//Input: dividend = 10, divisor = 3
//Output: 3
//Explanation: 10/3 = 3.33333.. which is truncated to 3.
//Example 2:

//Input: dividend = 7, divisor = -3
//Output: -2
//Explanation: 7/-3 = -2.33333.. which is truncated to -2.

//Constraints:

//-231 <= dividend, divisor <= 231 - 1
//divisor != 0

public class Solution29 {

	public int divide(int dividend, int divisor) {
		if (dividend == 0)
			return 0; // corner case
		if (divisor == 1)
			return dividend; // corner case
		if (divisor == -1)
			return dividend == Integer.MIN_VALUE ? Integer.MAX_VALUE : -dividend; // corner case
		if (dividend == Integer.MIN_VALUE && divisor == -1)
			return Integer.MAX_VALUE; // corner case
		if (dividend == Integer.MIN_VALUE && divisor == 1)
			return Integer.MIN_VALUE; // corner case
		int sign = (dividend > 0 && divisor > 0) || (dividend < 0 && divisor < 0) ? 1 : -1; // sign of result
		long dividendL = Math.abs((long) dividend); // absolute value of dividend
		long divisorL = Math.abs((long) divisor); // absolute value of divisor
		int res = 0; // result
		while (dividendL >= divisorL) { // loop to find the result
			long temp = divisorL; // temp divisor
			int count = 1; // count of temp divisor
			while (dividendL >= (temp << 1)) { // loop to find the temp divisor
				temp <<= 1; // double temp divisor
				count <<= 1; // double count of temp divisor
			}
			dividendL -= temp; // subtract temp divisor from dividend
			res += count; // add count of temp divisor to result
		}
		return sign * res; // return result
	}
}
