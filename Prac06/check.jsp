<%@ page language="java" contentType="text/html" %>

<%
    String name = (String)session.getAttribute("user"); 
    int p = (Integer) session.getAttribute("price"); 
    out.println("<h1> Mr." + name + "</h1>");
    out.println("<h1>Total Amount is " + p  + "</h1>");
%>