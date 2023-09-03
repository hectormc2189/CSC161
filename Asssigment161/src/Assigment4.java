
public class Assigment4 {

	public static void main(String[] args) {
		/* Testing the account class ------------------------------------------------ */

		Account myAcc = new Account(1122, 20000);
		// The test class and Account class are in same package so no need to import!
		myAcc.withdraw(2500);
		myAcc.deposit(3000);
		System.out.println(myAcc.getInfo());

		/*--------------------------------------------------------------------------*/
		System.out.println("________________________________________________________");
		/* Testing the stopwatch class --------------------------------------------- */

		StopWatch myTimer = new StopWatch();
		System.out.println("\nThe timer was initialized on " + myTimer.getStartTime().toString());

		try { // We need to use a try-catch block to avoid an InterruptedException
				// This exception occurs when and if a thread is blocked by an external
				// thread while performing an interruptible operation (wait, sleep, I/O)!
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			System.out.println("got interrupted!");
		}

		System.out.println("\n" + myTimer.getElapsedTime() / 1000.0d + " seconds "
				+ "have passed since the timer was initialized!");
		// With no processing time, the answer would ideally be 2.000 seconds.
		// But compilers take time!

		try { // We need to use a try-catch block to avoid an InterruptedException
				// This exception occurs when and if a thread is blocked by an external
				// thread while performing an interruptible operation (wait, sleep, I/O)!
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			System.out.println("got interrupted!");
		}

		System.out.println("\nThe last time we stopped the stopwatch was: " + myTimer.getEndTime());
		// This should ideally be 5 seconds before the statement is printed!

		myTimer.start(); // If we do not have this line, the start time would be
		// the time from 7 seconds ago.
		System.out.println("\nIf you start the timer now, the start time will be " + myTimer.getStartTime().toString());
		// This should be the current time!

		/*--------------------------------------------------------------------------*/
	}
}
