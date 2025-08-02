package Collecttions;

import java.util.HashSet;

public class HashSetExample {

	public static void main(String[] args) {

		// Creating a hash set to store employee names
		HashSet<String> employee = new HashSet<String>();

		// adding employees

		employee.add("Narasimha");
		employee.add("Srinivas");
		employee.add("Lakshmi");
		employee.add("Mounika");
		employee.add("Vishnu");
		employee.add("Lokesh");
		employee.add("Ramachandramouli");
		employee.add("Ramakrisha");

		// add duplicate name - will be ignored
		employee.add("Srinivas");

		// add null - allowed once
		employee.add(null);

		// checking employees

		System.out.println("Total Employees count: " + employee.size());
		System.out.println("Is Narasimha in the company? - " + employee.contains("Narasimha"));
		System.out.println("Is Mounika in the company? - " + employee.contains("Mounika"));
		System.out.println("Is Eomployees list empty? - " + employee.isEmpty());

		// removing elements

		employee.remove("Srinivas");

		// Iterate through employee names
		System.out.println("List of employees:");
		for (String emp : employee) {
			System.out.println(emp);
		}

		// cleearing the set

		employee.clear();

		System.out.println("Is Employee list is empty? - " + employee.isEmpty());
	}

}
