
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

		System.out.println("The name of class is : " + cl.getName());

		Constructor constructor = cl.getConstructor();

		System.out.println("The name of constructor is : " + constructor.getName());

		Method[] method = cl.getMethods();

		for (int i = 0; i < method.length; i++) {
			System.out.println(method[i]);
		}

		Method changeInMethod = cl.getDeclaredMethod("addMiddleName", String.class);

		changeInMethod.invoke(rm, "Pramod");

		System.out.print("Now the name is changed to : ");
		rm.show();

		Method changeInMethod2 = cl.getDeclaredMethod("addLastName", String.class);

		changeInMethod2.invoke(rm, "Kadam");

		System.out.print("Now the name is changed to : ");
		rm.show();

	}

}
