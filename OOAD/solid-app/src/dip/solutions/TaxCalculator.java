package dip.solutions;



public class TaxCalculator {
	private ILogger logger;

	public TaxCalculator(ILogger logger) {
		this.logger = logger;
	}

	public void calculateTax(int amount, int rate) {
		try {
			int rent = amount / rate;
			System.out.println(rent);
		} catch (Exception e) {
			String errorMessage = e.getMessage();
			if (logger instanceof Dblogger) {
				ILogger dblog = new Dblogger();
				dblog.log(errorMessage);
				return;
			}
			ILogger xmllog=new Xmllogger();
			xmllog.log(errorMessage);
			

		}
	}
}
