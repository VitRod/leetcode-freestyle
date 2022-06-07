package com.task63;

//63. Unique Paths II         
//Medium         
    
//You are given an m x n integer array grid. There is a robot initially 
//located at the top-left corner (i.e., grid[0][0]). The robot tries 
//to move to the bottom-right corner (i.e., grid[m-1][n-1]). 
//The robot can only move either down or right at any point in time.

//An obstacle and space are marked as 1 or 0 respectively in grid. 
//A path that the robot takes cannot include any square that is an obstacle.

//Return the number of possible unique paths that the robot can take to reach the bottom-right corner.

//The testcases are generated so that the answer will be less than or equal to 2 * 109.

//Example 1:

//Input: obstacleGrid = [[0,0,0],[0,1,0],[0,0,0]]
//Output: 2
//Explanation: There is one obstacle in the middle of the 3x3 grid above.
//There are two ways to reach the bottom-right corner:
//1. Right -> Right -> Down -> Down
//2. Down -> Down -> Right -> Right
//Example 2:

//Input: obstacleGrid = [[0,1],[0,0]]
//Output: 1

//Constraints:

//m == obstacleGrid.length
//n == obstacleGrid[i].length
//1 <= m, n <= 100
//obstacleGrid[i][j] is 0 or 1.

public class Solution63 {

	public int uniquePathsWithObstacles(int[][] obstacleGrid) {
		if (obstacleGrid == null || obstacleGrid.length == 0) { // if the input is null or empty
			return 0;
		}

		int height = obstacleGrid.length; // height of the grid
		int width = obstacleGrid[0].length; // width of the grid
		int[][] dp = new int[height][width]; // dp array to store the number of paths
		dp[0][0] = obstacleGrid[0][0] == 1 ? 0 : 1; // if the first element is 1, then the number of paths is 0
		for (int i = 1; i < height; i++) { // iterate through the rows
			dp[i][0] = obstacleGrid[i][0] == 1 ? 0 : dp[i - 1][0]; // if the first element is 1, then the number of
																	// paths is 0
		}
		for (int j = 1; j < width; j++) { // iterate through the columns
			dp[0][j] = obstacleGrid[0][j] == 1 ? 0 : dp[0][j - 1]; // if the first element is 1, then the number of
																	// paths is 0
		}

		for (int i = 1; i < height; i++) { // iterate through the rows
			for (int j = 1; j < width; j++) { // iterate through the columns
				if (obstacleGrid[i][j] == 1) { // if the element is 1, then the number of paths is 0
					dp[i][j] = 0; // set the number of paths to 0
				} else {
					int paths = 0; // number of paths
					if (obstacleGrid[i - 1][j] == 0) { // if the element above is 0, then add the number of paths
						paths += dp[i - 1][j]; // add the number of paths
					}
					if (obstacleGrid[i][j - 1] == 0) { // if the element to the left is 0, then add the number of paths
						paths += dp[i][j - 1]; // add the number of paths
					}
					dp[i][j] = paths; // set the number of paths
				}
			}
		}
		return dp[height - 1][width - 1]; // return the number of paths

	}
}
