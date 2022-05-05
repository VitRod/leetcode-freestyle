package com.task16;
        
import java.util.Arrays;
      
//16. 3Sum Closest
        
//Given an integer array nums of length n and an integer target, 
//find three integers in nums such that the sum is closest to target.
   
//Return the sum of the three integers.
   
//You may assume that each input would have exactly one solution.

//Example 1:

//Input: nums = [-1,2,1,-4], target = 1
//Output: 2
//Explanation: The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
//Example 2:

//Input: nums = [0,0,0], target = 1
//Output: 0

//Constraints:

//3 <= nums.length <= 1000
//-1000 <= nums[i] <= 1000
//-104 <= target <= 104
   
public class Solution16 {

	public int threeSumClosest(int[] nums, int target) {
		Arrays.sort(nums); // sort the array
		int closest = nums[0] + nums[1] + nums[2]; // initialize the closest sum
		for (int i = 0; i < nums.length - 2; i++) { // loop through the array
			int j = i + 1, k = nums.length - 1; // initialize the two pointers
			while (j < k) { // while the two pointers are not equal
				int sum = nums[i] + nums[j] + nums[k]; // calculate the sum
				// if the sum is closer to the target
				if (Math.abs(target - sum) < Math.abs(target - closest)) {
					closest = sum; // update the closest sum
				}
				if (sum < target) { // if the sum is less than the target
					j++; // increment the j pointer
				} else if (sum > target) { // if the sum is greater than the target
					k--; // decrement the k pointer
				} else { // if the sum is equal to the target
					return sum; // return the sum
				}
			}
		}
		return closest; // return the closest sum
	}
}
