package com.task79;

//79. Word Search
//Medium

//Given an m x n grid of characters board and a string word, return true if word exists in the grid.

//The word can be constructed from letters of sequentially adjacent cells, where adjacent cells are horizontally or vertically neighboring. The same letter cell may not be used more than once.

//Example 1:

//Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "ABCCED"
//Output: true
//Example 2:

//Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "SEE"
//Output: true
//Example 3:

//Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "ABCB"
//Output: false

//Constraints:

//m == board.length
//n = board[i].length
//1 <= m, n <= 6
//1 <= word.length <= 15
//board and word consists of only lowercase and uppercase English letters.

class Solution79 {

	boolean[][] visited;

	public boolean exist(char[][] board, String word) {
		int m = board.length; // rows
		int n = board[0].length; // cols
		visited = new boolean[m][n]; // initialize visited array
		for (int i = 0; i < m; i++) { // loop through rows
			for (int j = 0; j < n; j++) { // loop through cols
				if (word.charAt(0) == board[i][j] && search(board, word, i, j, 0)) { // if first char matches and search
																						// returns true
					return true; // return true
				}
			}
		}
		return false; // return false
	}

	boolean search(char[][] board, String word, int i, int j, int pos) {
		if (pos == word.length()) { // if pos is equal to word length
			return true; // return true
		}
		if (i < 0 || j < 0 || i >= board.length || j >= board[0].length || word.charAt(pos) != board[i][j]
				|| visited[i][j]) { // if any of the above conditions are true
			return false;
		}
		visited[i][j] = true; // mark visited
		if (search(board, word, i + 1, j, pos + 1) || search(board, word, i - 1, j, pos + 1)
				|| search(board, word, i, j + 1, pos + 1) || search(board, word, i, j - 1, pos + 1)) { // if any of the
																										// above
																										// conditions
																										// are true
			return true; // return true
		}

		visited[i][j] = false; // mark unvisited
		return false; // return false
	}
}
