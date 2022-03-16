package com.task60;

//The set [1, 2, 3, ..., n] contains a total of n! unique permutations.

//By listing and labeling all of the permutations in order, 
//we get the following sequence for n = 3:

//"123"
//"132"
//"213"
//"231"
//"312"
//"321"
//Given n and k, return the kth permutation sequence.



//Example 1:

//Input: n = 3, k = 3
//Output: "213"
//Example 2:

//Input: n = 4, k = 9
//Output: "2314"
//Example 3:

//Input: n = 3, k = 1
//Output: "123"


//Constraints:

//1 <= n <= 9
//1 <= k <= n!

class Solution60 {
 public String getPermutation(int n, int k) {
     int [] nums = new int [n + 1]; // array of numbers from 1 to n
     int permcount = 1; // number of permutations
     for (int i = 0; i < n; i++) {   
         nums[i] = i + 1;   // initialize nums array
         permcount = permcount * (i + 1); // calculate permcount
     }

     k--;  // k is 1-based, so decrement it
     StringBuilder sb = new StringBuilder(); // initialize string builder
     for (int i = 0; i < n; i++) { 
         permcount = permcount / (n - i); // calculate permcount
         int index = k / permcount; // calculate index
         sb.append(nums[index]); // append number at index to string builder
         for(int j = index; j < n - i; j++) { // shift numbers to the left
             nums[j] = nums[j + 1]; // shift numbers to the left
         }
         k = k % permcount;  // calculate k
     }
     return sb.toString(); // return string builder
 }
}


