import java.util.Scanner;
//import java.math.*;
import java.text.DecimalFormat;

public class Lab1 {

	@SuppressWarnings("resource")
	static void Question1() {

		// Initializing the Scanner object
		Scanner input = new Scanner(System.in);

		// User input and assignment for pounds
		System.out.print("Enter a number in pounds: ");
		double pounds = input.nextDouble();

		// Output with built in calculation "pounds*0.454"
		System.out.println(pounds + " pounds is " + pounds * 0.454 + " kilograms");

	}

	@SuppressWarnings("resource")
	static void Question2() {

		// Initializing the Formatter and Scanner objects
		DecimalFormat df = new DecimalFormat("#.#####");
		Scanner input = new Scanner(System.in);

		// User input and assignment for balance
		System.out.print("Enter the current balance of the loan: ");
		double balance = input.nextDouble();

		// User input and assignment for interest rate
		System.out.println("Enter the annual interest rate (e.g. 3 for 3%): ");
		double rate = input.nextDouble();

		// Output with built in calculation and formatting "df.format(balance * (rate /
		// 1200))"
		System.out.println("The monthly interest is " + df.format(balance * (rate / 1200)));

	}

	static void Question3() {

		// Initializing the Formatter and Scanner objects
		DecimalFormat df = new DecimalFormat("#.####");
		Scanner input = new Scanner(System.in);

		// User input and assignment for pounds
		System.out.print("Enter weight in pounds: ");
		double pounds = input.nextDouble();

		// User input and assignment for inches
		System.out.print("Enter the height in inches: ");
		double inches = input.nextDouble();

		// Conversions and assignments to new, appropriately named variables
		double kilograms = pounds * 0.45359237;
		double meters = inches * 0.0254;

		// Final calculation (BMI formula)
		double BMI = kilograms / Math.pow(meters, 2);

		// Output
		System.out.println("BMI is " + df.format(BMI));

		input.close();
	}

	public static void main(String[] args) {
		Question1();
		Question2();
		Question3();
	}
}
