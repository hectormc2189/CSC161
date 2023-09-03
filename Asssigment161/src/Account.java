import java.util.Date;

public class Account {
	
	private int id;
	private double balance;
	private static double annualInterestRate = 0;
	private Date dateCreated = new Date();
	
	// Constructors
	public Account() {
		
	}
	
	public Account(int id, double balance) {
		this.id = id;
		this.balance = balance;
	}

	// Getters and Setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public static double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public static void setAnnualInterestRate(double annualInterestRate) {
		Account.annualInterestRate = annualInterestRate;
	}

	public Date getDateCreated() {
		return dateCreated;
	}
	
	// Methods
	public double getMonthlyInterest() {
		return annualInterestRate / 12.0d;
	}
	
	public void withdraw(double amount) {
		balance-=amount;
	}
	
	public void deposit(double amount) {
		balance+=amount;
	}
	
	public String getInfo() { // I did this out of habit, but it will be useful!
		String msg = "Balance: " +balance+ "\nMonthly Interest: "+
				getMonthlyInterest()+"\nDate Created: "+dateCreated;
		return msg;
	}

}
