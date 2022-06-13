package com.task53;

//53. Maximum Subarray
//Easy

//Given an integer array nums, find the contiguous subarray 
//(containing at least one number) which has the largest sum and return its sum.

//A subarray is a contiguous part of an array.

//Example 1:

//Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
//Output: 6
//Explanation: [4,-1,2,1] has the largest sum = 6.
//Example 2:

//Input: nums = [1]
//Output: 1
//Example 3:

//Input: nums = [5,4,-1,7,8]
//Output: 23

//Constraints:

//1 <= nums.length <= 105
//-104 <= nums[i] <= 104

//Follow up: If you have figured out the O(n) solution,
//try coding another solution using the divide and conquer approach, which is more subtle.

public class Solution53 {

	public int maxSubArray(int[] nums) {
		int max = nums[0]; // max sum
		int sum = 0; // current sum
		for (int i = 0; i < nums.length; i++) { // for each element
			sum += nums[i]; // add to current sum
			if (sum > max) { // if current sum is greater than max sum
				max = sum; // update max sum
			}
			if (sum < 0) { // if current sum is less than 0
				sum = 0; // reset sum to 0
			}
		}
		return max; // return max sum

	}
}
