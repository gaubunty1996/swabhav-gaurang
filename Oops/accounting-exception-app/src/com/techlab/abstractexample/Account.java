package com.techlab.abstractexample;
import com.techlab.abstractexample.InsufficientFundsException;

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
	
	public void withdraw(double newAmount){
		if(newAmount<balance && balance-newAmount>=500) {
			balance=balance- newAmount;
		}
		else {
				throw new InsufficientFundsException(this);
		}
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

}
