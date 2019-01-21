package com.techlab.abstractexample;

public class CurrentAccount extends Account {

	public CurrentAccount(String name, int accountNumber, int balance) {
		super(name, accountNumber, balance);
	}

	@Override
	public void withdraw(double amount) {
		if (this.balance - amount >= -2000) {
			this.balance = this.balance - amount;
		}
	}

}
