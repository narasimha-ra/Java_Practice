package Collecttions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {

	public static void main(String[] args) {
		
		List<String> names = new ArrayList<>();
		
		names.add("Ravi");
		names.add("Sneha");
		names.add("Kiran");
		
		Iterator<String> it = names.iterator();
		
		System.out.println("Elements before removing");
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		while(it.hasNext()) {
			it.remove();
		}
	//after removal
		System.out.println("Elements after removing");
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		

	}

}
