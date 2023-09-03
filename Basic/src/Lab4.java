import java.util.Scanner;

public class Lab4 {

	static void Question1() {
		
		for(int i = 0; i < 200; i = i+2) {
			
			if(i == 0) {
				System.out.println("Kilograms\tPounds");
				i++;
			}
			
			System.out.printf("%-15d %.1f \n", i, i*2.2);
		}
	}
	
	static void Question1_v2() {
		
		int i = 0;
		while(i < 200) {
			if(i == 0) {
				System.out.println("Kilograms\tPounds");
				i++;
			}
			System.out.printf("%-15d %.1f \n", i, i*2.2);
			i+=2;
		}
	}
	
	static void Question2() {
		for(int i = 0; i < 11; i++) {
			
			if(i == 0) {
				System.out.println("Miles\t\tKilometers");
			}
			
			System.out.printf("%-15d %.3f \n", i, i*1.609); 

		}
	}
	
	static void Question2_v2() {
		int i = 0;
		while(i < 11) {
			
			if(i == 0) {
				System.out.println("Miles\t\tKilometers");
				i++;
			}
			
			System.out.printf("%-15d %.3f \n", i, i*1.609);
			i++;
			
		}
	}
	
	static void Question3() {
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
	
		System.out.println("Enter a string: ");
		String msg = input.nextLine();
		
		int n_upper = 0;
		
		for(int i = 0; i < msg.length(); i++) {
			if(Character.isUpperCase(msg.charAt(i))) {
				n_upper++;
			}
		}
		
		System.out.println("The number of uppercase letters is "+n_upper);
		
	}
	
	static void Question3_v2() {
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
	
		System.out.println("Enter a string: ");
		String msg = input.nextLine();
		
		int n_upper = 0;
		int i = 0;
		
		while(i < msg.length()) {
			if(Character.isUpperCase(msg.charAt(i))) {
				n_upper++;
			}
			i++;
		}
		
		System.out.println("The number of uppercase letters is "+n_upper);
	}
	
	public static void main(String []args) {
		Question1();
		System.out.println("---------------\n");
		Question1_v2();
		System.out.println("---------------\n");
		Question2();
		System.out.println("---------------\n");
		Question2_v2();
		System.out.println("---------------\n");
		Question3();
		System.out.println("---------------\n");
		Question3_v2();
	}

}