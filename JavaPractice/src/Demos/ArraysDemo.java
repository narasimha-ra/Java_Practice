package Demos;

import java.util.Scanner;

public class ArraysDemo {

	public static void main(String[] args) {
		
	 int[] abc; // declaration - will be store in stack memory
	 abc = new int[4]; // initialisation - will be stored in heap memory
	 
	 int[] cdf = {2,3,4,5}; // declaration and initialisation of 1D array-another way
	 
	 String[] str = new String[2];

      int[] num = new int[3];
      
      num[0] = 2;
      num[1] = 3;
      num[2] = 4;
     
//      for(int i=0;i<num.length;i++) {
//    	  
//    	  System.out.print(num[i]+ " ");
//      }
//      System.out.println();
//      
//      for(String arr: str) {
//    	  System.out.print(arr+" ");
//      }
//      
      // 2D - Array
      int[][] arr2D = new int[3][3];
      int[][] arr = {{2,3,4},{4,5},{1,2,3,4,5}};
     
      System.out.println("Enter elements to print: ");
      
         for(int i=0;i<arr.length;i++) {
    	  
    	  for(int j=0;j<arr[i].length;j++) {
    		  
    		  System.out.print(arr[i][j]+" ");
    	  }
    	  System.out.println();
      }

	}

}
