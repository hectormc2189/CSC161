import java.util.Scanner;

public class Assigment1 {

	public static void main(String[] args) {

		// Initializing scanner object
		Scanner input = new Scanner(System.in);

		// Asking for weight and converting to kilograms
		System.out.println("Enter weight in pounds: ");
		double pounds = input.nextDouble();
		double weight = pounds * 0.45359;

		// Asking for feet portion of height
		System.out.println("Enter feet (whole number): ");
		int feet = input.nextInt();

		// Asking for left over inches
		System.out.println("Enter inches: ");
		double inches = input.nextDouble(); // I don't know if this could have been simply an int

		// Calculation to first convert feet and inches to total inches, and then
		// convert inches to meters
		double height = (feet * 12 + inches) * 0.0254;

		// BMI calculation
		double bmi = weight / (height * height);

		// Printing out BMI
		System.out.println("BMI is " + bmi);

		// Source for ranges
		// https://www.nhs.uk/common-health-questions/lifestyle/what-is-the-body-mass-index-bmi/
		// Ternary operators > ifelseifelseifelseifelse...
		String msg = bmi < 18.5 ? "Underweight"
				: 18.5 <= bmi && bmi < 25 ? "Normal" : 25 <= bmi && bmi < 30 ? "Overweight" : "Obese";

		// Printing out msg variable which contains the appropriate value based on the
		// categorization.
		System.out.println(msg);

		input.close();

	}

}
