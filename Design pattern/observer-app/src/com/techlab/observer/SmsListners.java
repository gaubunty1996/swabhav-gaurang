package com.techlab.observer;

public class SmsListners implements IAccountListners {

	@Override
	public void balanceChange(Account account) {
		System.out.println("Account name: \n" + account.getName() + " your account number \n"
				+ account.getAccountNumber() + " your balance is: \n" + account.getBalance());
	}

}
