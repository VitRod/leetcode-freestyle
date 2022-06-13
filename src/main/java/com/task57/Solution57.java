package com.task57;

import java.util.Arrays;

//57. Insert Interval
//Medium

//You are given an array of non-overlapping intervals intervals
//where intervals[i] = [starti, endi] represent the start and the end of the ith interval
//and intervals is sorted in ascending order by starti. 
//You are also given an interval newInterval = [start, end] that represents 
//the start and end of another interval.

//Insert newInterval into intervals such that intervals is still sorted 
//in ascending order by starti and intervals still does not have any overlapping
//intervals (merge overlapping intervals if necessary).

//Return intervals after the insertion.

//Example 1:

//Input: intervals = [[1,3],[6,9]], newInterval = [2,5]
//Output: [[1,5],[6,9]]
//Example 2:

//Input: intervals = [[1,2],[3,5],[6,7],[8,10],[12,16]], newInterval = [4,8]
//Output: [[1,2],[3,10],[12,16]]
//Explanation: Because the new interval [4,8] overlaps with [3,5],[6,7],[8,10].

//Constraints:

//0 <= intervals.length <= 104
//intervals[i].length == 2
//0 <= starti <= endi <= 105
//intervals is sorted by starti in ascending order.
//newInterval.length == 2
//0 <= start <= end <= 105

public class Solution57 {

	public int[][] insert(int[][] intervals, int[] newInterval) {
		if (intervals == null || intervals.length == 0) {
			return new int[][] { newInterval };
		}
		int[][] result = new int[intervals.length + 1][2];
		int i = 0;
		int j = 0;
		while (i < intervals.length && intervals[i][1] < newInterval[0]) {
			result[j++] = intervals[i++];
		}
		while (i < intervals.length && intervals[i][0] <= newInterval[1]) {
			newInterval[0] = Math.min(intervals[i][0], newInterval[0]);
			newInterval[1] = Math.max(intervals[i][1], newInterval[1]);
			i++;
		}
		result[j++] = newInterval;
		while (i < intervals.length) {
			result[j++] = intervals[i++];
		}
		return Arrays.copyOf(result, j);
	}
}
