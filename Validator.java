package studentInfo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Validator {

	public static int getIntInRange(Scanner scnr, String prompt) {
		System.out.println(prompt);
		int userInput;
		boolean Valid;

		do {
			userInput = getInt(scnr, " ");
			if ((userInput > 1) && (userInput < 20)) {
				Valid = true;
				// System.out.println("Valid number");

			} else {
				Valid = false;
				System.out.println("That student does not exist. Please enter a number from 1-19");
				// System.out.println("Enter a whole number, using digits.");
			}

		} while (Valid == false);

		return userInput;

	}

	public static int getInt(Scanner scnr, String prompt) {
		System.out.println(prompt);

		try {
			return scnr.nextInt();
		} catch (InputMismatchException exception) {
			System.out.println("Enter a whole number, using digits.");

			scnr.nextLine();
			return getInt(scnr, prompt);

		}

	}

	public static double getDouble(Scanner scnr, String prompt) {
		boolean isValid = false;

		do {
			System.out.println(prompt);
			isValid = scnr.hasNextDouble();

			if (!isValid) {
				scnr.nextLine();
				System.out.println("Enter a whole number, using digits.");
			}

		} while (!isValid);

		return scnr.nextDouble();
	}

	public static String getString(Scanner scnr, String prompt) {
		boolean isValid = false;

		do {
			String userInput = prompt;
			if (userInput.matches("[a-zA-Z]")) {
				isValid = true;
				System.out.print(prompt);
				return userInput;

			} else {

				isValid = false;
			}
		} while (isValid == false);

//		System.out.print(prompt);
		return getString(scnr, prompt);
	}

}
