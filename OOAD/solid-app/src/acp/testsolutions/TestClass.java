package acp.testsolutions;

public class TestClass {

	public static void main(String[] args) {
		FixedDeposit fixed= new FixedDeposit(5, "abc", 100, 10, new NewYearFestival());
		System.out.println(fixed.calcSimpleInterest());
	}

}
