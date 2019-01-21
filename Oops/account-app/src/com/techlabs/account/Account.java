package com.techlabs.account;

public class Account implements Cloneable {
	private static int randomGeneratedNumber;
	private int accountNumber;
	private String name;
	private double balance;

	static {
		randomGeneratedNumber = 1;
	}

	public Account(String name) {
		this(name, 500);
	}

	public Account(String name, int balance) {
		this.name = name;
		this.balance = balance;
		this.accountNumber = randomGeneratedNumber;
		randomGeneratedNumber++;
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

	public void deposit(int amount) {
		this.balance = balance + amount;
	}

	public void withdraw(int amount) {
		if (this.balance - amount > 500) {
			this.balance = balance - amount;
		}
	}

	@Override
	public String toString() {

		return (super.toString() + "\n " + getAccountNumber() + "\n " + getBalance() + " \n" + getName());
	}

	@Override
	public boolean equals(Object obj) {
		Account newAccount = (Account) obj;
		if (newAccount.getName() == getName() && newAccount.getBalance() == getBalance()) {
			return true;
		}
		return false;
	}
	public Object Clone()throws CloneNotSupportedException{  
		return super.clone();  
		}  

}
