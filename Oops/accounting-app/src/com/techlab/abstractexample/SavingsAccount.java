package com.techlab.abstractexample;

public class SavingsAccount extends Account{

	public SavingsAccount(String name, int accountNumber, int balance) {
		super(name, accountNumber, balance);
	}

	@Override
	public void withdraw(double amount) {
		if(this.balance-amount>=1000) {
			this.balance=this.balance-amount;
		}
	}

}
