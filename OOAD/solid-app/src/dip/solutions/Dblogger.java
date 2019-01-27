package dip.solutions;

public class Dblogger implements ILogger {

	@Override
	public void log(String errorMessage) {
		System.out.println("logging error message into database");
	}

}
