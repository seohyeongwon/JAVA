<%@page import="jsp_exam01.Hello"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>won's</h1>
<%
out.println("<h3>welcome^^</h3>");
out.println(Hello.sayHello("철수"));
out.println(Hello.sayHello("영희"));

out.println(request.getServletContext().getRealPath("/"));
%>
</body>
</html>