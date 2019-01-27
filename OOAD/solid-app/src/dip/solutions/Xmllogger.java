package dip.solutions;

public class Xmllogger implements ILogger {

	@Override
	public void log(String errorMessage) {
		System.out.println("logging error message into xml");
	}

}
