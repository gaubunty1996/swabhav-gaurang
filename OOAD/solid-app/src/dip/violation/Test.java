package dip.violation;

public class Test {

	public static void main(String[] args) {
		TaxCalculator taxCalculator = new TaxCalculator(Log.DB);
		taxCalculator.calculateTax(0, 0);
	}

}
