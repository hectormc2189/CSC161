import java.util.Arrays;
import java.util.Scanner;

public class Assigment2 {
	/*
	 * Utility function which takes in an array of ints and a start index in order
	 * to return the minimum an array from the start index to the end of the array
	 */
	public static int min(int[] list, int start) {
		int minIndex = start;
		for (int i = start + 1; i < list.length; i++) {
			minIndex = list[i] < list[minIndex] ? i : minIndex;
		}
		return minIndex;
	}

	// Method that eliminates duplicates
	/*
	 * 3 Step Process: -> Selection sort to sort input array -> Create a copy array
	 * which only holds unique values in order -> Get any empty cells (trailing
	 * zeros in the array) and trim them
	 */

	public static int[] eliminateDuplicates_v1(int[] list) {
		int len = list.length;

		if (len == 1 || len == 0)
			/* You cannot sort an empty array or an array with 1 element lol */
			return list;

		boolean isZeros = true;
		for (int i = 0; i < len; i++) {
			if (list[i] != 0) {
				isZeros = false;
				break;
			}
		}

		if (isZeros) {
			int[] zero = { 0 };
			return zero;
		}

		// Beginning of selection sort
		for (int i = 0; i < len - 1; i++) {
			/*
			 * Selection sort grabs the minimum form the portion of the array, puts its in
			 * the front of the array which becomes "the sorted portion" and then grabs the
			 * minimum of the remaining unsorted elements, and adds it to the sorted portion
			 * (front of array).. rinse and repeat.
			 * 
			 * Complexity: Time:O(n^2), Space: constant
			 * 
			 * Merge sort would have been better but I digress
			 * 
			 */
			int min_idx = min(list, i);

			/* Swapping minimum element with first element in list! */
			int temp = list[min_idx];
			list[min_idx] = list[i];
			list[i] = temp;
		}
		// End of selection sort.

		/* Filling up an array called copy with unique values from the sorted array */

		int[] copy = new int[len];

		int slot = 0;
		boolean firstZero = true;
		/* Think of this as a tracker for filling up the copy array */

		for (int i = 0; i < len; i++) {
			boolean withinCopy = false;
			if (firstZero && list[i] == 0) {
				slot++;
				firstZero = false;
			}
			/*
			 * Will help us determine if we get a repeat copy or repeat zeros!
			 */

			for (int j = 0; j < len; j++) {
				if (list[i] == copy[j]) {
					withinCopy = true;
				}
				/*
				 * If any value within the copied list matches the value in the original list
				 * then we already have gotten it. We set our boolean trigger to true
				 */
			}

			if (!withinCopy) {
				copy[slot] = list[i];
				slot++;
			}
			/*
			 * If the boolean trigger was never activated (within is still false) then we
			 * add the value of list[i] to our copy list in the appropriate slot!
			 */

			/* We do this for all values of i (all values in the original list) */
		}

		/*
		 * Remember that since the size of the copy array is the size of the original
		 * array, and it only gets unique values, the copied array might be empty
		 * towards the end! The default value for an int array is 0, but 0 may actually
		 * be a legit entry in the original array! So how do we resolve that?
		 * 
		 * We know that our copied array was filled left to right which means the
		 * rightmost entries will be empty if any!
		 * 
		 * So we can count from right to left, and determine how many zeroes we hit
		 * before hitting a non-zero value!
		 * 
		 */

		int n_zeros = 0;
		int j = copy.length - 1;
		while (copy[j] == 0) {
			/*
			 * j is our right pointer index, we keep counting zeros until copy[j] != 0
			 */
			n_zeros++;
			j--;
		}

		/*
		 * When we have our number or zeros, we know that our trimmed array will have a
		 * length of original length - number of zeroes.
		 */
		int[] trimmed = new int[len - n_zeros];
		j = 0;
		/*
		 * j was in the outer scope, so I need to reset it, before using it again (see
		 * line 113)
		 */

		/* Constructing our trimmed array */
		for (int i = 0; i < trimmed.length; i++) {
			trimmed[j] = copy[i];
			j++;
			/*
			 * We only increment j anytime we slot in an element into trimmed to avoid gaps
			 * in the array
			 */
		}

		/*
		 * Finally we can return our processed array! Which is now technically a sorted
		 * set!
		 */
		return trimmed;

		/*
		 * If there was a corner case of empty arrays such as {0,0,0,0} it was handled
		 * at the very beginning of the method! If you go to line 77, the first zero
		 * boolean makes sure to understand that if the sorted array contains multiple
		 * zeroes, we want at most 1 of those zeroes in our unique values set (the copy
		 * array). Because the order of the array values are handled prior to the
		 * trimming process, the trimmed array does not need to be carefully filled, we
		 * can just dump in from 0 to length of trimmed array-1.
		 */

	}

	public static void main(String[] args) {
//		System.out.println("Hello");
//		int[] arr = {3, 2, 1, 3, 7, 4, 4, 4};
//		System.out.println("The given array is: "+Arrays.toString(arr));
//		System.out.println("The sorted set for the array is: "+ 
//		Arrays.toString(eliminateDuplicates_v1(arr)));

		Scanner input = new Scanner(System.in);
		// Initializing scanner object

		System.out.println("How many numbers are in the array? :");
		int size = input.nextInt();
		/* Getting size of array from user input */

		System.out.println("Enter " + size + " numbers: ");
		input.nextLine(); // Avoids the /n character put at the end of println
		String msg = input.nextLine();
		String[] strArray = msg.split(" ");
		/*
		 * Getting the array from the user as a single string, and splicing the string
		 * into a string array in prep for parsing
		 */

		int[] values = new int[size];
		for (int i = 0; i < size; i++) {
			values[i] = Integer.parseInt(strArray[i]);
		}
		/*
		 * Parsing string array into values array, which is an an array of ints.
		 */

		System.out.println("The given array is: " + Arrays.toString(values));
		System.out.println("The sorted set for the array is: " + Arrays.toString(eliminateDuplicates_v1(values)));
		/*
		 * Displaying received input and passing values array to method printing the
		 * resulting array via Array utils.
		 */

		input.close();

		/*
		 * I did not know if we were allowed to use Arrays.parallelSort but I could have
		 * saved a lot of pain and time complexiety that way! Utilizing the Set
		 * collections object would have also drastically streamlined this assignment
		 * but I assumed that would be a bit too far of a simplification.
		 */

	}
}
