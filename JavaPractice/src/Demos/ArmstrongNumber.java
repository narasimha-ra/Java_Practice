package Demos;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		
		//Armstrong number - sum of cubs of the digits is equal to same number
		// 153 - 1^3 + 5^3 + 3^3 = 153
		
		Scanner sr = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sr.nextInt();
		
		int armNumber = num; // 153
		int result = 0;
		
		int size = String.valueOf(num).length();
		System.out.println("Number of Digits: "+size);
		
		while(num!=0) {
			 int temp = (num%10);
			 result = (int) (result + Math.pow(temp,size));
			 
			 /*Manual power calculation
            int power = 1;
            for (int i = 1; i <= size; i++) {
                power *= digit;
            }

            result += power;
			  */
			 num = num/10;
			
		}
		
		if (armNumber == result) {
			System.out.println("Given number is Armstrong Number");

		} else {
			System.out.println(result);
			System.out.println("Given number is not Armstrong Number");
		}
		

	}

}
