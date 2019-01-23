package com.techlab.testAccount;

import com.techlab.abstractexample.Account;

public class TestAccount {

	public static void main(String[] args) {
		/*try {
		CurrentAccount currentAccount = new CurrentAccount("Gaurang", 1, 250);
		currentAccount.deposit(5);
		currentAccount.withdraw(555);
		//printDetails(currentAccount);
		SavingsAccount savingsAccount = new SavingsAccount("jaaie", 2, 6000);
		savingsAccount.withdraw(2000);
		//printDetails(savingsAccount);
		}
		catch(InsufficientFundsException e) {
			System.out.println(e.getMessage());
		}*/
		
	}
	
	public static void printDetails(Account account) {
		System.out.println("account balance is: " + account.getBalance());
		System.out.println("account name is: " + account.getName());
		System.out.println("account account number is: " + account.getAccountNumber());
	}
}
