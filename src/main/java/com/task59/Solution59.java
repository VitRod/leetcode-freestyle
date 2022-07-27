package com.task59;

//59. Spiral Matrix II
//Medium
    
//Given a positive integer n, generate an n x n matrix filled 
//with elements from 1 to n2 in spiral order.

//Example 1:
//Input: n = 3
//Output: [[1,2,3],[8,9,4],[7,6,5]]

//Example 2:
//Input: n = 1
//Output: [[1]]

//Constraints:
//1 <= n <= 20

public class Solution59 {

	public int[][] generateMatrix(int n) {
		int[][] matrix = new int[n][n];
		int count = 1;
		int row = 0;
		int col = 0;
		int maxRow = n - 1;
		int maxCol = n - 1;
		while (row <= maxRow && col <= maxCol) {
			for (int i = col; i <= maxCol; i++) {
				matrix[row][i] = count++;
			}
			row++;
			for (int i = row; i <= maxRow; i++) {
				matrix[i][maxCol] = count++;
			}
			maxCol--;
			if (row <= maxRow) {
				for (int i = maxCol; i >= col; i--) {
					matrix[maxRow][i] = count++;
				}
				maxRow--;
			}
			if (col <= maxCol) {
				for (int i = maxRow; i >= row; i--) {
					matrix[i][col] = count++;
				}
				col++;
			}
		}
		return matrix;
	}
}
