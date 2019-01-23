package com.techlab.account;
import com.techlab.account.InsufficientFundsException;

public class Account {
	 

		protected int accountNumber;
		protected String name;
		protected double balance;
		protected double withdrawamount;
		
		public Account(int accountNumber,String name,int balance,double newAmount) {
			this.accountNumber=accountNumber;
			this.name=name;
			this.balance=balance;
			this.withdrawamount=newAmount;
		}

		public void deposit(double amount) {
			this.balance = this.balance + amount;
		}
		
		public void withdraw(double newAmount){
			if(newAmount<balance && balance-newAmount>=500) {
				balance=balance- newAmount;
			}
			else {
					throw new InsufficientFundsException(this);
			}
		}

		public int getAccountNumber() {
			return accountNumber;
		}

		public String getName() {
			return name;
		}

		public double getBalance() {
			return balance;
		}

	}


