package com.techlab.abstractexample;

public class InsufficientFundsException extends RuntimeException {
	private Account account;

	public InsufficientFundsException(Account account) {
		this.account=account;
	}
	@Override
	public String getMessage() {
		return "Dear customer "+account.getName()+" your balance is "+account.getBalance()+" so you cannot withdraw" ;
		}
}
