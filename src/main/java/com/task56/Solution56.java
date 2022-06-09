package com.task56;

import java.util.ArrayList;
import java.util.Arrays;

// 56. Merge Intervals    
// Medium                   
    
// Given an array of intervals where intervals[i] = [starti, endi], 
// merge all overlapping intervals, and return an array of the non-overlapping 
// intervals that cover all the intervals in the input.

// Example 1:

// Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
// Output: [[1,6],[8,10],[15,18]]
// Explanation: Since intervals [1,3] and [2,6] overlaps, merge them into [1,6].
// Example 2:

// Input: intervals = [[1,4],[4,5]]
// Output: [[1,5]]
// Explanation: Intervals [1,4] and [4,5] are considered overlapping.

// Constraints:

// 1 <= intervals.length <= 104
// intervals[i].length == 2
// 0 <= starti <= endi <= 104

public class Solution56 {

	public int[][] merge(int[][] intervals) {
		Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0])); // sort by start
		ArrayList<int[]> list = new ArrayList<>(); // store the result

		for (int i = 0; i < intervals.length; i++) { // iterate through the intervals
			int s = intervals[i][0]; // start
			int e = intervals[i][1]; // end
			for (int j = i + 1; j < intervals.length; j++) { // iterate through the rest of the intervals
				if (intervals[j][0] >= s && intervals[j][0] <= e) { // if the start of the next interval is within the
																	// current interval
					if (intervals[j][1] > e) { // if the end of the next interval is greater than the current interval
						e = intervals[j][1]; // update the end
					}
					i++; // increment the index
				}
			}
			list.add(new int[] { s, e }); // add the interval to the result
		}
		return list.toArray(new int[list.size()][2]); // return the result
	}
}
