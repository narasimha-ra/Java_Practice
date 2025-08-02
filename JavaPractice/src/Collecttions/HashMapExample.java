package Collecttions;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {

		HashMap<Integer, String> emp = new HashMap<>();

		// adding entries into the map

		emp.put(101, "Alice");
		emp.put(102, "Bob");
		emp.put(103, "Charlie");
		emp.put(104, "David");

		// add duplicate key - overites value

		emp.put(103, "Chris"); // charlie replaced with chris

		// retrieve a value by key

		System.out.println("Name of the emp with ID 103: " + emp.get(103));

		// check if a key or value exists

		System.out.println("Does ID 105 Exists? - " + emp.containsKey(105));
		System.out.println("Is there an employee named Bob? - " + emp.containsValue("Bob"));

		// remove a key
		emp.remove(103);

		// update a value

		emp.put(102, "Narasimha"); // Bob replaced with narasimha

		// Get keys and values separately

		System.out.println("All Employee IDs: " + emp.keySet());
		System.out.println("All Employee Names: " + emp.values());

		// check if map is empty
		System.out.println("Is map empty? - " + emp.isEmpty());

		// print all entries

		System.out.println("Employees List:");

		for (Map.Entry<Integer, String> entry : emp.entrySet()) {

			System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());

		}

		// clear all entries
		emp.clear();

		System.out.println("After clearing: " + emp);

	}

}
