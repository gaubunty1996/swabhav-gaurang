package acp.testsolutions;

public class FixedDeposit {
	private int accountid;
	private String name;
	private double principle;
	private int years;
	private IRateCalculator festivalType;

	public FixedDeposit(int accountid, String name, double principle, int years, IRateCalculator festivalType) {
		super();
		this.accountid = accountid;
		this.name = name;
		this.principle = principle;
		this.years = years;
		this.festivalType = festivalType;
	}

	public int getAccountid() {
		return accountid;
	}

	public String getName() {
		return name;
	}

	public double getPrinciple() {
		return principle;
	}

	public int getYears() {
		return years;
	}

	public IRateCalculator getFestivalType() {
		return festivalType;
	}

	public double calcSimpleInterest() {
		return principle*years*festivalType.calculateRate();

	}
}

