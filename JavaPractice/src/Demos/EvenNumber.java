package Demos;

import java.util.Scanner;

public class EvenNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a starting number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter an ending number: ");
        int num2 = sc.nextInt();

        System.out.print("Even numbers between " + num1 + " and " + num2 + ": ");
        for (int i = num1 + 1; i < num2; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
