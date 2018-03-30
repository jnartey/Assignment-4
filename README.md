# Assignment-4
2D Arrays Exercises

1. Max Value

Create a 2D integer array with 3 rows and 3 columns.
Fill the array with data.

Print out the maximum value in the array.

2. Sum of a column

Create a 2D integer array with 3 rows and 3 columns.
Fill the array with random data.

Ask the user which column they would like to get the sum of.
Get the total of all values in that column.

For instance, if the user chose column 1:
array[0][1] + array[1][1] + array[2][1]

3. Tic Tac Toe

Create a 2D character array with 3 rows and 3 columns.
Start by filling the array with spaces.

Create a loop that will do the following:
Ask the user for what row and column they would like to place their mark.
If the spot is currently filled with a space, place their mark.
If it's currently an odd-numbered turn, the mark is X
If it's currently an even-numbered turn, the mark is Y
At the end of their turn, print the current board

Continue until all spaces are filled.

4. Movement on a 2D Plane

Create a 2D character array with 5 rows and 5 columns
To start, fill every position with an O.
Then, fill the [0][0] position with an X.
This X represents the user's "avatar".

Create a loop which does the following:
-Starts by printing the array
-Asks the user for what direction they would like to go
-Waits for user input
-Moves the avatar in that direction, if it exists (ie: up=row-1, right=column+1)
-If it does not exist, tell the user and exit the program
-Fill the avatar's new position with an X
-Fill the avatar's old position with an O

Example Output:

Current Map:
=========
X O O O O
O O O O O
O O O O O
O O O O O
O O O O O
=========
Which direction would you like to move?
>down

Current Map:
=========
O O O O O
X O O O O
O O O O O
O O O O O
O O O O O
=========
Which direction would you like to move?
>right

Current Map:
=========
O O O O O
O X O O O
O O O O O
O O O O O
O O O O O
=========
Which direction would you like to move?
>up

Current Map:
=========
O X O O O
O O O O O
O O O O O
O O O O O
O O O O O
=========
Which direction would you like to move?
>up

Error: You cannot move there from your current position
Exiting program...
