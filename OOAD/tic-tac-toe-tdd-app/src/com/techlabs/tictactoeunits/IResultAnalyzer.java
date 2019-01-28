package com.techlabs.tictactoeunits;

public interface IResultAnalyzer {

	CurrentGameState checkIfWon(Game game);

	boolean checkIfFirstRowIsSame(IBoard gameboard);

	boolean checkIfSecondRowIsSame(IBoard gameboard);

	boolean checkIfThirdRowIsSame(IBoard gameboard);

	boolean checkIfFirstColumnIsSame(IBoard gameboard);

	boolean checkIfSecondColumnIsSame(IBoard gameboard);

	boolean checkIfThirdColumnIsSame(IBoard gameboard);

	boolean checkIfFirstDiagonalIsSame(IBoard gameboard);

	boolean checkIfSecondDiagonalIsSame(IBoard gameboard);

}