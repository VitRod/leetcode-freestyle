package com.task04;
       
//4. Median of Two Sorted Arrays
//Hard      
       
//Given two sorted arrays nums1 and nums2 of size m and n respectively, 
//return the median of the two sorted arrays.

//The overall run time complexity should be O(log (m+n)).

//Example 1:

//Input: nums1 = [1,3], nums2 = [2]
//Output: 2.00000
//Explanation: merged array = [1,2,3] and median is 2.
//Example 2:

//Input: nums1 = [1,2], nums2 = [3,4]
//Output: 2.50000
//Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.

//Constraints:

//nums1.length == m
//nums2.length == n
//0 <= m <= 1000
//0 <= n <= 1000
//1 <= m + n <= 2000
//-106 <= nums1[i], nums2[i] <= 106

class Solution4 {

	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int m = nums1.length;
		int n = nums2.length;
		int[] merged = new int[m + n]; // merged array
		int i = 0, j = 0, k = 0; // i, j, k are the index of nums1, nums2, merged respectively
		while (i < m && j < n) { // while there are still elements in nums1 and nums2
			if (nums1[i] < nums2[j]) { // if nums1[i] < nums2[j], then add nums1[i] to merged
				merged[k++] = nums1[i++]; // add nums1[i] to merged
			} else {
				merged[k++] = nums2[j++]; // add nums2[j] to merged
			}
		}
		while (i < m) { // if there are still elements in nums1
			merged[k++] = nums1[i++]; // add nums1[i] to merged
		}
		while (j < n) { // if there are still elements in nums2
			merged[k++] = nums2[j++]; // add nums2[j] to merged
		}
		if ((m + n) % 2 == 0) { // if the length of merged is even
			return (merged[(m + n) / 2 - 1] + merged[(m + n) / 2]) / 2.0; // return the average of the two middle
																			// elements
		} else {
			return merged[(m + n) / 2]; // return the middle element
		}
	}  
}
