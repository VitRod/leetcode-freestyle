package com.task36;

import java.util.ArrayList;
import java.util.List;

// 36. Valid Sudoku
// Medium

// Determine if a 9 x 9 Sudoku board is valid. Only the filled cells need
//  to be validated according to the following rules:

// Each row must contain the digits 1-9 without repetition.
// Each column must contain the digits 1-9 without repetition.
// Each of the nine 3 x 3 sub-boxes of the grid must contain the digits 1-9 without repetition.
// Note:

// A Sudoku board (partially filled) could be valid but is not necessarily solvable.
// Only the filled cells need to be validated according to the mentioned rules.

// Example 1:

// Input: board = 
// [["5","3",".",".","7",".",".",".","."]
// ,["6",".",".","1","9","5",".",".","."]
// ,[".","9","8",".",".",".",".","6","."]
// ,["8",".",".",".","6",".",".",".","3"]
// ,["4",".",".","8",".","3",".",".","1"]
// ,["7",".",".",".","2",".",".",".","6"]
// ,[".","6",".",".",".",".","2","8","."]
// ,[".",".",".","4","1","9",".",".","5"]
// ,[".",".",".",".","8",".",".","7","9"]]
// Output: true
// Example 2:

// Input: board = 
// [["8","3",".",".","7",".",".",".","."]
// ,["6",".",".","1","9","5",".",".","."]
// ,[".","9","8",".",".",".",".","6","."]
// ,["8",".",".",".","6",".",".",".","3"]
// ,["4",".",".","8",".","3",".",".","1"]
// ,["7",".",".",".","2",".",".",".","6"]
// ,[".","6",".",".",".",".","2","8","."]
// ,[".",".",".","4","1","9",".",".","5"]
// ,[".",".",".",".","8",".",".","7","9"]]
// Output: false
// Explanation: Same as Example 1, except with the 5 in the top left corner being modified to 8. 
//Since there are two 8's in the top left 3x3 sub-box, it is invalid.

// Constraints:

// board.length == 9
// board[i].length == 9
// board[i][j] is a digit 1-9 or '.'.

public class Solution36 {

	public boolean isValidSudoku(char[][] board) {
        List<List<Character>> rows = new ArrayList<>(); // rows` is a list of lists of characters
        List<List<Character>> cols = new ArrayList<>();//  cols` is a list of lists of characters
        List<List<Character>> boxes = new ArrayList<>(); // boxes` is a list of lists of characters
        for (int i = 0; i < 9; i++) { //  for each row
            rows.add(new ArrayList<>()); //  add a new list to rows
            cols.add(new ArrayList<>()); //     add a new list to cols
            boxes.add(new ArrayList<>()); //    add a new list to boxes
        }
        for (int i = 0; i < 9; i++) { //    for each row
            for (int j = 0; j < 9; j++) { //    for each column
                if (board[i][j] != '.') { //    if the character is not a dot
                    char c = board[i][j]; //    get the character
                    if (rows.get(i).contains(c)) { //    if the character is in the row
                        return false; //    return false
                    }
                    rows.get(i).add(c); //    add the character to the row
                    if (cols.get(j).contains(c)) { //    if the character is in the column
                        return false; //    return false
                    }
                    cols.get(j).add(c); //    add the character to the column
                    int boxIndex = (i / 3) * 3 + j / 3; //    get the box index
                    if (boxes.get(boxIndex).contains(c)) { //    if the character is in the box
                        return false; //    return false
                    }
                    boxes.get(boxIndex).add(c); //    add the character to the box
                }
            }
        }
        return true; //    return true
    }
}
  