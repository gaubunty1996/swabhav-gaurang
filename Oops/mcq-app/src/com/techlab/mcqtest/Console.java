package com.techlab.mcqtest;

import java.io.IOException;
import java.util.Scanner;

import com.techlabs.mcq.QuestionBank;

public class Console {
	public static int winCount = 0;

	public static void main(String[] args) throws IOException {
		QuestionBank bank = new QuestionBank();
		Scanner sc = new Scanner(System.in);

		int total = bank.getQuestionsInRange(5).size();

		for (int i = 0; i < total; i++) {
			analyzeResult(bank, i);
		}
		System.out.println(
				"You got " + bank.getWinCount() + " questions correct " + " out of " + bank.getTotal() + " questions");
		System.out.println("Win percentage is: " + bank.returnWinPercentage(bank));

	}

	public static void analyzeResult(QuestionBank bank, int i) throws IOException {
		System.out.println(bank.getQuestions().get(i).getQuestionString() + "\n");
		System.out.println(bank.getQuestions().get(i).getOptions().getOption1() + "\n");
		System.out.println(bank.getQuestions().get(i).getOptions().getOption2() + "\n");
		System.out.println(bank.getQuestions().get(i).getOptions().getOption3() + "\n");
		System.out.println(bank.getQuestions().get(i).getOptions().getOption4() + "\n");
		System.out.println("Enter your answer as a ,b ,c , d");
		Scanner sc1 = new Scanner(System.in);
		String input = sc1.nextLine();
		bank.checkAnswers(bank, i, input);
	}

}
