package pack1;

public class Sudoku2 {

	private final int[][] BOARDREFERNCE = {{1, 1, 1, 2, 2, 2, 3, 3, 3}, 
										   {1, 1, 1, 2, 2, 2, 3, 3, 3}, 
										   {1, 1, 1, 2, 2, 2, 3, 3, 3},
										   {4, 4, 4, 5, 5, 5, 6, 6, 6},
										   {4, 4, 4, 5, 5, 5, 6, 6, 6},
										   {4, 4, 4, 5, 5, 5, 6, 6, 6},
										   {7, 7, 7, 8, 8, 8, 9, 9, 9},
										   {7, 7, 7, 8, 8, 8, 9, 9, 9},
										   {7, 7, 7, 8, 8, 8, 9, 9, 9}};
	private SudokuElement[][] board;
	
	public Sudoku2() {
		board = new SudokuElement[9][9];
	}

	public boolean checkNum(SudokuElement element, int x) {
		//check the rows 
		int row = element.getRow();
		for (int i = 0; i < 9; i++) {
			if(board[row][i].getData() == x) {
				return true;
			}
		}
		
		//check the column
		int column = element.getCollumn();
		for (int j = 0; j < 9; j++) {
			if(board[j][column].getData() == x) {
				return true;
			}
		}
		
		//check your square
		int squareNumber = element.getSquare();
		//go through the board reference
		for(int i = 0; i < 9; i++) {
			for(int j = 0; j < 9; j++) {
				if(BOARDREFERNCE[i][j] == squareNumber) { // checks if it is the right square, you have the right reference point for both rows and columns
					if(board[i][j] == element) {
						return true;
					}
				}
			}
		}
		
		//return false if nothing returned true
		return false;
	}
	
	public static void main(String[] args) {
		
	}
}
