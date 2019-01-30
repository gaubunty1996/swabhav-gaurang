package com.techlab.observer;

public class EmailListners implements IAccountListners {

	@Override
	public void balanceChange(Account account) {
		System.out.println("Account name: " + account.getName() + " your account number: "
				+ account.getAccountNumber() + " your balance is: " + account.getBalance());
	}

}
