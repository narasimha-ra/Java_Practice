package Demos;

public class Matrix2DArray {

	public static void main(String[] args) {
		
		int[][] numbers = {{9,8,7},{6,5,4},{3,2,1}};
		
		
		System.out.println("Row-Wise Order: ");
		for(int i=0;i<numbers.length;i++) {
			for(int j=0;j<numbers[i].length;j++) {
				System.out.print(numbers[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("Column-Wise Order: ");
		for(int j=0;j<numbers[0].length;j++) {
			for(int i=0;i<numbers.length;i++) {
				System.out.print(numbers[i][j]+" ");
			}
			System.out.println();
		}
		

	}

}
