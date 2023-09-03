import java.util.Date;

public class StopWatch {
	
	private Date startTime;
	private Date endTime;
	
	// Getters and Setters
	public Date getStartTime() {
		return startTime;
	}


	public Date getEndTime() {
		return endTime;
	}


	// No-Arg Constructor
	public StopWatch(){
		this.startTime = new Date();
	}
	
	// Methods
	public void start() {
		startTime = new Date();
	}
	
	public void stop() {
		endTime = new Date();
	}
	
	public int getElapsedTime() {
		stop();
		return (int) (endTime.getTime() - startTime.getTime());
	}
}