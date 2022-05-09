package com.task30;

import java.util.ArrayList;    
import java.util.HashMap;
import java.util.List;   
import java.util.Map;

// 30. Substring with Concatenation of All Words   
// Hard
   
// You are given a string s and an array of strings words of the same length. 
// Return all starting indices of substring(s) in s that is a concatenation of each word 
// in words exactly once, in any order, and without any intervening characters.

// You can return the answer in any order.

// Example 1:

// Input: s = "barfoothefoobarman", words = ["foo","bar"]
// Output: [0,9]
// Explanation: Substrings starting at index 0 and 9 are "barfoo" and "foobar" respectively.
// The output order does not matter, returning [9,0] is fine too.
// Example 2:

// Input: s = "wordgoodgoodgoodbestword", words = ["word","good","best","word"]
// Output: []
// Example 3:

// Input: s = "barfoofoobarthefoobarman", words = ["bar","foo","the"]
// Output: [6,9,12]

// Constraints:

// 1 <= s.length <= 104
// s consists of lower-case English letters.
// 1 <= words.length <= 5000
// 1 <= words[i].length <= 30
// words[i] consists of lower-case English letters.

public class Solution30 {
	public List<Integer> findSubstring(String s, String[] words) {
		List<Integer> res = new ArrayList<>();
		if (s == null || s.length() == 0 || words == null || words.length == 0) {
			return res;
		}
		int len = words[0].length();
		int n = words.length;
		int total = n * len;
		Map<String, Integer> map = new HashMap<>();
		for (String word : words) {
			map.put(word, map.getOrDefault(word, 0) + 1);
		}
		for (int i = 0; i < len; i++) {
			int left = i, count = 0;
			Map<String, Integer> cur = new HashMap<>();
			for (int j = i; j <= s.length() - len; j += len) {
				String word = s.substring(j, j + len);
				if (map.containsKey(word)) {
					cur.put(word, cur.getOrDefault(word, 0) + 1);
					if (cur.get(word) <= map.get(word)) {
						count++;
					} else {
						while (cur.get(word) > map.get(word)) {
							String leftWord = s.substring(left, left + len);
							cur.put(leftWord, cur.get(leftWord) - 1);
							if (cur.get(leftWord) < map.get(leftWord)) {
								count--;
							}
							left += len;
						}
					}
					if (count == n) {
						res.add(left);
						String leftWord = s.substring(left, left + len);
						cur.put(leftWord, cur.get(leftWord) - 1);
						if (cur.get(leftWord) < map.get(leftWord)) {
							count--;
						}
						left += len;
					}
				} else {
					cur.clear();
					count = 0;
					left = j + len;
				}
			}
		}
		return res;
	}
}
