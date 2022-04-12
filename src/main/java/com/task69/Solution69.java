package com.task69;

//69. Sqrt(x)
//Easy
//
//
//Given a non-negative integer x, compute and return the square root of x.
//
//Since the return type is an integer, the decimal digits are truncated, 
//		and only the integer part of the result is returned.
//
//Note: You are not allowed to use any built-in exponent function 
//or operator, such as pow(x, 0.5) or x ** 0.5.
//
//
//
//Example 1:
//
//Input: x = 4
//Output: 2
//Example 2:
//
//Input: x = 8
//Output: 2
//Explanation: The square root of 8 is 2.82842..., and since the decimal part is truncated, 2 is returned.
//
//
//Constraints:
//
//0 <= x <= 231 - 1

public class Solution69 {
	public int mySqrt(int x) {
		long n = x; // n is the number we want to find the square root of
		while (n * n > x) // while n squared is greater than x
			n = (n + x / n) >> 1; // divide n by 2 and add x/n to n
		return (int) n; // return n
	}
}
