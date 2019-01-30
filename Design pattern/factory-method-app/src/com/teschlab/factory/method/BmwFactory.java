package com.teschlab.factory.method;

public class BmwFactory implements IAutoFactory {
	private static BmwFactory container;
	private BmwFactory() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public AutoMobile make() {
		
		return new Bmw();
	}
	public static BmwFactory getInstance() {
		if(container == null) {
			return new BmwFactory();
		}
		return container;
	}
}
