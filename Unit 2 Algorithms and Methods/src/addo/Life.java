package addo;

import java.util.Scanner;

/**
 * Allows user to play Conway's game of life
 * Life.java
 * @author Ahmed Addo
 * 4/28/17
 */
public class Life {

	public static void main(String[] args) {
		String nextDay;
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[20][20];
		System.out.println("Enter the amount of alive cells");
		int numAliveCells = sc.nextInt();
		int y;
		int x;
		System.out.println("Enter the coordinates of the alive cells");
		// assigns location of alive cells
		for (int i = 1; i <= numAliveCells; i++) {
			System.out.println("Enter x coordinate from (0-20)");
			x = sc.nextInt();
			System.out.println("Enter y coordinate from (0-20)");
			y = sc.nextInt();
			arr[y][x] = 1;
		}
		System.out.println("\n\nGeneration 1:\n");
		for (int row = 0; row < arr.length; row++) {
			for (int column = 0; column < arr[row].length; column++) {
				System.out.print(arr[row][column]);
			}
			System.out.println();
		}
		sc.nextLine();
		int generation = 1;
		do {
			generation++;
			int[][] newGrid = new int[20][20];

			for (int row = 0; row < arr.length; row++) {
				for (int column = 0; column < arr[row].length; column++) {
					//goes into isCellAlive method and checks neighbours
					//if the method is true, cells become 1 or stay alive
					//if false becomes dead or stays dead
					if (isCellAlive(arr, row, column)) {
						newGrid[row][column] = 1;
					} else {
						newGrid[row][column] = 0;
					}

				}
			}
			// draws the next generation
			arr = newGrid;
			System.out.println("\n\nGeneration: " + generation + "\n");
			for (int row = 0; row < arr.length; row++) {
				for (int column = 0; column < arr[row].length; column++) {
					System.out.print(arr[row][column]);
				}
				System.out.println();
			}
			// if user wants to continue to next day, goes to start of do/while loop
			System.out.println("Continue to to the next day? (Type 'yes' or 'no')");
			nextDay = sc.nextLine();
		} while (nextDay.equalsIgnoreCase("yes"));
	}

	/**
	 * Checks if the cell should be alive based on neighbours
	 * @param arr - the array which will be checked
	 * @param row - row of the array
	 * @param column - column of the array
	 * @return - true if appropriate amount of neighbours, false if not
	 */
	private static boolean isCellAlive(int[][] arr, int row, int column) {

		// cell is alive
		boolean aliveCell = arr[row][column] == 1;

		int numOfNeighbours = 0;

		// check one to the right of column
		if (arr[row].length > column + 1) {
			if (arr[row][column + 1] == 1) {
				numOfNeighbours++;
			}
		}
		// check one to the left of column
		if (arr[row].length > column - 1 && column - 1 >= 0) {
			if (arr[row][column - 1] == 1) {
				numOfNeighbours++;
			}
		}

		// check one above column
		if (arr.length > row - 1 && row - 1 >= 0) {
			if (arr[row - 1][column] == 1) {
				numOfNeighbours++;
			}
		}

		// check one below column
		if (arr.length > row + 1) {
			if (arr[row + 1][column] == 1) {
				numOfNeighbours++;
			}
		}

		// check one top left diagonal to column
		if (arr.length > row - 1 && arr[row].length > column - 1 && row - 1 >= 0 && column - 1 >= 0) {
			if (arr[row - 1][column - 1] == 1) {
				numOfNeighbours++;
			}
		}

		// check one top right diagonal to column
		if (arr.length > row - 1 && arr[row].length > column + 1 && row - 1 >= 0) {
			if (arr[row - 1][column + 1] == 1) {
				numOfNeighbours++;
			}
		}

		// check one bottom left diagonal to column
		if (arr.length > row + 1 && arr[row].length > column - 1 && column - 1 >= 0) {
			if (arr[row + 1][column - 1] == 1) {
				numOfNeighbours++;
			}
		}

		// check one bottom right diagonal to column
		if (arr.length > row + 1 && arr[row].length > column + 1) {
			if (arr[row + 1][column + 1] == 1) {
				numOfNeighbours++;
			}
		}

		// if the cell has 2 neighbours and its already alive returns true
		// if its not alive and it has 3 neighbours, returns true
		if ((numOfNeighbours == 2) && aliveCell) {
			return true;
		} else if (numOfNeighbours == 3) {
			return true;
		}
		return false;
	}

}