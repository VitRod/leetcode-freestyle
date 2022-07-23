package com.task42;

//42. Trapping Rain Water
//Hard

//Given n non-negative integers representing an elevation map where the width of each bar is 1,
//compute how much water it can trap after raining.
              
                                    

//Example 1:

    
//Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
//Output: 6
//Explanation: The above elevation map (black section) is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. 
//In this case, 6 units of rain water (blue section) are being trapped.
//Example 2:

//Input: height = [4,2,0,3,2,5]
//Output: 9


//Constraints:

//n == height.length
//1 <= n <= 2 * 104
//0 <= height[i] <= 105

public class Solution42 {

	 public int trap(int[] height) {
	        int left = 0; // left pointer
	        int right = height.length - 1; // right pointer
	        int leftMax = 0; // left max height
	        int rightMax = 0; // right max height
	        int result = 0; // result
	        while (left < right) { // while left pointer is smaller than right pointer
	            if (height[left] < height[right]) { // if left height is smaller than right height
	                if (height[left] >= leftMax) { // if left height is larger than or equal to left max height
	                    leftMax = height[left]; // update left max height
	                } else {
	                    result += leftMax - height[left]; // add water trapped by left height
	                }
	                left++; //  move left pointer
	            } else {
	                if (height[right] >= rightMax) { // if right height is larger than or equal to right max height
	                    rightMax = height[right]; // update right max height
	                } else {
	                    result += rightMax - height[right]; // add water trapped by right height
	                }
	                right--; // move right pointer
	            }
	        }
	        return result; // return result
	    }
	}
	    
