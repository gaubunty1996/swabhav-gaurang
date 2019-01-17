package com.techlab.userdefinedexceptions;
import com.techlab.customexception.CustomException;


public class UserDefinedException {

	public static void main(String[] args) {

		try {
			throw new CustomException("Exception name=Gaurang");
		} catch (CustomException e) {
			System.out.println(e);
		}
	}

}
