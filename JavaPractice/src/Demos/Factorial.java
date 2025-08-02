package Demos;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {

        Scanner src = new Scanner(System.in);
        System.out.print("Enter a number to print factorial: ");
        int num = src.nextInt();
        
        long fact = 1;
        
        for(int i=2;i<=num;i++) {
        	
        	fact *= i;
        }
        
        System.out.print("Factorial of "+num+" is: "+fact);

	}

}
