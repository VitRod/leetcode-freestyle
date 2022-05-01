package com.task78;

import java.util.ArrayList;
import java.util.List;

// 78. Subsets
// Medium


// Given an integer array nums of unique elements, return all possible subsets (the power set).

// The solution set must not contain duplicate subsets. Return the solution in any order.

 

// Example 1:

// Input: nums = [1,2,3]
// Output: [[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]
// Example 2:

// Input: nums = [0]
// Output: [[],[0]]
 

// Constraints:

// 1 <= nums.length <= 10
// -10 <= nums[i] <= 10
// All the numbers of nums are unique.



public class Solution78 {
	
	public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>(); // result
        if(nums == null) { // if nums is null
            return result; 
        }
        result.add(new ArrayList<>()); // add empty list to result
        for(int i = 0; i < nums.length; i++) { // for each nums[i]
            List temp = new ArrayList<>();
            // you will have to create a new one here,
            // otherwise  it'll throw ConcurrentModificationException
            // because you are modifying the same list
            for(List list : result) { // for each list in result
                 List newList = new ArrayList<>(list); // create a new list
                 newList.add(nums[i]); // add nums[i] to new list
                 temp.add(newList); // add new list to temp
            } 
            result.addAll(temp); // add temp to result
    }
    return result; // return result
    }
}