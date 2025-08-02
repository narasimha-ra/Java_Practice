package OOPs_Conceepts;


//this is the example of inheritance
//Runtime Polymorphism (Method Overriding)

class Parent {
	public void display() {
		System.out.println("This is Parent class");
	}
}

public class Child extends Parent { 
	@Override
	public void display() {
		super.display();
		System.out.println("This is child class");
	}

	public static void main(String[] args) {
		Parent obj = new Child();
		obj.display();
	}
}
