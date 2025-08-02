package Demos;

public class MinMaxNumberInArray {

	public static void main(String[] args) {

         int[] numbers = {14,6,8,56};
         
         int min = numbers[0];
         int max = numbers[0];
         
         for(int i=1;i<numbers.length;i++) {
        	 if(numbers[i]<min) {
        		 min = numbers[i];
        	 }
        	 if(numbers[i]>max) {
        		 max = numbers[i];
        	 }
         }
         
         System.out.println("Smallest number is: "+min);
         System.out.println("Largest number is: "+max);

	}

}
