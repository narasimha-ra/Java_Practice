package Demos;

public class RepeatedArray {

	public static void main(String[] args) {

		int[] numbers = { 2, 4, 7, 4, 2, 3, 4, 5, 4, 7 };

		int[] repeated = new int[numbers.length];

		int index = 0;

		for (int i = 0; i < numbers.length; i++) {

			boolean alreadyChecked = false;
			
			//to check alreadychecked or not

			for (int k = 0; k < i; k++) {
				if (numbers[i] == numbers[k]) {
					alreadyChecked = true;
					break;
				}
			}
			if (alreadyChecked) {
				continue;
			}

			int counter = 1;
    
			//to count occurrences
			for (int j = i + 1; j < numbers.length; j++) {
				if (numbers[j] == numbers[i]) {
					counter++;
				}

			}

			if (counter >= 2) {
				repeated[index++] = numbers[i];
			}

		}

		System.out.println("Repeated atleast twice elements are: ");

		for (int i = 0; i < index; i++) {
            System.out.print(repeated[i] + " ");
        }
	}

}
