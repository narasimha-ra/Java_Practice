package Demos;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		
		//Palindrome - A palindrome number is a number that looks the same when read forwards and backwards
		// 123431 
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		
		int original = num;
		int reverse = 0;

		System.out.println("Size of the integer is: " + String.valueOf(original).length());

		while (num!=0) {
			int temp = (num % 10);  // gives last digit
			reverse = (reverse * 10) + temp; // biuld reverse number
			num = (num / 10); // remove last digit

		}
		if (reverse == original) {
			System.out.println("Given number is palindrome");

		} else {
			System.out.println("Given number is not palindrome");
		}

	}

}
