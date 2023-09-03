
public class Fan {
// Class members
	final int SLOW = 1, MEDIUM = 2, FAST = 3;
	private int speed = SLOW;
	private boolean on = false;
	private double radius = 5;
	String color = "blue";

	// Getters and setters
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public boolean isOn() {
		return on;
	}

	public void setOn(boolean on) {
		this.on = on;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	// No-Arg Constructor
	public Fan() {

	}

	// Methods
	public String toString() {

		String msg = on
				? "The fan speed is " + speed + ".\n The fan color is " + color + ".\n The fan's radius is " + radius
						+ "."
				: "The fan color is " + color + " and its radius is " + radius + ".\nHowever the fan is off!";
		return msg;

	}

	public static void main(String[] args) {
		Fan myFan = new Fan();
		System.out.println(myFan.toString());

		System.out.println("\nTesting getters:\n");

		System.out.println("Fan color: " + myFan.getColor());
		String speed = myFan.getSpeed() == 1 ? "slow" : myFan.getSpeed() == 2 ? "medium" : "fast";
		System.out.println("Fan speed: " + myFan.getSpeed() + " (" + speed + ")");
		System.out.println("Fan radius: " + myFan.getRadius());
		String isOn = myFan.isOn() ? "yes" : "no";
		System.out.println("Is the fan on?: " + isOn);

		System.out.println("______________________");

		System.out.println("\nTesting setters:\n");

		Scanner input = new Scanner(System.in);

		System.out.println("What should we change the color to (enter a color):");
		String userColor = input.next();
		System.out.println("What should the fan speed be set to (enter a number from 1-3)");
		int userSpeed = input.nextInt();
		System.out.println("What is the fan's radius (enter any number)?");
		double userRadius = input.nextDouble();
		System.out.println("Is the fan turned on? (enter 0 for false, 1 for true)");
		int UserIsOn = input.nextInt();
		boolean userOn = UserIsOn == 0 ? false : true;

		myFan.setColor(userColor);
		myFan.setOn(userOn);
		myFan.setRadius(userRadius);
		myFan.setSpeed(userSpeed);

		System.out.println("\nYour modified fan: \n");

		System.out.println("Fan color: " + myFan.getColor());
		speed = myFan.getSpeed() == 1 ? "slow" : myFan.getSpeed() == 2 ? "medium" : "fast";
		System.out.println("Fan speed: " + myFan.getSpeed() + " (" + speed + ")");
		System.out.println("Fan radius: " + myFan.getRadius());
		isOn = myFan.isOn() == true ? "yes" : "no";
		System.out.println("Is the fan on?: " + isOn);

		System.out.println("______________________________");

		input.close();
	}

}

}
