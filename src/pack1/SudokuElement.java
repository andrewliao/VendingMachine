package pack1;
import java.util.*;

public class SudokuElement {
	private int square;
	private int data;
	private int row;
	private int column;
	private ArrayList<Integer> possibleNum = new ArrayList<Integer>();
	
	public SudokuElement() {
		square = 0;
		data = 0;
		row = 0;
		column = 0;
	}
	
	public void setRow(int r) {
		row = r;
	} 
	
	public int getRow() {
		return row;
	}
	
	public void setSquare(int s) {
		square = s;
	}
	
	public int getSquare() {
		return square;
	}
	
	public void setCollumn(int c) {
		column = c;
	}
	
	public int getCollumn() {
		return column;
	}
	
	public SudokuElement(int r, int c) {
		row = r;
		column = c;
	}
	

	
	public void setNumber(int x) {
		data = x;
	}
	
	public int getData() {
		return data;
	}
	

	public void addData(int x) {
		data = x;
	}
	
	public void addPossibleNum(int x) {
		possibleNum.add(x);
	}
	
	public ArrayList<Integer> getPossibleNum() {
		return possibleNum;
	}
	
}
