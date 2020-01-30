<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<style type="text/css">
	h1{
	  color:orange;
	}
	h2{
	  color: navy;
	}
	h3{
	  color: green;
	}

</style>
</head>
<body>
<center>
<%
	Integer score = (Integer) session.getAttribute("score");
%>
<h4>Your Score is : <%= score %></h4>
<h1>Thank You</h1>
<h2>You can take leave now</h2>
<h3>Go Home and Sleep</h3>
</center>
<%
//session.setAttribute("score", 0);
session.removeAttribute("score");
%>>
</body>
</html>