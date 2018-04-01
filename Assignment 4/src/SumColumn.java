/**
 * @author Jacob Nartey
 * 2. Sum of a column
 */

import java.util.Scanner;

public class SumColumn {

	public static void main(String[] args) {
		//Creating an array of data type integer of size rows 3 and columns 3
		//Filling array with data
		int[][] numbers = {
			{2, 3, 3},
			{8, 14, 6},
			{17, 7, 0}
		};
		
		//Instantiating Scanner class to read input
		Scanner reader = new Scanner(System.in);
		
		//Print array
		System.out.println("Array of random numbers\n"
				+ "=============");
		for(int[] row : numbers) {//Row
			for(int column : row) {//Columns
				System.out.printf("%4s",column + " ");
			}
			
			System.out.println("");
		}
		
		System.out.println("");
		
		int sum = 0;
		int keepCol = 0;
		do {
			//Prompt user to enter column they would like to get sum of
			System.out.println("Which column they would like to get the sum of?");
			System.out.print("> ");
			int col = reader.nextInt();
			keepCol = col;
			
			if(col >= 0 && col < numbers.length) {
				for(int i = 0; i < numbers.length; i++) {//Rows
					for(int j = 0; j < numbers[i].length/*Get length of row*/; j++) {//Columns
						if(j == col) {
							sum += numbers[i][j];
							System.out.println("Row " + i + " column " + col + " value " + numbers[i][j]);
						}
					}
				}
			}else {
				System.out.println("Invalid column " + col);
				continue;
			}
			
		}while(sum == 0);
		
		System.out.println("Sum of column " + keepCol + " is " + sum);
		reader.close();
	}

}
