/**
 * @author Jacob Nartey
 * 3. Tic Tac Toe
 */

import java.util.Scanner;

public class TicTacToe {
	public static void main(String[] args) {
		//Instantiating Scanner class to read input
		Scanner reader = new Scanner(System.in);
		
		//Creating 2D array of size 4
		char[][] board = new char[3][3];
		char[] blankLine = {' ',' ',' '};		
		
		//Fill array with default values
		for(int i = 0; i < board.length; i++) {
			board[i] = blankLine.clone();
		}
		
		//Counter to check if the user is even or odd
		int countEven = 1;
		
		//Initializing user inputs  
		int user1_x = 0;
		int user1_y = 0;
		int user2_x = 0;
		int user2_y = 0;
		int current_x = 0;
		int current_y = 0;
		char symbol = ' ';
		System.out.println("What row(x) and column(y) would you like to place your mark?");
		
		//Increment counter to serve as a terminating condition if end of array;
		int count = 0;
		
		do {
			if(countEven % 2 == 0) {
				//Prompting User 2 to enter coordinates
				System.out.println("Your turn user 2:");
				System.out.println("Enter row(x)");
				System.out.print("> ");
				user2_x = reader.nextInt();
				System.out.println("Enter column(y)");
				System.out.print("> ");
				user2_y = reader.nextInt();
				
				current_x = user2_x;
				current_y = user2_y;
				symbol = 'Y';
				
			}else {
				//Prompting User 2 to enter coordinates
				System.out.println("Your turn user 1:");
				System.out.println("Enter row(x)");
				System.out.print("> ");
				user1_x = reader.nextInt();
				System.out.println("Enter column(y)");
				System.out.print("> ");
				user1_y = reader.nextInt();
				
				current_x = user1_x;
				current_y = user1_y;
				symbol = 'X';
			}
			
			//System.out.println("count: " + count);
			
			outer:for(int i = 0; i < board.length; i++) {//Rows
				inner:for(int j = 0; j < board[i].length; j++) {//Columns
					
					//Check if that coordinate has been taken
					if(board[i][j] == ' ') {
						board[current_x][current_y] = symbol;
					}else {
						if(board[i][j] == board[current_x][current_y] && board[i][j] == symbol) {
							System.out.println("This coordinate is taken by you, try again!");
						}else {
							if(symbol == 'Y') {
								System.out.println("This coordinate is taken by User 2, try again!");
							}else if(symbol == 'X') {
								System.out.println("This coordinate is taken by User 1, try again!");
							}
						}
						
						countEven--;
						break outer;
					}
				}
			}
			
			for(char[] row : board) {//Row
				for(char column : row) {//Columns
					System.out.print(column + " ");
				}
				System.out.println("\n");
			}
			
			count++;
			countEven++;
			//continue;
		}while(count < (board.length) * board[0].length);
		
		

	}

}
