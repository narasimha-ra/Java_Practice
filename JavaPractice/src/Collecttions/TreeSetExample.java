package Collecttions;

import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		//Creating a tree set to store city names
		TreeSet<String> cities = new TreeSet<>();
		
		// add cities
		cities.add("Chennai");
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Bangalore");
        cities.add("Hyderabad");
        
        // add duplicate - not allowed
        cities.add("Chennai");
        
        // checking cities in the tree set
        
        System.out.println("Is Hyderabad present in the list? - "+cities.contains("Hyderabad"));
        System.out.println("Is cities list empty? - "+cities.isEmpty());
        System.out.println("Total number of cities in the list: "+cities.size());
        
        // print cities in sorted order
        System.out.println("Sorted Cities:");
        for(String city: cities) {
        	System.out.println(city);
        }
        
        // remove cities
        
        cities.remove("Bangalore");
        
        System.out.println("After clearing Bangalore:");
        System.out.println(cities);
     
        //clear list
        cities.clear();
        
        System.out.println("After clearing cities:");
        System.out.println(cities);
        

	}

}
