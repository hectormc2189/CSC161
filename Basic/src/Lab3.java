import java.util.Scanner;
import java.util.Random;

public class Lab3 {
	
	@SuppressWarnings("resource") // I have OCD, sorry lol.
	static void Question1() {
		
		// Initializing the scanner object and user inputs
		Scanner input = new Scanner(System.in);
		double weight1, price1, weight2, price2;
				
		// Prompting for user input regarding the first package
		System.out.println("Enter weight and price for package 1:");
		weight1 = input.nextDouble();
		price1 = input.nextDouble();
				
		// Prompting for user input regarding the second package
		System.out.println("Enter weight and price for package 2:");
		weight2 = input.nextDouble();
		price2 = input.nextDouble();
				
		// Determining the better value using an all in one comparison and assignment
		String whichPackage = (price1 / weight1) < (price2 / weight2) ?  "Package 1"
				+ " has a better price": (price1 / weight1) > (price2 / weight2) ?
				"Package 2 has a better price": "Both packages are equally"
										+ " great deals!";
				
		// Printing out our evaluation
		System.out.println(whichPackage);
				
		/* Ideally I would have liked to use try catch blocks in combination with
		 * while loops to assess incorrect user input. But there were some problems
		 * where I discovered that primitive types by definition cannot be compared
		 * to null because they are never null. However their object reference types,
		 * i.e. Double (As opposed to double) can be used for null comparison. */
		
	}
	
	static void Question2() {
		
		// Initializing the scanner object and random object
		Scanner input = new Scanner(System.in);
		Random random = new Random();
		
		// Asking for user input and assigning it to a string value via a ternary statement
		System.out.println("scissor (0), rock (1), paper (2): ");
		int user_rps = input.nextInt();
		String userChoice = user_rps == 0 ? "scissors" : user_rps == 1 ? "rock"
				: user_rps == 2 ? "paper": "invalid";
		
		// Generating computer's choice and assigning it to a string value
		// NOTE: The end bound is not included, therefor possible values incl. 0,1,2
		int comp_rps = random.nextInt(0,3);
		String compChoice = comp_rps == 0 ? "scissors": comp_rps == 1 ?
				"rock": comp_rps == 2 ? "paper" : "invalid";
		
		// Comparing all possible computer choices and your choices
		String result = comp_rps == user_rps ? "It is a draw.": (comp_rps == 0 &&
				user_rps == 1) || (comp_rps == 1 && user_rps == 2) || 
				(comp_rps == 2 && user_rps == 0) ? "You won!": "The computer won!";
		
		/*Some explanation here: The first condition says checks for a draw, where both
		 * the user and computer have made identical choices. The second conditions checks
		 * for ANY combination (hence the ||) of user and computer choices that allow the 
		 * user to win. By process of elimination, if the game is not a draw and the user 
		 * did not fulfill any win conditions, then the computer MUST have won!*/
		
		
		
		// Assembling the final message! 
		System.out.println("The computer is " + compChoice + ". You are " + userChoice
				+ ". "+ result);
		
		input.close();
		
	}
	
	public static void main(String[]args) {
		Question1();
		Question2();
		
		/* A few questions:
		 * 
		 * 1) Should we get in the habit of try-catch blocks to handle InputMismatchExceptions?
		 * 2) Do you have a preference between traditional if-else structure and ternary operators 
		 * for the works we submit? 
		 * 3) When we need to make null comparisons for primitive types, is it okay we
		 * declare them as "Double num = 3;" instead of "double num = 3;" or are there issues
		 * with type safety or something or the other.
		 * 
		 * */
		
		
	}
}
