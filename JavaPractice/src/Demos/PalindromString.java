package Demos;

import java.util.Scanner;

public class PalindromString {

	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str = src.nextLine();
		
		String originalString = str;
		String result="";
		
		for(int i=str.length()-1;i>=0;i--) {
			result +=str.charAt(i);
		}
		if(result.equals(originalString)) {
			System.out.print(originalString+ " is palindrome string");
		}
		else {
			System.out.print(originalString+ " is not palindrome string");
		}
		
	}

}
