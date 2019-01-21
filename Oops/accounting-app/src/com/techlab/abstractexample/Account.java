package com.techlab.abstractexample;

public abstract class Account {

	protected int accountNumber;
	protected String name;
	protected double balance;
	
	public Account(String name,int accountNumber,int balance) {
		this.accountNumber=accountNumber;
		this.name=name;
		this.balance=balance;
	}

	public void deposit(double amount) {
		this.balance = this.balance + amount;
	}
	
	public abstract void withdraw(double amount);

	public int getAccountNumber() {
		return accountNumber;
	}

	public String getName() {
		return name;
	}

	public double getBalance() {
		return balance;
	}

}
