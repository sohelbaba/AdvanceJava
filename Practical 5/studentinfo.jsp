<%@ page language="java" contentType="text/html"%>
<html>
<head>
<title>RESULT INFO</title>
</head>
<%@ page import="java.util.*" %>
<body>
    <pre>
        <%
        
        int cpp = Integer.parseInt(request.getParameter("cpp"));
        int c = Integer.parseInt(request.getParameter("c"));
        int java = Integer.parseInt(request.getParameter("java"));
        int php = Integer.parseInt(request.getParameter("php"));
        int asp = Integer.parseInt(request.getParameter("asp"));
        
        out.println("Name : "  +   request.getParameter("name"));
        out.println("Cpp : " + cpp) ;
        out.println("C : " + c) ;
        out.println("JAVA : " + java) ;
        out.println("Php : " + php) ;
        out.println("ASp : " + asp) ;
        
        int tot  = cpp + c + java + php + asp;
        float per = tot / 5;
        out.println("TOTAL : " + tot);
        out.println("PERCENATAGE : " + per);
        
        String result = "";
        if (per > 75){
            result = "Distinction";
        }else if(per > 65 && per < 50){
            result = "First Class";
        }else if(per > 50 && per < 40){
            result = "Second Class";
        }else if(per > 40 && per < 33){
            result = "Second Class";
        }else{
            result="Fail";
        }

        out.println("RESULT : " + result);
        %>
        
    </pre>
</body>
</html>