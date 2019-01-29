package com.techlabs.mcq;

import java.rmi.server.UID;
import java.util.List;
import java.util.UUID;

public class Question {
	private UUID questionid;
	private String questionString;
	Options options;
	private String answer;
	
	public Question(String questionString,Options options,String answer) {
		super();
		this.questionid = UUID.randomUUID();
		this.questionString = questionString;
		this.options=options;
		this.answer = answer;
	}

	public UUID getQuestionid() {
		return questionid;
	}

	public String getAnswer() {
		return answer;
	}

	public String getQuestionString() {
		return questionString;
	}

	public Options getOptions() {
		return options;
	}
	
	
}
