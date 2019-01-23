package com.techlab.exception;

public class TestPropogation {
	public static void f1() throws Exception {
		System.out.println("IN F1");
		f2();
	}

	public static void f2() throws Exception {
		System.out.println("IN F2");
		f3();
	}

	public static void f3() throws Exception {
		System.out.println("IN F3");
		throw new Exception("f3 error");
	}

	public static void main(String[] args)throws Exception {
		try{
			f1();
			}
		catch(Exception e) {
			System.out.println(e.getStackTrace());
			System.out.println(e.getMessage());
			//e.getMessage();
			e.printStackTrace();
		}
		System.out.println("end of program");
	}
}
