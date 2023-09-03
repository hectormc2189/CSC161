import java.text.DecimalFormat;

public class Lab5 {

/*Question 1 ------------------------------------*/
	
	public static double footToMeter(double feet) {
		return 0.305*feet;
	}
	
	public static double meterToFoot(double meters) {
		return 3.279*meters;
	}
	
	/*----------------------------------------------*/
	
	/*Question 2 -----------------------------------*/
	
	public static double celsiusToFahrenheit(double celsius) {
		return (9.0 / 5) * celsius + 32;
		// We do not need to account for type errors as
		// if the function is used with incorrect type parameters
		// the compiler detects the error!
	}
	
	public static double fahrenheitToCelsius(double fahrenheit) {
		return (5.0 / 9) * (fahrenheit - 32);
		// The parentheses dictate the order of operations,
		// in other words they need to be in correct spot
		// to get the correct answer!
	}
	
	/*----------------------------------------------*/
	
	
	/* Testing the functionality of the methods! */
	public static void main(String []args) {
		
		// Initializing formatter and variables
		DecimalFormat df = new DecimalFormat("###.##");
		double temp = 37;
		double temp2 = 42.069;
		
		// Basic conversion
		System.out.println(df.format(celsiusToFahrenheit(temp)));
		System.out.println(df.format(fahrenheitToCelsius(temp)));
		
		// Testing that the two functions are inverses!
		System.out.println(fahrenheitToCelsius(celsiusToFahrenheit(temp2)));
	}
}
