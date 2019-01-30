package com.teschlab.factory.method;

public class AudiFactory implements IAutoFactory {
	private static AudiFactory container;
	
	private AudiFactory() {
		
	}
	@Override
	public AutoMobile make() {
		
		return new Audi();
	}
	public static AudiFactory getInstance() {
		if(container == null) {
			return new AudiFactory();
		}
		return container;
	}

}
