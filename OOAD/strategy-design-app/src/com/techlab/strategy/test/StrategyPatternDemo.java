package com.techlab.strategy.test;

import com.techlab.strategy.Context;
import com.techlab.strategy.OperationAdd;
import com.techlab.strategy.OperationMultiply;
import com.techlab.strategy.OperationSubstract;

public class StrategyPatternDemo {

	public static void main(String[] args) {
		Context context = new Context(new OperationAdd());		
	      System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

	      context = new Context(new OperationSubstract());		
	      System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

	      context = new Context(new OperationMultiply());		
	      System.out.println("10 * 5 = " + context.executeStrategy(10, 5));

	}

}
