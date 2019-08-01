package chapter_08_questions;

import java.util.Scanner;

public class Question_08_09 {

	public static void main(String[] args) {
		String[][] board = getBoard();
		
		//create two players token
		String[] tokens = {" X ", " O "};
		
		int result; // game status result
		
		do {
			
			//display board
			print(board);
			
			//get available cell with player's token
			int[] cell = getCell(board, tokens[0]);
			
			
			
			placeToken(board, cell, tokens[0]);
			
			
			
			
			
		}while();
	}

	public static String[][] getBoard() {
		String[][] m = new String[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				m[i][j] = "  ";
			}
		}
		return m;
	}

	public static void print(String[][] m) {
		System.out.println("\n----------------");
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.print("|" + m[i][j]);
			}
			System.out.println("|\n------------------");
		}
	}
	
	public static int[] getCell(String[][] m, String t) {
		Scanner input = new Scanner(System.in);
		int[] cell = new int[2]; // cell row and column
		
		do {
			System.out.print("Enter a row(0, 1, or 2 for player " + t + ": ");
			cell[0] = input.nextInt();
			System.out.println("Enter a column(0, 1, or 2 for player " + t + ": ");
			cell[1] = input.nextInt();
		}while (!isValidCell(m, cell));
		return cell;
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
