package Demos;

public class Transpose {

	public static void main(String[] args) {

		int[][] numbers = { { 9, 8, 7 }, { 6, 5, 4 }, { 3, 2, 1 } };
		int rows = numbers.length;
		int cols = numbers[0].length;

		int[][] transpose = new int[cols][rows];

		// Step 1: Compute transpose
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				transpose[j][i] = numbers[i][j];
			}
		}

		// Step 2: Print transpose
		System.out.println("Transpose of matrix is:");
		for (int j = 0; j < cols; j++) {
			for (int i = 0; i < rows; i++) {
				System.out.print(transpose[j][i] + " ");
			}
			System.out.println();
		}
	}
}
