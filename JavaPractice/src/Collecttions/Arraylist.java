package Collecttions;

import java.util.ArrayList;

public class Arraylist {

	public static void main(String[] args) {

		ArrayList<String> values = new ArrayList<>();
		values.add("Banana"); // add method
		values.add("Apple");
		values.add("Papaya");
		values.add(3, "orange"); // add meethod- indexing

		System.out.println(values.get(2)); // get method

		values.set(3, "lemon"); // replace methd - replace value at given index with given
								// number-set(index,value)

		values.remove(0); // remove value given index
		values.remove("Papaya"); // remove value provided

		System.out.println(values.size()); // Get number of elements

		System.out.println(values.contains("Banana")); // Check if value exists

		System.out.println(values.isEmpty()); // Check if list is empty

		System.out.println(values.indexOf("Apple")); // Get index of first occurrence

		System.out.println(values.lastIndexOf("Apple")); // Get index of last occurrence
		
		values.clear(); //Remove all elements

	}

}
