package com.techlab.mcqtest;

import java.util.Scanner;

import com.techlabs.mcq.QuestionBank;

public class Console {
	public static int winCount = 0;

	public static void main(String[] args) {
		QuestionBank bank = new QuestionBank();
		Scanner sc = new Scanner(System.in);

		int total = bank.getQuestionsInRange(5).size();

		for (int i = 0; i < total; i++) {
			analyzeResult(bank, i);
		}
		float winPercentage = (100 / total) * winCount ;
		System.out.println("You got " + winCount + " questions correct " + " out of " + total + " questions");
		System.out.println("Win percentage is: " + winPercentage);

	}

	public static void analyzeResult(QuestionBank bank, int i) {
		System.out.println(bank.getQuestions().get(i).getQuestionString() + "\n");
		System.out.println(bank.getQuestions().get(i).getOptions().getOption1() + "\n");
		System.out.println(bank.getQuestions().get(i).getOptions().getOption2() + "\n");
		System.out.println(bank.getQuestions().get(i).getOptions().getOption3() + "\n");
		System.out.println(bank.getQuestions().get(i).getOptions().getOption4() + "\n");
		System.out.println("Enter answer as A) ,B) ,C) , D)");
		Scanner sc1 = new Scanner(System.in);
		String input = sc1.nextLine();
		if (bank.getQuestions().get(i).getAnswer().toString().startsWith(input)) {
			winCount++;
		}
	}

}
