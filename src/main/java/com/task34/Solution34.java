package com.task34;

//34. Find First and Last Position of Element in Sorted Array
//Medium                 
    
//Given an array of integers nums sorted in non-decreasing order,
//find the starting and ending position of a given target value.

//If target is not found in the array, return [-1, -1].

//You must write an algorithm with O(log n) runtime complexity.

//Example 1:

//Input: nums = [5,7,7,8,8,10], target = 8
//Output: [3,4]
//Example 2:

//Input: nums = [5,7,7,8,8,10], target = 6
//Output: [-1,-1]
//Example 3:

//Input: nums = [], target = 0
//Output: [-1,-1]

//Constraints:

//0 <= nums.length <= 105
//-109 <= nums[i] <= 109
//nums is a non-decreasing array.
//-109 <= target <= 109

public class Solution34 {
	
	public int[] searchRange(int[] nums, int target) {
		int[] result = new int[2];
		result[0] = findFirst(nums, target);
		result[1] = findLast(nums, target);
		return result;
	}

	public int findFirst(int[] nums, int target) {
		if (nums == null || nums.length == 0) {
			return -1;
		}
		int start = 0;
		int end = nums.length - 1;
		int mid = (start + end) / 2;
		while (start <= end) {
			if (nums[mid] == target) {
				if (mid == 0 || nums[mid - 1] != target) {
					return mid;
				} else {
					end = mid - 1;
				}
			} else if (nums[mid] > target) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
			mid = (start + end) / 2;
		}
		return -1;
	}

	public int findLast(int[] nums, int target) {
		if (nums == null || nums.length == 0) {
			return -1;
		}
		int start = 0;
		int end = nums.length - 1;
		int mid = (start + end) / 2;
		while (start <= end) {
			if (nums[mid] == target) {
				if (mid == nums.length - 1 || nums[mid + 1] != target) {
					return mid;
				} else {
					start = mid + 1;
				}
			} else if (nums[mid] > target) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
			mid = (start + end) / 2;
		}
		return -1;
	}
}
