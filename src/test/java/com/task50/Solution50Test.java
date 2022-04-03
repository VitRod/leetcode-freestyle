package com.task50;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class Solution50Test {

	Solution50 solution = new Solution50();
	 
    @Test
    public void test1() {
        assertEquals(1024.00000, solution.myPow(2.00000, 10), 0.00001);
    }

    @Test
    public void test2() {
        assertEquals(9.26100, solution.myPow(2.10000, 3), 0.00001);
    }

    @Test
    public void test3() {
        assertEquals(0.25000, solution.myPow(2.00000, -2), 0.00001);
    }
}