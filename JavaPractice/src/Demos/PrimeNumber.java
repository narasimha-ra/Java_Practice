package Demos;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {

		Scanner src = new Scanner(System.in);
		System.out.print("Enter a number to check: ");
		int num = src.nextInt();

		boolean isPrime = false;

		if (num <= 1) {

			isPrime = false;
		} else {

			for (int i = 2; i <= num; i++) {
				if (num % i == 0) {
					isPrime = false;
					break;
				} else {
					isPrime = true;
					break;
				}
			}
		}
		
		if(isPrime==true) {
			System.out.print("Given Number is prime");
		}
		else {
			System.out.print("Given Number is not prime");
		}

	}

}
