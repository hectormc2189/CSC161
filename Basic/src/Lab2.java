import java.util.Random;

import java.util.Scanner;

public class Lab2 {
	static void Question1() {
		Random random = new Random();
		int index = random.nextInt(1, 13); // Ints from 1 to 12
		// index = 13;
		// Uncomment the line above to test default (error) case

		System.out.println("Your random number is " + index);
		String month;

		// Switch statement is more efficent to code than a else-if syntax
		switch (index) {

		case 1:
			month = "January";
			break;
		case 2:
			month = "Febuary";
			break;
		case 3:
			month = "March";
			break;
		case 4:
			month = "April";
			break;
		case 5:
			month = "May";
			break;
		case 6:
			month = "June";
			break;
		case 7:
			month = "July";
			break;
		case 8:
			month = "August";
			break;
		case 9:
			month = "September";
			break;
		case 10:
			month = "October";
			break;
		case 11:
			month = "November";
			break;
		case 12:
			month = "December";
			break;
		default:
			/*
			 * Default case will never occur, unless I messed up the code prior to the
			 * switch statement
			 */
			month = "";
			System.out.println("Something went wrong!");

		}

		if (month == "") { // Additional error message
			System.out.println("The month was not initialized in the range of months (1 to 12)!");
		}

		else { // Expected output
			System.out.println("Your month is : " + month);
		}

	}

	static void Question2() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a three digit integer: ");
		int num = input.nextInt();
		int firstDigit = num / 100;
		int secondDigit = (num - firstDigit * 100) / 10;
		int lastDigit = num - (firstDigit * 100 + secondDigit * 10);
		// The result of a 3 digit number being divided by 100 always begins with the
		// first digit of the original number.
		// The last digit can be reconstructed when you know the first two digits and
		// the original number.

		if (num <= 10 && num > 0) {
			System.out.println("The number is not a palindrome :( ");
		} else if (num == 0) { // Keep in mind 0 is a palindrome by mathematical definition
			System.out.println("The number is a palindrome :D ");
		} else if (lastDigit == firstDigit) {
			System.out.println("The number is a palindrome :D ");
		} else {
			// You could also say else if(firstDigit != lastDigit) and then have an empty
			// else statement.
			System.out.println("The number is not a palindrome :( ");
		}
		input.close();
	}

	static void Question2Extended() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a integer: ");
		int num = input.nextInt();

		if (num <= 10 && num > 0) { // Keep in mind 0 is a palindrome by stupid math definitions
			System.out.println("The number is not a palindrome :( ");
		}

		else {

			int reverse = 0;
			int copy = num;

			// While loop uses modulo arithmetic to simplify calculation
			while (num > 0) {

				int remainder = num % 10; // calculates remainder = n mod 10

				/*
				 * Ex. First iteration: remainder = 121 % 10 = 1, Second iteration: remainder =
				 * 12 % 10 = 2 contd. Final iteration: remainder = 1 / 10 = 0
				 */

				reverse = reverse * 10 + remainder; // Builds the reverse number

				/*
				 * Ex. First iteration: reverse = 0 * 10 + 1, Second iteration: reverse = 1*10 +
				 * 2 = 12 contd. Final iteration: reverse = 12 * 10 + 1 = 121
				 */

				num = num / 10; // Truncates number

				/*
				 * Ex. First iteration: num = 121 / 10 = 12 ... 2nd iteration: num = 12 / 10 = 1
				 * ... contd. Final iteration: num = 1 / 10 = 0 (exits loop since num is not
				 * greater than 0)
				 */
			}

			if (copy != reverse) {
				System.out.println("The number is not a palindrome :( ");
			} else {
				System.out.println("The number is a palindrome!");
			}
		}

		input.close();

	}

	public static void main(String[] args) {
		Question1();
		Question2();
	}
}