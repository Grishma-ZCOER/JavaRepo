package com.lti.exam.model;

import java.util.*;

public class QuestionBankLoader {
	
	public List<Question> loadQuetionOnjava(){
		QuestionBank qb = new QuestionBank();
		qb.addSubject("Java");
		Question q = new Question("What is Java?");
		List<Option> options = new ArrayList<Option>();
		options.add(new Option("Java is an OS",false));
		options.add(new Option("java is a Database",false));
		options.add(new Option("Java is a programming language",true));
		options.add(new Option("Java is a browser",false));
		q.setOptions(options);
		qb.addQuestion("Java", q);

		q = new Question("What is Object?");
		options = new ArrayList<Option>();
		options.add(new Option("Object is a collection",false));
		options.add(new Option("Object is a representation of a class",true));
		options.add(new Option("Object have a no responsibility",false));
		options.add(new Option("Object is a datatype",false));
		q.setOptions(options);
		qb.addQuestion("Java", q);
		
		q = new Question("String is _____ in Java");
		options = new ArrayList<Option>();
		options.add(new Option("a class",true));
		options.add(new Option("a primitive datatype",false));
		options.add(new Option("an object",false));
		options.add(new Option("None of these",false));
		q.setOptions(options);
		qb.addQuestion("Java", q);
		
		q = new Question("What id G1?");
		options = new ArrayList<Option>();
		options.add(new Option("G1 is Jeevan",false));
		options.add(new Option("G1 is a garbage collector",true));
		options.add(new Option("G1 is a next verion of Ra-one",false));
		options.add(new Option("G1 is paani",false));
		q.setOptions(options);
		qb.addQuestion("Java", q);

		return qb.getQuestionFor("Java");
	}
}
