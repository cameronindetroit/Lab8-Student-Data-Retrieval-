package studentInfo;

public class Students {

	public static void main(String[] args) {

		// Student Information Arrays
		// Built in separate class as a reference to make sure count on each array is
		// correct

		String[] studentNames = { "Amna", "Andrew", "Anesha", "Cameron", "Darby", "Edward", "Jasmine", "JoRanda",
				"Kris", "Lauren", "Sasi", "Virginia", "Yasmine", "Arif", "Kari", "Louis", "Sharde", "Shontinique",
				"Stan" };

		String[] studentHometown = { "Rochester", "Ann Arbor", "Houston", "Los Angeles", "Ann Arbor", "Southfield",
				"Detroit", "redford", "ann Arbor", "Ann Arbor", "Chicago", "Las Vegas", "Dearborn", "Madison Heights",
				"Detroit", "Redford", "Detroit", "Plymouth", "Washington D.C" };

		String[] studentFavoriteFood = { "cheesecake", "chinese food", "McDonals", "coney dogs", "pizza", "apple pie",
				"oranges", "strawberries", "steak", "ice cream", "pancakes", "sushi", "pasta", "chicken", "soup",
				"buritto", "donuts", "tacos", "cheese" };

		System.out.println(studentHometown.length);
		System.out.println(studentNames.length);
		System.out.println(studentFavoriteFood.length);
	}

	public static void studentInformation(String studentInformation) {
		System.out.println(studentInformation);

	}

}
