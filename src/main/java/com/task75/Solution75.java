package com.task75;

//75. Sort Colors
//Medium
                                     
//Given an array nums with n objects colored red, white, or blue, 
//sort them in-place so that objects of the same color are adjacent, 
//with the colors in the order red, white, and blue.
    
//We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

//You must solve this problem without using the library's sort function.

//Example 1:

//Input: nums = [2,0,2,1,1,0]
//Output: [0,0,1,1,2,2]
//Example 2:
    
//Input: nums = [2,0,1]
//Output: [0,1,2]

//Constraints:

//n == nums.length
//1 <= n <= 300
//nums[i] is either 0, 1, or 2.

public class Solution75 {
	
	public void sortColors(int[] nums) {
		int zero = 0; // index of 0
		int two = nums.length - 1; // index of 2
		for (int i = 0; i <= two;) { // for each element
			if (nums[i] == 0 && i > zero) { // if element is 0 and is not at the index of 0
				swap(nums, i, zero++); // swap element at index i with element at index 0
			} else if (nums[i] == 2 && i < two) { // if element is 2 and is not at the index of 2
				swap(nums, i, two--); // swap element at index i with element at index 2
			} else {
				i++; // increment i
			}
		}
	}

	void swap(int[] nums, int m, int n) {
		int temp = nums[m]; // store element at index m
		nums[m] = nums[n]; // swap element at index m with element at index n
		nums[n] = temp; // swap element at index n with element at index m
	}
}
