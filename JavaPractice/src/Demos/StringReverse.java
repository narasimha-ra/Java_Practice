package Demos;

public class StringReverse {

	public static void main(String[] args) {
		
		//reverse string of a word
//		String message = "Automation";
//		String result = "";
//		System.out.println("Length of the String is: "+message.length());
//		
////		String reversed = new StringBuilder(message).reverse().toString();
//		for(int i=message.length()-1;i>=0;i--) { 
//			result = result + message.charAt(i);
//		    
//		}
//		
//		System.out.println("Reverse of the String is: "+result);
//		
		//Reverse string of a sentence
		
//		String message1 = "Welcome to the new World";
//		String result1 = "";
//		
//		String[] words = message1.split(" ");
//		System.out.println(words.length);
//		
//		for(int i=words.length-1;i>=0;i--) {
//			result1 = result1+words[i]+" ";
//		}	
//		System.out.println("Reverse of the String is: "+result1);
//		
//	}
	
	String message = "I am a automation tester";  //emocleW ot eht wen dlroW
	String result = "";
	String temp = "";
	char letter;
	String[] words = message.split(" ");
	System.out.println(words.length);
	
	for(int i=0;i<words.length;i++) {
		temp = words[i]+" ";
		
		System.out.println(temp);
		
		for(int j=temp.length()-1;j>=0;j--) {
			letter = temp.charAt(j);
			result = result+letter;
		}
	}	
	System.out.println("Reverse of the String is: "+result);
	
}

}
