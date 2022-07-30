package com.task45;

//45. Jump Game II
//Medium    
           
//Given an array of non-negative integers nums, you are initially 
//positioned at the first index of the array.
    
//Each element in the array represents your maximum jump length at that position.
    
//Your goal is to reach the last index in the minimum number of jumps.

//You can assume that you can always reach the last index.

//Example 1:

//Input: nums = [2,3,1,1,4]
//Output: 2
//Explanation: The minimum number of jumps to reach the last index is 2.
//Jump 1 step from index 0 to 1, then 3 steps to the last index.
//Example 2:

//Input: nums = [2,3,0,1,4]
//Output: 2

//Constraints:

//1 <= nums.length <= 104
//0 <= nums[i] <= 1000

public class Solution45 {

	public int jump(int[] nums) {
		int n = nums.length; // number of elements in the array
		int[] dp = new int[n]; // dp[i] = minimum number of jumps to reach index i
		dp[0] = 0; // base case
		for (int i = 1; i < n; ++i) { // iterate over the array
			dp[i] = Integer.MAX_VALUE; // initialize the value to be infinity
			for (int j = 0; j < i; ++j) { // iterate over the previous indices
				if (j + nums[j] >= i) { // if we can reach index i from index j
					dp[i] = Math.min(dp[i], dp[j] + 1); // update the value
				}
			}
		}
		return dp[n - 1]; // return the last value
	}
}
