package OOPs_Conceepts;

//Compile-Time Polymorphism (Method Overloading)

public class polymorphism {
	
	public void add(int a, int b) {
		System.out.println("Sum is: " + (a + b));
	}
	
	public void add(double a, double b, double c) {
		System.out.println("Sum is: " + (a + b+c));
	}

	public static void main(String[] args) {
		
		polymorphism poly = new polymorphism();
		poly.add(4, 5);
		poly.add(3.45, 6.89, 7.09);
	}

}
