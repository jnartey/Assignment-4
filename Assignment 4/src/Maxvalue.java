/**
 * @author Jacob Nartey
 * 2D Arrays Exercises
 * 1. Max Value
 */
public class Maxvalue {

	public static void main(String[] args) {
		
		int maxPos = 0;
		int rowPos = 0;
		//Creating an array of data type integer of size rows 3 and columns 3
		//Filling array with data
		int[][] numbers = {
			{2, 3, 3},
			{8, 14, 6},
			{17, 7, 0}
		};
		
		for(int i = 0; i < numbers.length; i++) {//Rows
			for(int j = 0; j < numbers[i].length/*Get length of row*/; j++) {//Columns
				if(numbers[i][j] > numbers[rowPos][maxPos]) {
					maxPos = j;
					rowPos = i;
				}
			}
		}
		
		System.out.println("Maximum value: " + numbers[rowPos][maxPos]);
	}

}
