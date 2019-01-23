package com.techlab.testaccount;

import com.techlab.account.Account;
import com.techlab.account.InsufficientFundsException;

public class TestAccount {
	public static void main(String[] args) {
		try {
			Account account=new Account(123,"Gaurang",50,5500);
			account.deposit(5);
			account.withdraw(555);
			//printDetails(currentAccount);
			
			//printDetails(savingsAccount);
			}
			catch(InsufficientFundsException e) {
				System.out.println(e.getMessage());
			}
	}
	
		
}
