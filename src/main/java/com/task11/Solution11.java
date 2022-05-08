package com.task11;
      
//11. Container With Most Water
//Medium
        
//You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).
     
//Find two lines that together with the x-axis form a container, such that the container contains the most water.

//Return the maximum amount of water a container can store.

//Notice that you may not slant the container.

//Example 1:
                   
//Input: height = [1,8,6,2,5,4,8,3,7]
//Output: 49
//Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.
//Example 2:

//Input: height = [1,1]
//Output: 1

//Constraints:

//n == height.length
//2 <= n <= 105
//0 <= height[i] <= 104

public class Solution11 {

	 public int maxArea(int[] height) {
	        int l = 0;      // left pointer
	        int r = height.length - 1; // right pointer
	        int max = 0; // max area
	        int h = 0; // height
	    	
	    	while(l < r) {     // while left pointer is less than right pointer
	    		h =  Math.min(height[l], height[r]) ; // get the smaller height
	    		max = Math.max(max, (r - l) * h); // get the max area
	    		while (height[l] <= h && l < r) // if left pointer is less than or equal to height and left pointer is less than right pointer
	    			++l; // increment left pointer
	    		while (height[r] <= h && l < r) // if right pointer is less than or equal to height and left pointer is less than right pointer
	    			--r; // decrement right pointer
	    		}
	    	
	    	return max; // return max area
	    	
	    }
	}
