import java.util.Scanner;

public class Assigment3 {

	// Utility method to find the max of an int array
	public static int max(int[] list) {
		int maximum = list[0];
		for (int i = 1; i < list.length; i++) {
			maximum = list[i] > maximum ? list[i] : maximum;
		}
		return maximum;
	}

	// Method to grade a list of scores
	public static void assignGrades(int[] grades) {
		int best = max(grades); // Determines the max score via helper method

		for (int student = 0; student < grades.length; student++) {
			/* Iterating through all grades (students) */

			int relativeGrade = best - grades[student];
			/* Getting the relative grade of each student */

			char letterGrade = relativeGrade <= 10 ? 'A'
					: relativeGrade <= 20 ? 'B' : relativeGrade <= 30 ? 'C' : relativeGrade <= 40 ? 'D' : 'F';
			/*
			 * Ternary statement to get the appropriate letter grade based on the relative
			 * grade!
			 */

			System.out.println("Student " + student + " score is " + grades[student] + " and grade is " + letterGrade);
			/* Printing out the score and letter grade for the current student */

		}

	}

	public static void main(String[] args) {
		// int[] test1 = {44, 76, 89, 95, 72};
		// assignGrades(test1);

		/* Code above was for testing without user input :) */

		Scanner input = new Scanner(System.in);
		// Initializing scanner object

		System.out.println("Enter the number of students: ");
		int classSize = input.nextInt();
		/* Getting the number of students */

		System.out.println("Enter " + classSize + " scores: ");
		input.nextLine(); // This avoids the potential /n character created by println
		String scores = input.nextLine();
		/* Getting the scores from the user as one string */

		String[] splitScores = scores.split(" ");
		int[] parsedScores = new int[classSize];
		/* Splitting the string and preparing for parsing */

		for (int score = 0; score < splitScores.length; score++) {
			parsedScores[score] = Integer.parseInt(splitScores[score]);
		}
		/* Parsing each value in string array as an int value in new array */

		assignGrades(parsedScores);
		/* Passing final parsed int array to our method */

		input.close();

	}

}
