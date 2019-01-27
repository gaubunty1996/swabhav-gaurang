package dip.violation;

public class TaxCalculator {
	private Log log;

	public TaxCalculator(Log log) {
		this.log = log;
	}

	public void calculateTax(int amount, int rate) {
		try {
			int rent = amount / rate;
		} catch (Exception e) {
			String errorMessage = e.getMessage();
			if (log == Log.DB) {
				new Dblogger().log(errorMessage);
				return;
			}
			new Xmllogger().log(errorMessage);

		}
	}
}
