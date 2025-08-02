package OOPs_Conceepts;

//Abstract Class - example

abstract class Animal {
	
	abstract void sound();  // abstract method
	
	void eat() {            // non-abstract method
		System.out.println("Animal eats food");
	}
	
}
public class Dog extends Animal{
   @Override
	void sound() {
		System.out.println("Dog barks");
	}
	public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();  // Dog barks
        d.eat();    // Animal eats food
    }

}
