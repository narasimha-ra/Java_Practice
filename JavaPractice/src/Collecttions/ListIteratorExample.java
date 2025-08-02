package Collecttions;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorExample {

	public static void main(String[] args) {

		List<String> cities = new ArrayList<>();
		cities.add("Delhi");
		cities.add("Mumbai");
		cities.add("Chennai");

		ListIterator<String> lit = cities.listIterator();

		System.out.println("Forward iteration:");

		while (lit.hasNext()) {
			System.out.println(lit.next());
		}

		System.out.println("Backward iteration:");

		while (lit.hasPrevious()) {
			System.out.println(lit.previous());
		}

	}

}
