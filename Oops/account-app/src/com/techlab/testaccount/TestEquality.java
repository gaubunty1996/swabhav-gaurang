package com.techlab.testaccount;
import com.techlabs.account.Account;
public class TestEquality {

	public static void main(String[] args) {
		Account acc1 = new Account("Ajay");
		Account acc2 = new Account("Ajay");
		System.out.println(acc1==acc1);
		System.out.println(acc1.equals(acc1));
		
		System.out.println(acc1==acc2);
		System.out.println(acc1.equals(acc2));
		
		System.out.println(acc1);
		System.out.println(acc2);
		
		Account acc3 = acc1;
		System.out.println(acc3==acc1);
		System.out.println(acc3.equals(acc1));
		
		System.out.println("hashcode of acc3: "+acc3.hashCode());
		System.out.println("hashcode of acc: "+acc1.hashCode());
	}

}
