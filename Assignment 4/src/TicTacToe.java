/**
 * @author Jacob Nartey
 * 3. Tic Tac Toe
 */

import java.util.Scanner;

public class TicTacToe {
	public static void main(String[] args) {
		//Instantiating Scanner class to read input
		Scanner reader = new Scanner(System.in);
		
		//Creating 2D array of size 3
		char[][] board = new char[3][3];
		char[] blankLine = {' ',' ',' '};		
		
		//Fill array with default values
		for(int i = 0; i < board.length; i++) {
			board[i] = blankLine.clone();
		}
		
		//Counter to check if the user is even or odd
		int countEven = 1;
		
		//Initializing user inputs  
		int current_x = 0, current_y = 0;
		
		//User symbol variable
		char symbol = ' ';
		
		System.out.println(
				"++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n"
				+ "+ What row(x) and column(y) would you like to place your mark?\n"
				+ "+ or Enter 8 quit\n"
				+ "++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n"
				);
		
		//Increment counter to serve as a terminating condition if end of array;
		int count = 0;
		
		do {
			if(countEven % 2 == 0) {
				//Prompting User 2 to enter coordinates
				System.out.println("Your turn user 2:");
				System.out.println("Enter row(x)");
				System.out.print("> ");
				current_x = reader.nextInt();
				
				//End program condition
				if(current_x == 8) {
					break;
				}
								
				System.out.println("Enter column(y)");
				System.out.print("> ");
				current_y = reader.nextInt();
				
				//End program condition
				if(current_y == 8) {
					break;
				}
				
				System.out.println("");
				
				symbol = 'Y';
				
			}else {
				//Prompting User 1 to enter coordinates
				System.out.println("Your turn user 1:");
				System.out.println("Enter row(x)");
				System.out.print("> ");
				current_x = reader.nextInt();
				
				//End program condition
				if(current_x == 8) {
					break;
				}
				
				System.out.println("Enter column(y)");
				System.out.print("> ");
				current_y = reader.nextInt();
				
				//End program condition
				if(current_y == 8) {
					break;
				}
				
				System.out.println("");
				
				symbol = 'X';
			}
			
			//Check if coordinates are within range
			if(current_x >= 0 && current_x < 3 && current_y >= 0 && current_y < 3) {
				if(board[current_x][current_y] == 'Y' || board[current_x][current_y] == 'X'){
			        System.out.println("This spot is occupied. Please try again");
			        continue;
			    }
				
				for(int i = 0; i < board.length; i++) {//Rows
					for(int j = 0; j < board[i].length; j++) {//Columns
						board[current_x][current_y] = symbol;
					}
				}
			
				//Print tic tac toe board after each user input
				for(char[] row : board) {//Row
					for(char column : row) {//Columns
						System.out.print(column + " ");
					}
					
					System.out.println("");
				}
			}else {
				System.out.println("Invalid coordinates. Enter coordinates from 0 - 2. Please try again");
				continue;
			}
			
			//Increment counters
			count++;
			countEven++;
		}while(count < (board.length) * board[0].length);
		
		System.out.println("Exiting program...");
		reader.close();
	}

}
