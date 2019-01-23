package com.techlab.testAccount;

import com.techlab.abstractexample.InsufficientFundsException;

import com.techlab.abstractexample.Account;
import com.techlab.abstractexample.CurrentAccount;
import com.techlab.abstractexample.InsufficientFundsException;
import com.techlab.abstractexample.SavingsAccount;;

public class TestAccount {

	public static void main(String[] args) {
		try {
			CurrentAccount currentAccount = new CurrentAccount("Gaurang", 1, 200);
			currentAccount.deposit(5);
			currentAccount.withdraw(55000);
			printDetails(currentAccount);
			SavingsAccount savingsAccount = new SavingsAccount("jaaie", 2, 6000);
			savingsAccount.withdraw(2000);
			printDetails(savingsAccount);
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void printDetails(Account account) {
		System.out.println("account balance is: " + account.getBalance());
		System.out.println("account name is: " + account.getName());
		System.out.println("account account number is: " + account.getAccountNumber());
	}
}
