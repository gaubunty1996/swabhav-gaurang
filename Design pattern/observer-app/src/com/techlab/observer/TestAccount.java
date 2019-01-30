package com.techlab.observer;

public class TestAccount {

	public static void main(String[] args) {
		Account account = new Account(123, "Gaurang", 5555);
		account.registerListners(new EmailListners());
		account.depositAmount(5000);
		account.registerListners(new EmailListners());
		account.depositAmount(5000);
	}

}
