package com.task55;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Solution55Test {

	Solution55 s = new Solution55();

    @Test
    public void test1() {
        int[] nums = {2,3,1,1,4};
        assertEquals(true, s.canJump(nums));
    }

    @Test
    public void test2() {
        int[] nums = {3,2,1,0,4};
        assertEquals(false, s.canJump(nums));
    }
}