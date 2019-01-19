package com.techlabs.customanotations;

import com.techlab.customannotations.ProTestCase;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

import com.techlab.customannotations.Foo;
import com.techlab.customannotations.ProTestCase;

public class TestAnnotations {

	public static void main(String[] args) throws Exception {
		int countOfAnnotatedMethods = 0;
		int passCount = 0;
		int failCount = 0;
		
		Foo foo = new Foo();
		Class cl = foo.getClass();
		
		Method[] methods = cl.getMethods();
		Method[] methods5 = cl.getDeclaredMethods();
		
		for (Method eachmethod : Foo.class.getMethods()) {
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
		
		System.out.println("count of annotated methods: " + countOfAnnotatedMethods);
		System.out.println("pass count is : " + passCount);
		System.out.println("fail count is : " + failCount);
	}
}
