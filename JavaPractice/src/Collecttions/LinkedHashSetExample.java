package Collecttions;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {

	public static void main(String[] args) {
		// Creating a linked hash set to store vehicle numbers

		LinkedHashSet<String> vehicles = new LinkedHashSet<>();

		// add vehicle numbers

		vehicles.add("TN01AB1234");
		vehicles.add("AP31CD5678");
		vehicles.add("KA05EF9012");
		vehicles.add("MH12GH3456");
		vehicles.addFirst("AP35AB2771"); // adding at first
		vehicles.addLast("TN23AS3342"); // adding at last

		// add duplicate vehicle - will not be added

		vehicles.add("TN01AB1234");

		// accessing vehicles of the list

		System.out.println("First vehicle number: " + vehicles.getFirst());
		System.out.println("last vehicle number: " + vehicles.getLast());

		// checking vehicles

		System.out.println("Total number of vehicles: " + vehicles.size());
		System.out.println("Is MH12GH3456 registered? - " + vehicles.contains("MH12GH3456"));
		System.out.println("Is vehicles list empty? - " + vehicles.isEmpty());

		// Iterate through vehicle numbers - in insertion order

		System.out.println("Vehicles list - in order of entry");
		for (String vn : vehicles) {
			System.out.println(vn);
		}

		// remove vehicle

		vehicles.remove("MH12GH3456");
		vehicles.removeFirst();
		vehicles.removeLast();

		System.out.println("After removing: ");
		for (String vn : vehicles) {
			System.out.println(vn);
		}

		// clear list

		vehicles.clear();

		System.out.println("Is vehicle list empty after clear() - " + vehicles.isEmpty());

	}

}
