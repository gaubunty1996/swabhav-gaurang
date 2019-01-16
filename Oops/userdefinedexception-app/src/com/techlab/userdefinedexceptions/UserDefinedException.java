package com.techlab.userdefinedexceptions;

class MyException extends Exception {
	String name;

	public MyException(String customName) {
		name = customName;
	}

	@Override
	public String toString() {
		return (name);
	}
}

public class UserDefinedException {

	public static void main(String[] args) {

		try {
			throw new MyException("Exception name=Gaurang");
		} catch (MyException e) {
			System.out.println(e);
		}
	}

}
