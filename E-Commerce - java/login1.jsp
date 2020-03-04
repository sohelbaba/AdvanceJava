<%@ page language="java" contentType="text/html"%>

<% 
    String username = request.getParameter("unm");
    String password = request.getParameter("ps");

    out.println(username);
    out.println(password);

    <!--    Login login = new Login();
    int res = login.authenticate(username,password);
-->
%>
