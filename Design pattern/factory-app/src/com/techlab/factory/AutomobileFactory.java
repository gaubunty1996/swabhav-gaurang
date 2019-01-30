package com.techlab.factory;

public class AutomobileFactory {
	
	static AutomobileFactory newInstance;
	private AutomobileFactory() {
	}	
	public IAutomobile make(AutoConfigType type) {
		if(type==AutoConfigType.AUDI) {
			return new Audi();
		}
		if(type==AutoConfigType.BMW) {
			return new Bmw();
		}
		return new MiniCopper();
	}
	public static AutomobileFactory getNewInstance() {
		if(newInstance==null) {
		newInstance=new AutomobileFactory();
		}
		return newInstance;
	}
}
