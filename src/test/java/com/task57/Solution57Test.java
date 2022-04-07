package com.task57;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Solution57Test {

	Solution57 s = new Solution57();

    @Test
    public void test1() {
        int[][] intervals = {{1,3},{6,9}};
        int[] newInterval = {2,5};
        int[][] result = s.insert(intervals, newInterval);
        int[][] expected = {{1,5},{6,9}};
        assertEquals(expected.length, result.length);
        for (int i = 0; i < result.length; i++) {
            assertEquals(expected[i][0], result[i][0]);
            assertEquals(expected[i][1], result[i][1]);
        }
    }

    @Test
    public void test2() {
        int[][] intervals = {{1,2},{3,5},{6,7},{8,10},{12,16}};
        int[] newInterval = {4,8};
        int[][] result = s.insert(intervals, newInterval);
        int[][] expected = {{1,2},{3,10},{12,16}};
        assertEquals(expected.length, result.length);
        for (int i = 0; i < result.length; i++) {
            assertEquals(expected[i][0], result[i][0]);
            assertEquals(expected[i][1], result[i][1]);
        }
    }
}