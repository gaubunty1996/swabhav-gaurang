package dip.solutions;

public class TestTaxCalc {

	public static void main(String[] args) {
		TaxCalculator taxCalculator = new TaxCalculator(new Dblogger());
		taxCalculator.calculateTax(0, 0);
	}

}
