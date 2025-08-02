package Demos;

public class StringMethods {

	public static void main(String[] args) {
		String str = " Welcome to Automation ";
		
		System.out.println(str.length());
		System.out.println(str.charAt(6));
		System.out.println(str.equals("Automation"));
		System.out.println(str.equalsIgnoreCase("welcome"));
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
		System.out.println(str.substring(5));
		System.out.println(str.substring(5,8));
		System.out.println(str.contains("to"));
		System.out.println(str.startsWith("Welcome"));
		System.out.println(str.endsWith("mation"));
		System.out.println(str.indexOf("m"));
		System.out.println(str.lastIndexOf("t"));
		System.out.println(str.trim());
		System.out.println(str.replace('W', 'F'));
		System.out.println(str.split(" "));
		System.out.println(str.concat("team"));
		System.out.println(str.compareTo("team"));
		
		String s1 = "Java";
		String s2 = new String("Java");
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));


	}

}
