package com.task54;

import java.util.ArrayList;
import java.util.List;

// 54. Spiral Matrix
// Medium

// Given an m x n matrix, return all elements of the matrix in spiral order.

// Example 1:
// Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
// Output: [1,2,3,6,9,8,7,4,5]
// Example 2:

// Input: matrix = [[1,2,3,4],[5,6,7,8],[9,10,11,12]]
// Output: [1,2,3,4,8,12,11,10,9,5,6,7]

// Constraints:

// m == matrix.length
// n == matrix[i].length
// 1 <= m, n <= 10
// -100 <= matrix[i][j] <= 100

public class Solution54 {

	public List<Integer> spiralOrder(int[][] matrix) {
		List<Integer> res = new ArrayList<>(); // initialize result list
		if (matrix.length == 0)
			return res; // if matrix is empty, return empty list
		int m = matrix.length, n = matrix[0].length; // initialize m and n
		int[][] visited = new int[m][n]; // initialize visited matrix
		int[] dx = { 0, 1, 0, -1 }; // initialize dx and dy
		int[] dy = { 1, 0, -1, 0 };
		int x = 0, y = 0, d = 0; // initialize x, y, d
		for (int i = 0; i < m * n; i++) { // loop until all elements are visited
			res.add(matrix[x][y]); // add current element to result list
			visited[x][y] = 1; // mark current element as visited
			int nx = x + dx[d], ny = y + dy[d]; // calculate next x and y
			if (nx < 0 || nx >= m || ny < 0 || ny >= n || visited[nx][ny] == 1) { // if next x or y is out of bound or
																					// next element is visited
				d = (d + 1) % 4; // change direction
				nx = x + dx[d]; // calculate next x
				ny = y + dy[d]; // calculate next y
			}
			x = nx; // update x
			y = ny; // update y
		}
		return res; // return result list
	}
}