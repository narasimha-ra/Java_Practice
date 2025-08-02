package OOPs_Conceepts;

//Abstracction through interface

interface vehicle{
	void start();
}
public class Car implements vehicle {
	public void start() {
        System.out.println("Car starts with key");
    }
	
	public static void main(String[] args) {
		Car obj = new Car();
		obj.start();
	}
}
