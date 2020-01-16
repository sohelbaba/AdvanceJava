<%@ page language="java" contentType="text/html"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>First JSP</title>
</head>
<%@ page import="java.util.Date" %>
<body>
<PRE>
<h1>MOHAMMED SOHEL MULLA</h1>

NAME : <% out.print(request.getParameter("name")); %>
SURNAME : <% out.print(request.getParameter("sname")); %>
ADDRESS : <% out.print(request.getParameter("add")); %>
MOBILE : <% out.print(request.getParameter("number")); %>
<strong>Current Time is</strong>: <%=new Date() %>
</PRE>
</body>
</html>
