
package com.techlab.reflection.test;

import com.techlabs.reflection.ReflectionMethods;
import java.lang.reflect.Method;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Constructor;
import java.util.*;

public class DriverCodeOfReflection {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException,
			IllegalArgumentException, InvocationTargetException {

		ReflectionMethods rm = new ReflectionMethods();
		Class cl = rm.getClass();

		Constructor constructor = cl.getConstructor();
		Constructor[] constructor2 = cl.getConstructors();

		Method[] method = cl.getMethods();
		rm.showMethods(method);

		System.out.println("count of methods is: " + rm.countOfMethods(method));
		System.out.println("count of getters is: " + rm.countNumbersOfGetters(method));
		System.out.println("count of setters is: " + rm.countNumbersOfSetters(method));
		System.out.println("The count of constructors is: " + rm.countOfConstructors(constructor2));
		System.out.println("Names of constructors: " + rm.nameOfConstructor(constructor));
		rm.nameOfClass(cl);
		rm.nameOfGetters(method);
		rm.nameOfSetters(method);

		/*
		 * Method changeInMethod = cl.getDeclaredMethod("addMiddleName", String.class);
		 * changeInMethod.invoke(rm, "Pramod");
		 * System.out.print("Now the name is changed to : "); rm.show();
		 */

		/*
		 * Method changeInMethod2 = cl.getDeclaredMethod("addLastName", String.class);
		 * changeInMethod2.invoke(rm, "Kadam");
		 * System.out.print("Now the name is changed to : "); rm.show();
		 */
	}

}
