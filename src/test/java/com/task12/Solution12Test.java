package com.task12;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
    
class Solution12Test {
                    
	@Test
	public void testIntToRoman() {
		Solution12 s = new Solution12();
		assertEquals("III", s.intToRoman(3));
		assertEquals("LVIII", s.intToRoman(58));
		assertEquals("MCMXCIV", s.intToRoman(1994));
	}
}
