package com.acp.voilation;

public class FixedDeposit {
	private int accountid;
	private String name;
	private double principle;
	private int years;
	private FestivalType festivalType;

	public FixedDeposit(int accountid, String name, double principle, int years, FestivalType festivalType) {
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

	public FestivalType getFestivalType() {
		return festivalType;
	}

	public double calcSimpleInterest() {
		if (getFestivalType() == getFestivalType().DIWALI) {
			return principle * years * 7.5;
		}
		if (getFestivalType() == getFestivalType().HOLI) {
			return principle * years * 5;
		}
		return principle*years*8.0;

	}
}
