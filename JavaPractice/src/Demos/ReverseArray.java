package Demos;

import java.util.ArrayList;

public class ReverseArray {

	public static void main(String[] args) {

		int[] numbers = { 12, 6, 8, 9, 34 };

//		ArrayList<Integer> reverse = new ArrayList<Integer>();
//
//		System.out.println("Array before reverse is: ");
//		for (int num : numbers) {
//		    System.out.print(num + " ");
//		}
//
//		for (int i = numbers.length - 1; i >= 0; i--) {
//
//			reverse.add(numbers[i]);
//
//		}
//		System.out.println();
//		System.out.println("Array After reverse is: ");
//
//		for (int k = 0; k < reverse.size(); k++) {
//
//			System.out.print(reverse.get(k)+ " ");
//		}

		// another approach - simple one

		int[] reverse = new int[numbers.length];

		for (int i = 0; i < numbers.length; i++) {

			reverse[i] = numbers[(numbers.length - 1) - i];
		}

		System.out.println("Array after reverse is: ");
		for (int num : reverse) {
			System.out.print(num + " ");
		}
	}

}
