package com.lti.exam.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.lti.exam.model.Option;
import com.lti.exam.model.Question;
import com.lti.exam.model.QuestionBankLoader;

/**
 * Servlet implementation class LoadQuestionServlet
 */
@WebServlet("/LoadQuestionServlet")
public class LoadQuestionServlet extends HttpServlet {
	
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		QuestionBankLoader qbLoader = new QuestionBankLoader();
		List<Question> questions = qbLoader.loadQuetionOnjava();
		HttpSession session = request.getSession();
		Integer qNo = (Integer) session.getAttribute("QNo");
		session.setAttribute("noOfQuestion", questions.size());
		if(qNo==null)
			qNo=0; 
		
		if(qNo < questions.size()){
			Question q = questions.get(qNo++);  //qNO++ means go to the next Question
		    session.setAttribute("currentQs", q);
			session.setAttribute("QNo", qNo);
			response.sendRedirect("ShowQuestion.jsp");
		}
		else{
			response.sendRedirect("Result.jsp");
		}
	}

}
