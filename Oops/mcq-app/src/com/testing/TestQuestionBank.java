package com.testing;

import java.io.IOException;
import java.util.ArrayList;

import com.techlabs.mcq.Question;
import com.techlabs.mcq.QuestionBank;

public class TestQuestionBank {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		QuestionBank bank = new QuestionBank();
		
		System.out.println(bank.getQuestions().get(0).getQuestionid());
		
		System.out.println(bank.getQuestionById(bank.getQuestions().get(0).getQuestionid()));
		
		for (int i =0;i<bank.getQuestions().size();i++) {
			System.out.println(bank.getQuestions().get(i).getQuestionString());
		}
		ArrayList<Question> newCustomList = bank.getQuestionsInRange(4);
		System.out.println("\n");
		for(int i=0;i<newCustomList.size();i++) {
			System.out.println(newCustomList.get(i).getQuestionString());
		}
	}

}
