<%@page import="java.time.LocalTime"%>
<%@page import="java.time.LocalDate"%>
<%@page import="com.lti.exam.model.Option"%>
<%@page import="com.lti.exam.model.Question"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Kabhi Haar Nahi Mante</title>
</head>
<body>
<form action="CalculateScoreServlet">
<%
	Question q = (Question)session.getAttribute("currentQs");
    Integer q1 = (Integer)session.getAttribute("QNo");
    
%>

<h3>Q.<%= q1 %> <%= q.getQuestion() %></h3>

<% 
int opNo = 0;
for(Option op : q.getOptions()){
%>
<input type="radio" name = "selected" value="<%= opNo++ %>"/> <%= op.getOption() %><br />
<%
	}
%>

<%
Integer noOfQuestion=(Integer) session.getAttribute("noOfQuestion");
Integer currentQno = (Integer) session.getAttribute("QNo");

String btnLabel="Continue";
if(currentQno==noOfQuestion)
	btnLabel="Finish";
%>
<button type="submit"><%= btnLabel %></button>
<!--  <a href="LoadQuestionServlet">Continue</a> -->
</form>
</body>
</html>