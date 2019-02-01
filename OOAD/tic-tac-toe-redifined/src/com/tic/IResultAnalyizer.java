package com.tic;

public interface IResultAnalyizer {

	Result checkResult();

	boolean isHorizontal();

	boolean isVertical();

	boolean isDiagonal();

	Result getResult();

	IBoard getBoard();

}