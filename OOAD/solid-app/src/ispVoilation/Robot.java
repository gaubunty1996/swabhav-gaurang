package ispVoilation;

public class Robot implements IWorked{

	@Override
	public void startWork() {
		System.out.println(" Robot started working");
	}

	@Override
	public void stopWork() {
		System.out.println(" Robot stoped working");
	}

	@Override
	public void starteat() {
		throw new RuntimeException("Robot cannot eat ");
	}

	@Override
	public void stopeat() {
		throw new RuntimeException("how can robot stop eating when it cannot even eat ");
	}

}
