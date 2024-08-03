package com.QA;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class question {
	@Id
	private int qId;
	private String Question;
	
	@OneToOne
	private Answer answer;

	public int getqId() {
		return qId;
	}

	public void setqId(int qId) {
		this.qId = qId;
	}

	public String getQuestion() {
		return Question;
	}

	public void setQuestion(String question) {
		Question = question;
	}

	public Answer getAnswer() {
		return answer;
	}

	public void setAnswer(Answer answer) {
		this.answer = answer;
	}

	public question(int qId, String question, Answer answer) {
		super();
		this.qId = qId;
		Question = question;
		this.answer = answer;
	}

	public question() {
		super();
		
	}
	

}
