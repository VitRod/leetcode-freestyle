package com.task20;

//20. Valid Parentheses   
//Easy
         
//Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', 
//determine if the input string is valid.   
    
//An input string is valid if:   

//Open brackets must be closed by the same type of brackets.
//Open brackets must be closed in the correct order.

//Example 1:

//Input: s = "()"
//Output: true
//Example 2:

//Input: s = "()[]{}"
//Output: true
//Example 3:

//Input: s = "(]"
//Output: false

//Constraints:

//1 <= s.length <= 104
//s consists of parentheses only '()[]{}'.

public class Solution20 {

	public boolean isValid(String s) {
		// we need to add 1 to the length of the array to avoid out of bounds exception
		char[] stack = new char[s.length() + 1];
		int top = 1; // top is the index of the top of the stack
		for (char c : s.toCharArray()) { // iterate through the string
			if (c == '(' || c == '{' || c == '[') { // if the character is an opening bracket
				stack[top++] = c; // push the character to the stack
				// if the character is a closing bracket and the top of the stack is not an
				// opening bracket
			} else if (c == ')' && stack[--top] != '(') {
				return false;
				// if the character is a closing bracket and the top of the stack is not an
				// opening bracket
			} else if (c == ']' && stack[--top] != '[') {
				return false;
				// if the character is a closing bracket and the top of the stack is not an
				// opening bracket
			} else if (c == '}' && stack[--top] != '{') {
				return false;
			}
		}
		// if the top of the stack is 1, then the stack is empty and the string is valid
		return top == 1;

	}
}
