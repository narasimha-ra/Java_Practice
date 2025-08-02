package Demos;

public class SwappingofTwoNumbers {

	public static void main(String[] args) {
		
		//with third variable
		
		int a = 10, b = 20;
		System.out.println("Before Swapping: "+"a = "+a+" "+"b = "+b);
//		int temp = a;
//		a = b;
//		b = temp;
//		System.out.println("After Swapping: "+"a = "+a+" "+"b = "+b);
		
		//without third variable
		
		a = a + b; //a = 30
		b = a - b; //b = 10
		a = a - b; //a = 20
		System.out.println("After Swapping without third variable: "+"a = "+a+" "+"b = "+b);
		
		
	}

}
