package com.task40;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 40. Combination Sum II
// Medium

// Given a collection of candidate numbers (candidates) and a target number (target),
//  find all unique combinations in candidates where the candidate numbers sum to target.

// Each number in candidates may only be used once in the combination.

// Note: The solution set must not contain duplicate combinations.

// Example 1:

// Input: candidates = [10,1,2,7,6,1,5], target = 8
// Output: 
// [
// [1,1,6],
// [1,2,5],
// [1,7],
// [2,6]
// ]
// Example 2:

// Input: candidates = [2,5,2,1,2], target = 5
// Output: 
// [
// [1,2,2],
// [5]
// ]

// Constraints:

// 1 <= candidates.length <= 100
// 1 <= candidates[i] <= 50
// 1 <= target <= 30

public class Solution40 {
	
	public List<List<Integer>> combinationSum2(int[] candidates, int target) {
		List<List<Integer>> result = new ArrayList<>();
		Arrays.sort(candidates);
		combinationSum2(candidates, target, 0, new ArrayList<>(), result);
		return result;
	}

	private void combinationSum2(int[] candidates, int target, int start, List<Integer> list,
			List<List<Integer>> result) {
		if (target == 0) {
			result.add(new ArrayList<>(list));
			return;
		}
		for (int i = start; i < candidates.length; i++) {
			if (i > start && candidates[i] == candidates[i - 1]) {
				continue;
			}
			if (candidates[i] > target) {
				break;
			}
			list.add(candidates[i]);
			combinationSum2(candidates, target - candidates[i], i + 1, list, result);
			list.remove(list.size() - 1);
		}
	}
}
