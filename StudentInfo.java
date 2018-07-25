package studentInfo;

import java.util.Scanner;

public class StudentInfo {

	public static void main(String[] args) {
		// Scanner
		Scanner scnr = new Scanner(System.in);

		// Class variables
		int userInput;
		boolean valid = false;
		String selectedStudent = null;
		String hometownOrFood = " ";
		String yesOrNo = " ";

		// Array of Students
		String[] studentNames = { "Amna", "Andrew", "Anesha", "Cameron", "Darby", "Edward", "Jasmine", "JoRanda",
				"Kris", "Lauren", "Sasi", "Virginia", "Yasmine", "Arif", "Kari", "Louis", "Sharde", "Shontinique",
				"Stan" };

		// Array of Students homeTowns
		String[] studentHometown = { "Rochester", "Ann Arbor", "Houston", "Los Angeles", "Ann Arbor", "Southfield",
				"Detroit", "redford", "ann Arbor", "Ann Arbor", "Chicago", "Las Vegas", "Dearborn", "Madison Heights",
				"Detroit", "Redford", "Detroit", "Plymouth", "Washington D.C" };

		// Array of Students favorite food
		String[] studentFavoriteFood = { "cheesecake", "chinese food", "McDonals", "coney dogs", "pizza", "apple pie",
				"oranges", "strawberries", "steak", "ice cream", "pancakes", "sushi", "pasta", "chicken", "soup",
				"buritto", "donuts", "tacos", "cheese" };

		// Program open
		System.out.println("Welcome to our Java class.");

		do {
			// Prompt user for information about a student

			userInput = Validator.getIntInRange(scnr,
					"Which student would you like to learn more about? (enter a number 1-19)");

			// Print out student number and name and prompt user for homeTown or favorite
			// food
			selectedStudent = studentNames[userInput - 1];
			// System.out.println(studentNames.length);
			System.out.println("Student: " + userInput + " is " + selectedStudent
					+ ". What would you like to know about " + selectedStudent + "? Enter homwtown or favorite food");

			// Get student response and validate the String
			hometownOrFood = Validator.getString(scnr, "Enter hometown or favorite food.");

			// System.out.println(hometownOrFood);

			// Print out student number and name and prompt user for homeTown or favorite
			// food

			// Conditional for homeTown or food
			if (hometownOrFood.toLowerCase().matches("hometown")) {

				System.out.println(selectedStudent + " is from " + studentHometown[userInput] + ". "
						+ "Would you like to know more? Enter yes or no. ");

				// Get yes or no response and validate the string
				yesOrNo = Validator.getString(scnr, "Enter yes or no");

				if (yesOrNo.toLowerCase().matches("yes")) {
					System.out
							.println(selectedStudent + "'s favorite food is " + studentFavoriteFood[userInput] + ". ");

					System.out.println("Would you like to learn about another student?");

					// Get yes or no response and validate the string
					yesOrNo = Validator.getString(scnr, "Enter yes or no");

					if (yesOrNo.toLowerCase().matches("yes")) {
						continue;
					} else {
						valid = false;
					}

				} else {
					valid = false;
				}

				valid = true;

			} else if (hometownOrFood.toLowerCase().matches("favoritefood")) {

				System.out.println(selectedStudent + "'s favorite food is " + studentFavoriteFood[userInput] + ". "
						+ "Would you like to know more? Enter yes or no. ");

				// Get yes or no response and validate the string
				yesOrNo = Validator.getString(scnr, "Enter yes or no");

				if (yesOrNo.toLowerCase().matches("yes")) {
					System.out.println(selectedStudent + " is from " + studentHometown[userInput] + ". ");

					System.out.println("Would you like to learn about another student? Enter yes or no");

					// Get yes or no response and validate the string
					yesOrNo = Validator.getString(scnr, "Enter yes or no");

					if (yesOrNo.toLowerCase().matches("yes")) {
						continue;
					} else {
						valid = false;
					}

				} else {
					valid = false;
				}
				valid = true;

			} else {

				System.out.println("That data does not exist. " + "Please try again.(hometown or food)");
				valid = true;

			}

		} while (valid == false);
		System.out.println("Thanks!");

	}

}
