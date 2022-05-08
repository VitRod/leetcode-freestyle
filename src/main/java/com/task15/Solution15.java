package com.task15;
                      
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
                  
// 15. 3Sum
// Medium
                    
// Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such 
// that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

// Notice that the solution set must not contain duplicate triplets.
    
// Example 1:

// Input: nums = [-1,0,1,2,-1,-4]
// Output: [[-1,-1,2],[-1,0,1]]
// Example 2:

// Input: nums = []
// Output: []
// Example 3:

// Input: nums = [0]
// Output: []

// Constraints:

// 0 <= nums.length <= 3000
// -105 <= nums[i] <= 105

public class Solution15 {

	public List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> result = new ArrayList<>();
		if (nums.length < 3) { // edge case
			return result; // return empty list
		}
		Arrays.sort(nums); // sort the array
		for (int i = 0; i < nums.length - 2; i++) { // loop through the array
			if (i > 0 && nums[i] == nums[i - 1]) { // skip duplicates
				continue; // skip duplicates
			}
			int left = i + 1; // left pointer
			int right = nums.length - 1; // right pointer
			while (left < right) { // loop through the array
				int sum = nums[i] + nums[left] + nums[right]; // sum of three numbers
				if (sum == 0) { // if sum is 0
					result.add(Arrays.asList(nums[i], nums[left], nums[right])); // add to result
					left++; // increment left pointer
					right--; // decrement right pointer
					while (left < right && nums[left] == nums[left - 1]) { // skip duplicates
						left++; // increment left pointer
					}
					while (left < right && nums[right] == nums[right + 1]) { // skip duplicates
						right--; // decrement right pointer
					}
				} else if (sum < 0) { // if sum is less than 0
					left++; // increment left pointer
				} else { // if sum is greater than 0
					right--; // decrement right pointer
				}
			}
		}
		return result; // return result
	}
}
