<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean  id="a" class="backend.DBcode"></jsp:useBean>
<%@ page import="backend.DBcode" %>
<%

String name=request.getParameter("name");
int age=Integer.parseInt(request.getParameter("age"));
String gender=request.getParameter("g");
String qual=request.getParameter("qual");
String phone=request.getParameter("phone");
String address=request.getParameter("add");
String district=request.getParameter("dist");
int n= a.insert(name,age,gender,qual,phone,address,district);
String res=(n>0)? "Registered Successfully":"Not Registered";
%>
<%= res %>
</body>
</html>
