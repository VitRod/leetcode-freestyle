package com.task77;

import java.util.ArrayList;
import java.util.List;

// 77. Combinations
// Medium

// Given two integers n and k, return all possible combinations of k numbers out of the range [1, n].

// You may return the answer in any order.

// Example 1:

// Input: n = 4, k = 2
// Output:
// [
//   [2,4],
//   [3,4],
//   [2,3],
//   [1,2],
//   [1,3],
//   [1,4],
// ]
// Example 2:

// Input: n = 1, k = 1
// Output: [[1]]

// Constraints:

// 1 <= n <= 20
// 1 <= k <= n

public class Solution77 {
	public List<List<Integer>> combine(int n, int k) {
		List result = new ArrayList<>(); // result
		int[] nums = new int[n]; // nums
		for (int i = 0; i < n; i++) { // initialize nums
			nums[i] = i + 1; // 1, 2, 3, 4
		}
		backtracking(k, 0, nums, new ArrayList<>(), result); // backtracking
		return result; // return result
	}

	void backtracking(int k, int start, int[] nums, List curr, List result) {
		if (curr.size() == k) {
			result.add(new ArrayList<>(curr)); // add curr to result
		} else if (curr.size() < k) {
			for (int i = start; i < nums.length; i++) { // start from start
				curr.add(nums[i]); // add nums[i] to curr
				backtracking(k, i + 1, nums, curr, result); // backtracking
				curr.remove(curr.size() - 1); // remove nums[i] from curr
			}
		}
	}
}
