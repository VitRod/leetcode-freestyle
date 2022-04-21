package com.task73;

//73. Set Matrix Zeroes
//Medium

//Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's.

//You must do it in place.

//Example 1:

//Input: matrix = [[1,1,1],[1,0,1],[1,1,1]]
//Output: [[1,0,1],[0,0,0],[1,0,1]]
//Example 2:

//Input: matrix = [[0,1,2,0],[3,4,5,2],[1,3,1,5]]
//Output: [[0,0,0,0],[0,4,5,0],[0,3,1,0]]

//Constraints:

//m == matrix.length
//n == matrix[0].length
//1 <= m, n <= 200
//-231 <= matrix[i][j] <= 231 - 1

//Follow up:

//A straightforward solution using O(mn) space is probably a bad idea.
//A simple improvement uses O(m + n) space, but still not the best solution.
//Could you devise a constant space solution?

public class Solution73 {

	public void setZeroes(int[][] matrix) {
		if (matrix == null || matrix.length == 0) { // if matrix is empty or null
			return; // return
		}
		int height = matrix.length; // get height
		int width = matrix[0].length; // get width
		boolean[][] zero = new boolean[height][width]; // create a boolean matrix
		for (int i = 0; i < height; i++) { // for each row
			for (int j = 0; j < width; j++) { // for each column
				if (matrix[i][j] == 0) { // if the element is 0
					zero[i][j] = true; // set the boolean matrix to true
				}
			}
		}

		for (int i = 0; i < height; i++) { // for each row
			for (int j = 0; j < width; j++) { // for each column
				if (zero[i][j]) { // if the boolean matrix is true
					for (int k = 0; k < height; k++) { // for each row
						matrix[k][j] = 0; // set the column to 0
					}
					for (int k = 0; k < width; k++) { // for each column
						matrix[i][k] = 0; // set the row to 0
					}
				}
			}
		}
	}
}