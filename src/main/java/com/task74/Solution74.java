package com.task74;

//74. Search a 2D Matrix
//Medium    
                               
//Write an efficient algorithm that searches for a value target in an m x n integer matrix matrix. 
//This matrix has the following properties:

//Integers in each row are sorted from left to right.
//The first integer of each row is greater than the last integer of the previous row.

//Example 1:

//Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
//Output: true
//Example 2:

//Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 13
//Output: false

//Constraints:

//m == matrix.length
//n == matrix[i].length
//1 <= m, n <= 100
//-104 <= matrix[i][j], target <= 104
     
public class Solution74 {

	public boolean searchMatrix(int[][] matrix, int target) {
		if (matrix == null || matrix.length == 0 || matrix[0].length == 0 || matrix[0][0] > target
				|| matrix[matrix.length - 1][matrix[0].length - 1] < target) { // if target is out of range
			return false;
		}
		int m = matrix.length; // number of rows
		int n = matrix[0].length; // number of columns
		int left = 0; // left index
		int right = m * n - 1; // right index
		while (left <= right) { // while left index is less than or equal to right index
			int mid = left + (right - left) / 2; // mid index
			int row = mid / n; // row index
			int col = mid % n; // column index
			if (matrix[row][col] == target) { // if target is found
				return true; // return true
			} else if (matrix[row][col] > target) { // if target is less than matrix[row][col]
				right = mid - 1; // right index is mid index - 1
			} else {
				left = mid + 1; // left index is mid index + 1
			}
		}
		return false; // return false
	}
}
