package Demos;

public class SecondLargestNumber {

	public static void main(String[] args) {

         int[] numbers = {14,6,8,56};
         
         int secondLargest = Integer.MIN_VALUE;
         int largest = Integer.MIN_VALUE;
          
     //    System.out.println(secondLargest+" "+largest);
         
         for(int i=0;i<numbers.length;i++) {
        	if(numbers[i]>largest) {
        		secondLargest = largest;
        		largest = numbers[i];
        	}
        	else if(numbers[i]>secondLargest && numbers[i]!=largest) {
        		secondLargest = numbers[i];
        	}
         }
         
      
         System.out.println("Second Largest number is: "+secondLargest);

	}

}
