package com.techlab.observer;

import java.util.ArrayList;
import java.util.List;

public class Account {
	private int accountNumber;
	private String name;
	private double balance;
	private List<IAccountListners> listners;

	public Account(int accountNumber, String name, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
		this.listners = new ArrayList<IAccountListners>();
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public String getName() {
		return name;
	}

	public double getBalance() {
		return balance;
	}

	public List<IAccountListners> getListners() {
		return listners;
	}

	public void registerListners(IAccountListners accountlistners) {
		listners.add(accountlistners);
	}

	public void depositAmount(double amount) {
		this.balance = balance + amount;
		notifyall();
	}

	public void withdraw(double amount) {
		this.balance = balance - amount;
		notifyall();

	}

	public void notifyall() {
		for (IAccountListners eachlistner : listners) {
			eachlistner.balanceChange(this);
		}
	}
}
