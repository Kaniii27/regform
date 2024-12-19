<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="a" class="backend.DBcode"></jsp:useBean>
<%@ page import="backend.DBcode,backend.Student,java.util.*" %>
<%
out.println("<table border='2' rules='all'>");
ArrayList<Student> s=new ArrayList<Student>();
s=a.select();
out.println("<tr><th>NAME</th><th>AGE</th><th>GENDER</th><th>QUALIFICATION</th><th>CONTACT</th><th>ADDRESS</th><th>DISTRICT</th></tr>");
for(Student st:s){
out.println("<tr>");
out.println("<td>"+st.getName()+"</td>");
out.println("<td>"+st.getAge()+"</td>");
out.println("<td>"+st.getGender()+"</td>");
out.println("<td>"+st.getQual()+"</td>");
out.println("<td>"+st.getPhone()+"</td>");
out.println("<td>"+st.getAddress()+"</td>");
out.println("<td>"+st.getDistrict()+"</td>");
out.println("<td><a href='Register.html'>Home</a></td>");


out.println("</tr>");
}
out.println("</table>");

%>
</body>
</html>
