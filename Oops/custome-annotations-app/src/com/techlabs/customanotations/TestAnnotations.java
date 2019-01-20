package com.techlabs.customanotations;

import com.techlab.customannotations.ProTestCase;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import com.techlab.customannotations.Foo;
import com.techlab.customannotations.ProTestCase;

public class TestAnnotations {
	static int countOfAnnotatedMethods = 0;
	static int passCount = 0;
	static int failCount = 0;

	public static void validates(Method eachmethod, Foo foo)
			throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		if (eachmethod.isAnnotationPresent(ProTestCase.class) == true
				&& (boolean) eachmethod.invoke(foo, null) == true) {
			countOfAnnotatedMethods = countOfAnnotatedMethods + 1;
			passCount = passCount + 1;
		}
		if (eachmethod.isAnnotationPresent(ProTestCase.class) == true
				&& (boolean) eachmethod.invoke(foo, null) == false) {
			countOfAnnotatedMethods = countOfAnnotatedMethods + 1;
			failCount = failCount + 1;
		}
	}
	public static void printDetails() {
		System.out.println("count of annotated methods: " + countOfAnnotatedMethods);
		System.out.println("pass count is : " + passCount);
		System.out.println("fail count is : " + failCount);
	}

	public static void main(String[] args) throws Exception {

		Foo foo = new Foo();
		Class cl = foo.getClass();

		Method[] methods = cl.getMethods();
		
		for (Method eachmethod : methods) {
			validates(eachmethod, foo);
		}
		printDetails();
		
	}
}
