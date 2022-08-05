package com.task67;

//67. Add Binary
//Easy    
            
//Given two binary strings a and b, return their sum as a binary string.
         
//Example 1:        
    
//Input: a = "11", b = "1"
//Output: "100"
//Example 2:

//Input: a = "1010", b = "1011"
//Output: "10101"

//Constraints:

//1 <= a.length, b.length <= 104
//a and b consist only of '0' or '1' characters.
//Each string does not contain leading zeros except for the zero itself.

public class Solution67 {
	
	public String addBinary(String a, String b) {
		StringBuilder sb = new StringBuilder(); // `StringBuilder` is faster than `String`
		int carry = 0, p1 = a.length() - 1, p2 = b.length() - 1; // p1, p2 are the pointers of a, b
		while (p1 >= 0 && p2 >= 0) { // while there are still digits to compare

			carry += a.charAt(p1--) - '0'; // add the last digit of a to carry
			carry += b.charAt(p2--) - '0'; // add the last digit of b to carry`
			sb.insert(0, (char) (carry % 2 + '0')); // append the last digit of the sum to the front of the string
			carry >>= 1; // divide the sum by 2
		}
		while (p1 >= 0) { // if there are still digits to compare in a
			carry += a.charAt(p1--) - '0'; // add the last digit of a to carry

			sb.insert(0, (char) (carry % 2 + '0')); // append the last digit of the sum to the front of the string
			carry >>= 1; // divide the sum by 2
		}
		while (p2 >= 0) {
			carry += b.charAt(p2--) - '0'; // add the last digit of b to carry
			sb.insert(0, (char) (carry % 2 + '0')); // append the last digit of the sum to the front of the string
			carry >>= 1; // divide the sum by 2
		}
		if (carry == 1) { // if there is a carry left over
			sb.insert(0, '1'); // append a 1 to the front of the string
		}
		return sb.toString(); // return the string
	}
}    
