package com.techlab.testaccount;
import com.techlabs.account.Account;
public class TestClone {

	public static void main(String[] args) throws CloneNotSupportedException {
		Account newAccount1= new Account("ABC");
		
			Account newAccount2 = (Account)newAccount1.Clone();
			System.out.println(newAccount1.equals(newAccount2));
			System.out.println(newAccount1);
			System.out.println(newAccount2);
			
		
		
	}

}
