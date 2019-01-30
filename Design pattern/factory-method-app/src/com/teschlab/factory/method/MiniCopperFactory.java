package com.teschlab.factory.method;

public class MiniCopperFactory implements IAutoFactory {
	private static MiniCopperFactory container;
	private MiniCopperFactory() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public AutoMobile make() {
		
		return new MiniCopper();
	}
	public static MiniCopperFactory getContainer() {
		if(container == null) {
			return new MiniCopperFactory();
		}
		return container;
	}
	

}
