package com.teschlab.factory.method;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestUsingPropertyFile {
	public static void main(String[] args)
			throws InstantiationException, IllegalAccessException, ClassNotFoundException, NoSuchMethodException,
			SecurityException, IllegalArgumentException, InvocationTargetException {
		
		LoadPropertyFile load = new LoadPropertyFile();
		Class cl = Class.forName(load.LoadProperty());
		Method method = cl.getDeclaredMethod("getInstance");
		IAutoFactory iautofactory = (IAutoFactory) method.invoke(null, null);
		AutoMobile automobile = iautofactory.make();
		automobile.start();
		automobile.stop();

	}
}
