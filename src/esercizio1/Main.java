package esercizio1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int length = 5;
		System.out.println("Here is our array of randomly generated integers:");
		int[] array = getRandomIntArray(length);
		System.out.println(Arrays.toString(array));
		int[] newArray = addNumberInSelectedPosition(length, array);
		System.out.println(Arrays.toString(newArray));

	}

	static int[] getRandomIntArray(int length) {
		Random randomNumber = new Random();
		int[] randomIntArray = new int[length];
		for (int i = 0; i < randomIntArray.length; i++) {
			randomIntArray[i] = randomNumber.nextInt(10) + 1;
		}
		return randomIntArray;
	}

	static int[] addNumberInSelectedPosition(int length, int[] array) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a number you want to replace with existing ones:");
		int number = scanner.nextInt();
		System.out.println("The number you chose is the number " + number);
		System.out.println("In which position you want to insert the number you have chosen");
		int position = scanner.nextInt();
		int[] newRandomIntArray = new int[length];
		while (position != 0) {
			System.out.println("You have chosen the position number " + position);
			System.out.println("Loading.......");
			System.out.println("Here it is!!!");
			scanner.close();
			for (int i = 0; i < newRandomIntArray.length; i++) {
				if (i < position - 1)
					newRandomIntArray[i] = array[i];
				else if (i == position - 1)
					newRandomIntArray[i] = number;
				else
					newRandomIntArray[i] = array[i];
			}

		}
		return newRandomIntArray;
	}
}
