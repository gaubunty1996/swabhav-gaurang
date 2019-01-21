package com.techlab.testaccount;

import com.techlabs.account.Account;

public class TestAccount{

	public static void main(String[] args) {
		Account account1 = new Account("Gaurang", 0);
		TestAccount testaccount = new TestAccount();

		System.out.println("Account number of : " + account1.getName() + " is : " + account1.getAccountNumber());
		account1.deposit(5500);
		System.out.println(account1.getBalance());
		account1.withdraw(5500);
		System.out.println(account1.getBalance());
		printDetails(account1);
		System.out.println("");

		Account account2 = new Account("Jaaie");
		account2.deposit(50000);
		account2.getBalance();
		account2.withdraw(100000);
		printDetails(account2);
	}

	static public void printDetails(Account account) {
		System.out.println("Name of user is: " + account.getName());
		System.out.println("Balance of user is: " + account.getBalance());
		System.out.println("Account number of user is: " + account.getAccountNumber());
	}
}
