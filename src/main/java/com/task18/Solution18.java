package com.task18;
     
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;            
       
// 18. 4Sum
// Medium    

// Given an array nums of n integers, return an array of all the unique 
// quadruplets [nums[a], nums[b], nums[c], nums[d]] such that:

// 0 <= a, b, c, d < n
// a, b, c, and d are distinct.
// nums[a] + nums[b] + nums[c] + nums[d] == target
// You may return the answer in any order.

// Example 1:

// Input: nums = [1,0,-1,0,-2,2], target = 0
// Output: [[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]
// Example 2:

// Input: nums = [2,2,2,2,2], target = 8
// Output: [[2,2,2,2]]

// Constraints:

// 1 <= nums.length <= 200
// -109 <= nums[i] <= 109
// -109 <= target <= 109

public class Solution18 {

	public List<List<Integer>> fourSum(int[] nums, int target) {
		List<List<Integer>> result = new ArrayList<>(); // result
		if (nums == null || nums.length == 0) { // edge case
			return result; // return empty list
		}
		Arrays.sort(nums); // sort nums
		// nums.length - 3 because we need at least 4 numbers to form a sum
		for (int i = 0; i < nums.length - 3; i++) {
			// if nums[i] is the same as nums[i - 1], skip
			if (i > 0 && nums[i - 1] == nums[i]) {
				continue;
			}
			// j == i + 1 because we need at least 3 numbers to form a sum
			// if nums[i] + nums[i + 1] + nums[i + 2] + nums[i + 3] > target,
			// nums.length - 2 because we need at least 3 numbers to form a sum
			for (int j = i + 1; j < nums.length - 2; j++) {
				if (j > i + 1 && nums[j - 1] == nums[j]) { // if nums[j] is the same as nums[j - 1], skip
					continue;
				}
				int left = j + 1; // left pointer
				int right = nums.length - 1; // right pointer
				while (left < right) {
					int sum = nums[i] + nums[j] + nums[left] + nums[right]; // sum of 4 numbers
					if (sum == target) { // if sum == target, add to result
						result.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
						// while left + 1 < right and nums[left] == nums[left + 1], move left pointer
						while (left + 1 < right && nums[left] == nums[left + 1]) {
							left++;
						}
						// while right - 1 > left and nums[right] == nums[right - 1], move right pointer
						while (right - 1 > left && nums[right] == nums[right - 1]) {
							right--;
						}
						left++;
						right--; // move left and right pointers
					} else if (sum > target) { // if sum > target, move right pointer
						right--; // move right pointer
					} else {
						left++; // move left pointer
					}
				}
			}

		}
		 return result;
	}
}
