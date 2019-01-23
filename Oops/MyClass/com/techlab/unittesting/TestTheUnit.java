package com.techlab.unittesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestTheUnit {

	@Test
	void cubetest() throws Exception {
		UnitTestingExample unit = new UnitTestingExample();
		int result = unit.cubeOfEven(-3);
		assertEquals(27,result);
		
	}

}
