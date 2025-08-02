package Collecttions;

import java.util.Hashtable;
import java.util.Map;

public class HashTableExample {

	public static void main(String[] args) {
		
		Hashtable<Integer, String> students = new Hashtable<>();
		
		// Add entries
        students.put(101, "Ravi");
        students.put(102, "Sneha");
        students.put(103, "Karan");
        students.put(104, "Meena");

        // Duplicate key replaces value
        students.put(102, "Neha"); // Sneha -> Neha

        // Get value by key
        System.out.println("Student with ID 103: " + students.get(103));

        // Check presence
        System.out.println("Contains key 104? " + students.containsKey(104));
        System.out.println("Contains value 'Ravi'? " + students.containsValue("Ravi"));

        // Size
        System.out.println("Total students: " + students.size());

        // Print all entries
        System.out.println("All students:");
        for (Map.Entry<Integer, String> entry : students.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }

        // Remove entry
        students.remove(101);
        System.out.println("After removing ID 101: " + students);

        // Clear all entries
        students.clear();
        System.out.println("After clearing: " + students);

	}

}
