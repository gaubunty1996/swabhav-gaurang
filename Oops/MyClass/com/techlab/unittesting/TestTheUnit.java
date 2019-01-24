package com.techlab.unittesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestTheUnit {

	@Test
	void NegativeOddTest() throws Exception {
		UnitTestingExample unit = new UnitTestingExample();
		try {
		int result = unit.cubeOfEven(-3);
		fail("This should throe exception");
		}
		catch(Exception e){
		assertEquals(e.getMessage(),"Dont pass negative numbers");
		}
	}
	@Test
	void PositiveOddTest() throws Exception {
		UnitTestingExample unit = new UnitTestingExample();
		try {
		int result = unit.cubeOfEven(3);
		fail("This should throw an exception");
		}catch(Exception e) {
		assertEquals("Dont pass odd numbers",e.getMessage());
		}
	}
	
	

}
