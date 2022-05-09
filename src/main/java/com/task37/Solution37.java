package com.task37;
   
//37. Sudoku Solver
//Hard
   
//Write a program to solve a Sudoku puzzle by filling the empty cells.
   
//A sudoku solution must satisfy all of the following rules:

//Each of the digits 1-9 must occur exactly once in each row.
//Each of the digits 1-9 must occur exactly once in each column.
//Each of the digits 1-9 must occur exactly once in each of the 9 3x3 sub-boxes of the grid.
//The '.' character indicates empty cells.

//Example 1:

//Input: board = [["5","3",".",".","7",".",".",".","."],["6",".",".","1","9","5",".",".","."],
//[".","9","8",".",".",".",".","6","."],["8",".",".",".","6",".",".",".","3"],
//["4",".",".","8",".","3",".",".","1"],["7",".",".",".","2",".",".",".","6"],
//[".","6",".",".",".",".","2","8","."],[".",".",".","4","1","9",".",".","5"],
//[".",".",".",".","8",".",".","7","9"]]

//Output: [["5","3","4","6","7","8","9","1","2"],["6","7","2","1","9","5","3","4","8"],
//["1","9","8","3","4","2","5","6","7"],["8","5","9","7","6","1","4","2","3"],
//["4","2","6","8","5","3","7","9","1"],["7","1","3","9","2","4","8","5","6"],
//["9","6","1","5","3","7","2","8","4"],["2","8","7","4","1","9","6","3","5"],
//["3","4","5","2","8","6","1","7","9"]]
//Explanation: The input board is shown above and the only valid solution is shown below:

//Constraints:

//board.length == 9
//board[i].length == 9
//board[i][j] is a digit or '.'.
//It is guaranteed that the input board has only one solution.

public class Solution37 {
	
	public void solveSudoku(char[][] board) {
		if (board == null || board.length == 0) {
			return;
		}
		solve(board);
	}

	private boolean solve(char[][] board) {
		for (int i = 0; i < board.length; i++) { // `i` is row
			for (int j = 0; j < board[0].length; j++) { // `j` is col
				if (board[i][j] == '.') { // if there is a '.', we need to try all possible values
					for (char c = '1'; c <= '9'; c++) { // `c` is the value we are trying
						if (isValid(board, i, j, c)) { // if it is valid, we assign it to the board
							board[i][j] = c; // assign the value to the board
							if (solve(board)) { // if it is valid, we recursively call solve
								return true; // if it is valid, we return true
							}
							board[i][j] = '.'; // if it is not valid, we reset the value to '.'
						}
					}
					return false; // if we tried all possible values and none of them is valid, we return false
				}
			}
		}
		return true; // if we tried all possible values and none of them is valid, we return false
	}

	
	private boolean isValid(char[][] board, int row, int col, char c) {
		for (int i = 0; i < 9; i++) { // `i` is row
			if (board[i][col] != '.' && board[i][col] == c) { // if the value is not '.' and the value is the same as c,
																// we return false
				return false;
			}
			if (board[row][i] != '.' && board[row][i] == c) { // if the value is not '.' and the value is the same as c,
																// we return false
				return false;
			}
//if the value is not '.' and the value is the same as c, we return false
			if (board[3 * (row / 3) + i / 3][3 * (col / 3) + i % 3] != '.'
					&& board[3 * (row / 3) + i / 3][3 * (col / 3) + i % 3] == c) {
				return false;
			}
		}
		return true; // if we tried all possible values and none of them is valid, we return false
	}
}
