package com.task45;

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

