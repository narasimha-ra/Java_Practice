package Demos;

public class ArrayObjects {

	public String name;
	public int age;

	public ArrayObjects(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void display() {

		System.out.println(name + " - " + age);
	}

	public static void main(String[] args) {

		ArrayObjects[] ab = new ArrayObjects[3];

		ab[0] = new ArrayObjects("Alice", 20);
		ab[1] = new ArrayObjects("Bob", 22);
		ab[2] = new ArrayObjects("Charlie", 19);

		for (int i = 0; i < ab.length; i++) {
			ab[i].display();
		}

	}

}
