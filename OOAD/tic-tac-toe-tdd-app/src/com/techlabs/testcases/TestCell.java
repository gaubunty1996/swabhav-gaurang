package com.techlabs.testcases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.techlabs.tictactoeunits.Cell;
import com.techlabs.tictactoeunits.Mark;

class TestCell {

	@Test
	void createCell() throws Exception {
		Cell cell = new Cell();
		cell.setMark(Mark.CROSS);
		Mark result =cell.getMark(); 
		assertEquals(Mark.CROSS, result);
		
	}
	/*@Test
	void checkCellisEmpty() {
		Cell cell = new Cell();
		Mark result =cell.getMark(); 
		assertEquals(null, result);
	}*/
	@Test
	void checkIfAlreadyMarked() throws Exception {
		Cell cell = new Cell();
		cell.setMark(Mark.CROSS);
		Mark expectedmark=cell.getMark();
		
		assertEquals(Mark.CROSS,expectedmark);
	}
	
}
