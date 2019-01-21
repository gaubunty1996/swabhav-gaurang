package com.techlab.testaccount;
import com.techlabs.account.Account;
public class TestToString {

	public static void main(String[] args) {
		Account newAccount=new Account("xyz");
		
		System.out.println(newAccount.toString());
	}

}
