import java.util.Scanner;

public class Lab6 {

/*Question 1-------------------------------------*/
	
	public static double average(int[] array) {
		double sum = 0;
		for(int value: array) {
			sum+=value;
		}
		return sum / array.length;
	}
	
	public static double average(double[] array) {
		double sum = 0;
		for(double value: array) {
			sum+=value;
		}
		return sum / array.length;
	}
	
	/*-----------------------------------------------*/
	
	/*Question 2-------------------------------------*/
	
	public static double min(double[] array) {
		
		double minimum = array[0]; 
		// Default minimum will be first value in array
		for(int i = 1; i < array.length; i++) {
			// Comparing current min to each proceeding value
			if(array[i] < minimum) {
			// If the value we are on is lower then the lowest value,
			// it is the new low!
				minimum = array[i];
			}
		}
		
		// returning the minimum
		return minimum;
	}
	
	public static void testMin() {
		
		// Initializing the scanner object
		Scanner input = new Scanner(System.in);
		
		// Prompting user for array size and reading it
		System.out.println("How many values should your array hold?: ");
		int size = input.nextInt();
		
		// Prompting user for numbers and reading them (as a string)
		System.out.println("Enter "+size+" numbers "
				+ "(space inbetween each entry):");
		input.nextLine();
		String inputArray = input.nextLine();
		
		// Splitting the input string into several words which are numbers
		// Putting the split string into a string array
		String[] values = inputArray.split(" ");
		
		// Initializing our main array
		double[] nums = new double[size];
		
		// Parsing the string numbers into double values which
		// are put into the nums array
		for(int i = 0; i < values.length; i++) {
			nums[i] = Double.parseDouble(values[i]);
		}
		
		// Applying min() function to our final array!
		System.out.println("The minimum value is: "+min(nums));
		input.close();
	}
	
	/*-----------------------------------------------*/
	
	public static void main(String []args) {
		testMin();
		double[] array = {1.1, 2.2, 3.14, 4.20, 6.969};
		System.out.println("The average of the array {1.1, 2.2, 3.14, 4.20, 6.969} is: "+average(array));
		
	}
}