package com.QA;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class map 
{
	public static void main (String[]args) {
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();

		question q1 = new question();
		q1.setqId(10);
		q1.setQuestion("what is python");

		Answer a1 = new Answer();
		a1.setAnswerID(11);
		a1.setAnswer("python is a programing language");
		q1.setAnswer(a1);
		
		org.hibernate.Session s = factory.openSession();
		org.hibernate.Transaction tx1 = s.beginTransaction();
		s.save(q1);
		s.save(a1);
		

		tx1.commit();

		question Q = s.get(question.class, 5);
		System.out.println(Q.getQuestion());
		System.out.println(Q.getqId());



		s.close();
	}

}
