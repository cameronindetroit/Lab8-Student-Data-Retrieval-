package studentInfo;

import java.util.Scanner;

public class StudentInfo {

	public static void main(String[] args) {
		// Scanner
		Scanner scnr = new Scanner(System.in);

		// Class variables
		int userInput;
		boolean Valid = false;
		String selectedStudent = null;

		// Array of Students
		String[] studentNames = { "Amna", "Andrew", "Anesha", "Cameron", "Darby", "Edward", "Jasmine", "JoRanda",
				"Kris", "Lauren", "Sasi", "Virginia", "Yasmine", "Arif", "Kari", "Louis", "Sharde", "Shontinique",
				"Stan" };

		// Prompt user for information about a student
		System.out.println("Welcome to our Java class.");
		userInput = Validator.getIntInRange(scnr,
				"Which student would you like to learn more about? (enter a number 1-19)");

		selectedStudent = studentNames[userInput - 1];
		// System.out.println(studentNames.length);
		System.out.println("Student: " + userInput + " is " + selectedStudent + ". What would you like to know about "
				+ selectedStudent + "? Enter homwtown or favorite food");

	}

}
