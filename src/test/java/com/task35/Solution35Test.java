package com.task35;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Solution35Test {

	Solution35 solution = new Solution35();
    
    @Test
    public void test1() {
        int[] nums = {1,3,5,6};
        int target = 5;
        int expected = 2;
        int actual = solution.searchInsert(nums, target);
        assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        int[] nums = {1,3,5,6};
        int target = 2;
        int expected = 1;
        int actual = solution.searchInsert(nums, target);
        assertEquals(expected, actual);
    }

    @Test
    public void test3() {
        int[] nums = {1,3,5,6};
        int target = 7;
        int expected = 4;
        int actual = solution.searchInsert(nums, target);
        assertEquals(expected, actual);
    }
}