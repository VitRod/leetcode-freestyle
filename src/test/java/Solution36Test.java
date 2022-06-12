import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.task36.Solution36;

class Solution36Test {

	 Solution36 solution = new Solution36();   
	    
	    @Test
	    public void test1() {
	        char[][] board = {
	                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
	                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
	                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
	                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
	                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
	                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
	                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
	                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
	                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
	        };
	        assertEquals(true, solution.isValidSudoku(board));
	    }

	    @Test
	    public void test2() {
	        char[][] board = {
	                {'8', '3', '.', '.', '7', '.', '.', '.', '.'},
	                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
	                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
	                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
	                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
	                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
	                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
	                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
	                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
	        };
	        assertEquals(false, solution.isValidSudoku(board));
	    }

	    @Test
	    public void test3() {
	        char[][] board = {
	                {'.', '.', '.', '.', '5', '.', '.', '1', '.'},
	                {'.', '4', '.', '3', '.', '.', '.', '.', '.'},
	                {'.', '.', '.', '.', '.', '3', '.', '.', '1'},
	                {'8', '.', '.', '.', '.', '.', '.', '2', '.'},
	                {'.', '.', '2', '.', '7', '.', '.', '.', '.'},
	                {'.', '1', '5', '.', '.', '.', '.', '.', '.'},
	                {'.', '.', '.', '.', '.', '2', '.', '.', '.'},
	                {'.', '2', '.', '9', '.', '.', '.', '.', '.'},
	                {'.', '.', '4', '.', '.', '.', '.', '.', '.'}
	        };
	        assertEquals(false, solution.isValidSudoku(board));
	    }
	}
