package Collecttions;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
		
		TreeMap<Integer, String> employees = new TreeMap<>();
		
		// Add entries (sorted by key automatically)
        employees.put(103, "Anjali");
        employees.put(101, "Ramesh");
        employees.put(105, "Sita");
        employees.put(102, "John");
        
        // Duplicate key overwrites the value
        employees.put(101, "Raj"); // Ramesh → Raj
        
        // Retrieve a value by key
        System.out.println("Employee with ID 102: " + employees.get(102));
        
        // first and last entry
        
        System.out.println("Lowest Id Entry: "+employees.firstEntry());
        System.out.println("Highest Id Entry: "+employees.lastEntry());
        
        // keys less than 104
        
        System.out.println("Employees with Id < 104: "+employees.headMap(104));
        
        // keys greater than or equal to 103
        
        System.out.println("Employees with ID >= 103: " +employees.tailMap(104));
        
        // Print all entries in sorted order
        System.out.println("All Employees (sorted by ID):");
        for (Map.Entry<Integer, String> entry : employees.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }

        // Check presence
        System.out.println("Is ID 105 present? " + employees.containsKey(105));
        System.out.println("Is name 'Sita' present? " + employees.containsValue("Sita"));

        // Size and clearing
        System.out.println("Total employees: " + employees.size());
        employees.clear();
        System.out.println("After clearing: " + employees);


	}

}
