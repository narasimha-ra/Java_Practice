package Collecttions;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {

	public static void main(String[] args) {
	
		LinkedHashMap<Integer, String> students = new LinkedHashMap<>();
		
		// Add entries
        students.put(201, "Arjun");
        students.put(202, "Bhavya");
        students.put(203, "Chetan");
        students.put(204, "Divya");

        // Duplicate key overwrites the value
        students.put(203, "Chaitanya"); // Chetan → Chaitanya

        // Retrieve a value by key
        System.out.println("Student with roll number 202: " + students.get(202));

        // Check if a key or value exists
        System.out.println("Is roll number 205 present? " + students.containsKey(205));
        System.out.println("Is student 'Divya' present? " + students.containsValue("Divya"));

        // Remove a key-value pair
        students.remove(204);

        // Update a value
        students.put(202, "Bhavna");

        // Print all entries in insertion order
        System.out.println("Students List:");
        for (Map.Entry<Integer, String> entry : students.entrySet()) {
            System.out.println("Roll No: " + entry.getKey() + ", Name: " + entry.getValue());
        }

        // Keys and values separately
        System.out.println("All Roll Numbers: " + students.keySet());
        System.out.println("All Student Names: " + students.values());

        // Check size and empty status
        System.out.println("Total Students: " + students.size());
        System.out.println("Is list empty? " + students.isEmpty());

        // Clear all entries
        students.clear();
        System.out.println("After clearing: " + students);

	}

}
