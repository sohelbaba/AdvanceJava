<%@ page language="java" contentType="text/html" %>
<%
   String username = request.getParameter("unm");
   String password = request.getParameter("ps");

   String[] user = {"admin","ADMIN","mcaadmin","bcaadmin","dduadmin"};
   String[] pass = {"admin123","ADMIN123","mcaadmin123","bcaadmin123","dduadmin123"};

    for(int i=0;i<user.length;i++){
        if(username.equals(user[i]) && password.equals(pass[i])){
            out.println("Login Sucessfull");
            break;
        }else{
            out.println("Not Login");
            break;
        }
    }
   
%>