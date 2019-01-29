package com.techlabs.mcq;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class QuestionBank {
	private ArrayList<Question> questions;
	private int winCount;
	private int total;
	private float winPercentage;

	public int getWinCount() {
		return winCount;
	}

	public int getTotal() {
		return total;
	}

	public float getWinPercentage() {
		return winPercentage;
	}

	public QuestionBank() throws IOException {
		questions = new ArrayList<Question>();
		// initialize();
		initializeCsv();

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

		System.out.println("Hi");

	}

	public void initializeCsv() throws IOException {
		String fileName = "C:\\Users\\gaurang\\Desktop\\listofquestions.csv";
		File file = new File(fileName);
		BufferedReader br = new BufferedReader(new FileReader(file));
		String st;
		while ((st = br.readLine()) != null) {
			st = st.toLowerCase();
			String[] names = st.split(",");
			Options newOption = new Options(names[1].substring(1, names[1].length() - 1),
					names[2].substring(1, names[2].length() - 1), names[3].substring(1, names[3].length() - 1),
					names[4].substring(1, names[4].length() - 1));
			questions.add(new Question(names[0].substring(1, names[0].length() - 1), newOption,
					names[5].substring(1, names[5].length() - 1)));
		}
		// System.out.println("\n");
		br.close();
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

	public void checkAnswers(QuestionBank bank, int i, String input) throws IOException {
		total = bank.getQuestionsInRange(5).size();
		if (bank.getQuestions().get(i).getAnswer().toString().startsWith(input)) {
			winCount++;
		}

	}

	public float returnWinPercentage(QuestionBank bank) {
		winPercentage=(100 / bank.getTotal()) * bank.getWinCount();
		return winPercentage;
	}

}
