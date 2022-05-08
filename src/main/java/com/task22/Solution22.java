package com.task22;

import java.util.ArrayList;     
import java.util.List;
       
//22. Generate Parentheses         
//Medium
          
//Given n pairs of parentheses, write a function    
//to generate all combinations of well-formed parentheses.        
    
//Example 1:   
    
//Input: n = 3       
//Output: ["((()))","(()())","(())()","()(())","()()()"]
//Example 2:

//Input: n = 1
//Output: ["()"]

//Constraints:

//1 <= n <= 8   

public class Solution22 {

	public List<String> generateParenthesis(int n) {
		List<String> result = new ArrayList<>(); // result = []
		StringBuilder sb = new StringBuilder(); // sb = ""
		helper(result, sb, n, n);
		return result; // return result
	}

	private void helper(List<String> result, StringBuilder sb, int left, int right) {
		if (left == 0 && right == 0) {
			result.add(sb.toString()); // result.append(sb)
			return;
		}

		if (left > 0) {
			sb.append("(");
			helper(result, sb, left - 1, right);
			sb.deleteCharAt(sb.length() - 1); // sb.pop()
		}

		if (right > 0 && right > left) {
			sb.append(")");
			helper(result, sb, left, right - 1);
			sb.deleteCharAt(sb.length() - 1); // sb.pop()
		}
	}
}
