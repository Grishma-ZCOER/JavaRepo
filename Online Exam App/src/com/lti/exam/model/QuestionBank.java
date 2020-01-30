package com.lti.exam.model;

import java.util.*;

public class QuestionBank {
	// key = subject, value = list of question for each subject 
	private Map<String, List<Question>> questionBank;
	
	public QuestionBank() {
		// TODO Auto-generated constructor stub
		questionBank = new HashMap<>();
	}
	
	// add the subject name
	public void addSubject(String subjectName) {
		questionBank.put(subjectName, new ArrayList<>());
	}
	
	// add the question based on subject
	public void addQuestion(String subjectName,Question question) {
		List<Question> questions = questionBank.get(subjectName);
		questions.add(question);
	}
	
	// get the question based on subject
	public List<Question> getQuestionFor(String subjectName) {
		return questionBank.get(subjectName);
	}
}
