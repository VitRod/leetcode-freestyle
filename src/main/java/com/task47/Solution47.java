package com.task47;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 47. Permutations II
// Medium

// Given a collection of numbers, nums, that might contain duplicates, 
// return all possible unique permutations in any order.

// Example 1:

// Input: nums = [1,1,2]
// Output:
// [[1,1,2],
//  [1,2,1],
//  [2,1,1]]
// Example 2:

// Input: nums = [1,2,3]
// Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]

// Constraints:

// 1 <= nums.length <= 8
// -10 <= nums[i] <= 10

public class Solution47 {

	public List<List<Integer>> permuteUnique(int[] nums) {
		List<List<Integer>> result = new ArrayList<>(); // result
		if (nums == null || nums.length == 0) { // if nums is empty, return empty result
			return result;
		}
		Arrays.sort(nums); // sort nums
		boolean[] visited = new boolean[nums.length]; // visited
		List<Integer> list = new ArrayList<>(); // list
		helper(nums, visited, list, result); // helper
		return result; // return result
	}

	private void helper(int[] nums, boolean[] visited, List<Integer> list, List<List<Integer>> result) {
		if (list.size() == nums.length) { // if list is full, add list to result
			result.add(new ArrayList<>(list)); // add list to result
			return; // return
		}
		for (int i = 0; i < nums.length; i++) { // for each nums[i]
			// if visited[i] or nums[i] == nums[i - 1] and not visited[i - 1]
			if (visited[i] || (i > 0 && nums[i] == nums[i - 1] && !visited[i - 1])) {
				continue; // continue
			}
			visited[i] = true; // set visited[i] to true
			list.add(nums[i]); // add nums[i] to list
			helper(nums, visited, list, result); // helper
			list.remove(list.size() - 1); // remove nums[i] from list
			visited[i] = false; // set visited[i] to false
		}
	}
}
