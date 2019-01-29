package com.techlabs.mcq;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class QuestionBank {
	private ArrayList<Question> questions;

	public QuestionBank() {
		questions = new ArrayList<Question>();
		initialize();
	}

	public void initialize() {

		Options newOption1 = new Options("A)Color", "B)Animal", "C)Thing", "D)vehicle");
		questions.add(new Question("What is Blue?", newOption1, "A"));

		Options newOption2 = new Options("A)Color", "B)Animal", "C)Thing", "D)vehicle");
		questions.add(new Question("What is Red?", newOption2, "B"));

		Options newOption3 = new Options("A)Color", "B)Animal", "C)Thing", "D)vehicle");
		questions.add(new Question("What is Green?", newOption3, "A"));

		Options newOption4 = new Options("A)Color", "B)Animal", "C)Thing", "D)vehicle");
		questions.add(new Question("What is Black?", newOption4, "A"));

		Options newOption5 = new Options("A)Color", "B)Animal", "C)Thing", "D)vehicle");
		questions.add(new Question("What is Black?", newOption5, "A"));

		Options newOption6 = new Options("A)Color", "B)Animal", "C)Thing", "D)vehicle");
		questions.add(new Question("What is Black?", newOption6, "A"));

		Options newOption7 = new Options("A)Color", "B)Animal", "C)Thing", "D)vehicle");
		questions.add(new Question("What is Black?", newOption7, "A"));

		Options newOption8 = new Options("A)Color", "B)Animal", "C)Thing", "D)vehicle");
		questions.add(new Question("What is Black?", newOption8, "A"));

		Options newOption9 = new Options("A)Color", "B)Animal", "C)Thing", "D)vehicle");
		questions.add(new Question("What is Black?", newOption9, "A"));

		Options newOption10 = new Options("A)Color", "B)Animal", "C)Thing", "D)vehicle");
		questions.add(new Question("What is Black?", newOption10, "A"));

	}

	public ArrayList<Question> getQuestions() {
		return questions;
	}

	public String getQuestionById(UUID idNumber) {
		for (int i = 0; i < questions.size(); i++) {
			if (idNumber == questions.get(i).getQuestionid()) {
				return questions.get(i).getQuestionString();
			}
		}
		return null;

	}

	public ArrayList<Question> getQuestionsInRange(int range) {

		ArrayList<Question> customQuestionList = new ArrayList<Question>();
		for (int i = 0; i < range; i++) {
			customQuestionList.add(questions.get(i));
		}
		return customQuestionList;

	}

	

}
