/**
 * @author Jacob Nartey
 * 4. Movement on a 2D Plane
 */

import java.util.Scanner;

public class Movement2DPlane {
	
	public static void main(String[] args) {
		//Instantiating Scanner class to read input
		Scanner input = new Scanner(System.in);
		
		//Creating 2D array of size 5
		char[][] avatar = new char[5][5];
		char[] blankLine = {'O','O','O','O','O'};
		
		//Direction input variable
		String moveDirection = "";
		boolean move = true;
		char placeholder = ' ';
				
		//Fill array with default values
		for(int i = 0; i < avatar.length; i++) {
			avatar[i] = blankLine.clone();
		}
		
		System.out.println("Type 'down' or 'right' or 'up' or 'left' to move 'X'\n");
		
		//Filling the [0][0] position with an X.
		avatar[0][0] = 'X';
		
		System.out.println(
				"Current Map:\n"
				+ "=========");
		//Print avatar
		for(char[] row : avatar) {//Row
			for(char column : row) {//Columns
				System.out.print(column + " ");
			}
			
			System.out.println("");
		}
		
		System.out.println("=========");
				
		do {
			//Prompting User 2 to enter coordinates
			System.out.println("Which direction would you like to move?");
			System.out.print("> ");
			moveDirection = input.next();
			System.out.println("");
			
			//Switch case condition
			switch(moveDirection) {
				case "down":
					outer:for(int i = 0; i < avatar.length; i++) {//Rows
						inner:for(int j = 0; j < avatar[i].length; j++) {//Columns
							if(avatar[i][j] == 'X') {
								//checking if you can move
								if(i + 1 == avatar.length) {
									System.out.println("Error: You cannot move there from your current position");
									move = false;
									break;
								}else {
									//Store 'X' into placeholder variable
									placeholder = avatar[i][j];
									
									//Increasing row position by 1 to move down
									avatar[i + 1][j] = placeholder;
									
									//Reseting current row to 'O'
									avatar[i][j] = 'O';
									
									//Break out of loop if done
									break outer;
								}
							}
						}
					}
					break;
				case "right":
					outer:for(int i = 0; i < avatar.length; i++) {//Rows
						inner:for(int j = 0; j < avatar[i].length; j++) {//Columns
							if(avatar[i][j] == 'X') {
								//checking if you can move
								if(j + 1 == avatar[i].length) {
									System.out.println("Error: You cannot move there from your current position");
									move = false;
									break;
								}else {
									//Store 'X' into placeholder variable
									placeholder = avatar[i][j];
									
									//Increasing column position by 1 to move right
									avatar[i][j + 1] = placeholder;
									
									//Reseting current row to 'O'
									avatar[i][j] = 'O';
									
									//Break out of loop if done
									break outer;
								}
							}
						}
					}
					break;
				case "up":
					outer:for(int i = 0; i < avatar.length; i++) {//Rows
						inner:for(int j = 0; j < avatar[i].length; j++) {//Columns
							if(avatar[i][j] == 'X') {
								
								//checking if you can move
								if(i - 1 < 0) {
									System.out.println("Error: You cannot move there from your current position");
									move = false;
									break;
								}else {
									//Store 'X' into placeholder variable
									placeholder = avatar[i][j];
									
									//Decreasing row position by 1 to move up
									avatar[i - 1][j] = placeholder;
									
									//Reseting current row to 'O'
									avatar[i][j] = 'O';
									
									//Break out of loop if done
									break outer;
								}
							}
						}
					}
					break;
				case "left":
					outer:for(int i = 0; i < avatar.length; i++) {//Rows
						inner:for(int j = 0; j < avatar[i].length; j++) {//Columns
							if(avatar[i][j] == 'X') {
								
								//checking if you can move
								if(j - 1 < 0) {
									System.out.println("Error: You cannot move there from your current position");
									move = false;
									break;
								}else {
									//Store 'X' into placeholder variable
									placeholder = avatar[i][j];
									
									//Decreasing column position by 1 to move left
									avatar[i][j - 1] = placeholder;
									
									//Reseting current row to 'O'
									avatar[i][j] = 'O';
									
									//Break out of loop if done
									break outer;
								}
							}
						}
					}
					break;
				default:
					move = false;
					break;
			}
			
			if(move != false) {
				System.out.println(
						"Current Map:\n"
						+ "=========");
				//Print avatar after each user input
				for(char[] row : avatar) {//Row
					for(char column : row) {//Columns
						System.out.print(column + " ");
					}
					
					System.out.println("");
				}
				
				System.out.println("=========");
			}
			
		}while(move == true);
		
		System.out.println("Exiting program...");
		input.close();
	}

}
