package com.task43;

//43. Multiply Strings
//Medium

//Given two non-negative integers num1 and num2 represented as strings, 
//return the product of num1 and num2, also represented as a string.

//Note: You must not use any built-in BigInteger library or convert the inputs to integer directly.

//Example 1:

//Input: num1 = "2", num2 = "3"
//Output: "6"
//Example 2:

//Input: num1 = "123", num2 = "456"
//Output: "56088"

//Constraints:

//1 <= num1.length, num2.length <= 200
//num1 and num2 consist of digits only.
//Both num1 and num2 do not contain any leading zero, except the number 0 itself.

public class Solution43 {

	public String multiply(String num1, String num2) {
		if (num1.equals("0") || num2.equals("0"))
			return "0";
		int[] res = new int[num1.length() + num2.length()];
		for (int i = num1.length() - 1; i >= 0; i--) {
			for (int j = num2.length() - 1; j >= 0; j--) {
				int mul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
				int p1 = i + j, p2 = i + j + 1;
				int sum = mul + res[p2];
				res[p1] += sum / 10;
				res[p2] = (sum) % 10;
			}
		}
		StringBuilder sb = new StringBuilder();
		for (int p : res)
			if (!(sb.length() == 0 && p == 0))
				sb.append(p);
		return sb.toString();
	}
}
