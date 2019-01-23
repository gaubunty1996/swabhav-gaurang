package com.techlab.exception;

public class NewTest {
	public static void f4(){
		System.out.println("IN F4");
		f5();
	}

	public static void f5(){
		System.out.println("IN F5");
		f6();
	}

	public static void f6() {
		System.out.println("IN F6");
		throw new RuntimeException("f6 error");
	}

	public static void main(String[] args) {
		try{
			f4();
			}
		catch(Exception e) {
			System.out.println(e.getStackTrace());
			System.out.println(e.getMessage());
			//e.getMessage();
			e.printStackTrace();
		}
		System.out.println("The end");
	}

}
