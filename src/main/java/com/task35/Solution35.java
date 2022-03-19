package com.task35;

//35. Search Insert Position
//Easy

//Given a sorted array of distinct integers and a target value,
//return the index if the target is found. If not, 
//return the index where it would be if it were inserted in order.

//You must write an algorithm with O(log n) runtime complexity.

//Example 1:

//Input: nums = [1,3,5,6], target = 5
//Output: 2
//Example 2:

//Input: nums = [1,3,5,6], target = 2
//Output: 1
//Example 3:

//Input: nums = [1,3,5,6], target = 7
//Output: 4

//Constraints:

//1 <= nums.length <= 104
//-104 <= nums[i] <= 104
//nums contains distinct values sorted in ascending order.
//-104 <= target <= 104

public class Solution35 {
	public int searchInsert(int[] nums, int target) {
		// `>>` is the same as `/2`
		int left = 0, right = nums.length - 1, mid = (right + left) >> 1;
		while (left <= right) { // left <= right is important
			if (target <= nums[mid]) // target is in the left part
				right = mid - 1; // right is the last element in the left part
			else
				left = mid + 1; // left is the left boundary
			mid = (right + left) >> 1; // mid is the new mid

		}
		return left; // left is the index of the target

	}
}
