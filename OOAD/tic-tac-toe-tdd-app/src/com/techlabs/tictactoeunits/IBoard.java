package com.techlabs.tictactoeunits;

public interface IBoard {

	Cell[] getBoard();

	boolean checkIfFull();

	boolean checkIfEmpty();

	void setMarkatCustomLocation(int index, Mark mark) throws Exception;

	Mark getMarkfromLocation(int index);

	int getSizeOfBoard();

	boolean isCellEmpty(int index);

}