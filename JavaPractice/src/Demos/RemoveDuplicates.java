package Demos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {

		// approach - 1
		
		System.out.println("Approach 1 to remove duplicates:");
		int[] numbers = { 3, 5, 6, 3, 2, 1, 2 };

		int[] unique = new int[numbers.length];

		int uniqueCount = 0;

		for (int i = 0; i < numbers.length; i++) {

			boolean isDuplicate = false;

			for (int j = 0; j < uniqueCount; j++) {

				if (numbers[i] == unique[j]) {
					isDuplicate = true;
					break;
				}

			}

			if (!isDuplicate) {
				unique[uniqueCount] = numbers[i];
				uniqueCount++;

			}

		}

		System.out.println("Aftre removing the duplicates from the array:");

		for (int i = 0; i < uniqueCount; i++) {
			System.out.print(unique[i] + " ");
		}
		
		// approach - 2
		
		System.out.println();
		System.out.println("Approach 2 to remove duplicates:");
		
		
		Integer[] input = {4,5,3,4,3,6,5};

		ArrayList<Integer> originalList = new ArrayList<>(Arrays.asList(input)); // convert array into arraylist
		ArrayList<Integer> uniqueList = new ArrayList<>();

		for (Integer number : originalList) {

			if (!uniqueList.contains(number)) {
				uniqueList.add(number);
			}
		}
		
		System.out.println("Original list: " + originalList);
		System.out.println("List After Removing Duplicates: " + uniqueList);
		
		
		
		// approach - 3
		
		System.out.println("Approach 3 to remove duplicates:");
		
		Integer[] inputData = {7,8,5,7,9,8};
		Set<Integer> uniqueSet = new HashSet<>(Arrays.asList(inputData));
		
		
		System.out.println("Original list before hashset: " + Arrays.toString(inputData));
		System.out.println("List After Removing Duplicates: " + uniqueSet);
		

	}

}
