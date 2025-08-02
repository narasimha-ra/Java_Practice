package Collecttions;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		
		//Creating linkedlist of strings
		LinkedList<String> fruits = new LinkedList<String>();
		
		//adding elements
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Mango");
		fruits.add("Orange");
		fruits.add("Papaya");
		fruits.add("WaterApple");
		fruits.add(2, "Pineapple"); //add at specific index
		fruits.addFirst("Guava"); // add at first
		fruits.addLast("Lemon"); // add at last
		
		System.out.println("After Adding fruits: "+fruits);
		
		//accessing elements
		
		System.out.println("First Element: "+fruits.getFirst());
		System.out.println("Last Element: "+fruits.getLast());
		System.out.println("Element at specific index 3: "+fruits.get(3));
		
		//Modifying elements
		
		fruits.set(3, "pomegranate");
		System.out.println("After Modifying the element at index 3: "+fruits.get(3));
		
		//Removing elements
		
		fruits.remove("Papaya");
		fruits.remove(4);
		fruits.removeFirst();
		fruits.removeLast();
		
		System.out.println("After Removing some of the elements: "+fruits);
		
		//checking elements
		
		System.out.println("Contains Mango? - "+fruits.contains("mango"));
		System.out.println("Size of the list: "+fruits.size());
		System.out.println("Is Empty? - "+fruits.isEmpty());
		
		//Iterating using for loop
		System.out.println("using for loop");
		for(String fruit:  fruits) {
			System.out.println(fruit);
			
		}
		
		//Iterating using iterator
		
		System.out.println("Using Iterator");
		Iterator<String> it = fruits.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//clearing
		fruits.clear();
		System.out.println("After clearing: "+fruits);

	}

}
