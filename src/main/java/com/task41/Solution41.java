package com.task41;

//41. First Missing Positive
//Hard

//Given an unsorted integer array nums, return the smallest missing positive integer.

//You must implement an algorithm that runs in O(n) time and uses constant extra space.

//Example 1:

//Input: nums = [1,2,0]
//Output: 3
//Example 2:

//Input: nums = [3,4,-1,1]
//Output: 2
//Example 3:

//Input: nums = [7,8,9,11,12]
//Output: 1

//Constraints:

//1 <= nums.length <= 5 * 105
//-231 <= nums[i] <= 231 - 1

public class Solution41 {

	public int firstMissingPositive(int[] nums) {

		int n = nums.length; // `n` is the length of the array
		for (int i = 0; i < n; i++) { // `i` is the index of the array
			// `nums[i]` is the value of the array at index `i`
			while (nums[i] > 0 && nums[i] <= n && nums[i] != nums[nums[i] - 1]) {
				int temp = nums[i]; // `temp` is the value of the array at index `i`
				nums[i] = nums[temp - 1]; // `nums[i]` is the value of the array at index `temp-1`
				nums[temp - 1] = temp; // `nums[temp-1]` is the value of the array at index `i`
			}
		}
		for (int i = 0; i < n; i++) { // `i` is the index of the array
			if (nums[i] != i + 1) // `nums[i]` is the value of the array at index `i`
				return i + 1; // `i+1` is the smallest missing positive integer
		}
		return n + 1; // `n+1` is the smallest missing positive integer
	}
}
