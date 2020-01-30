<%@ page language="java" contentType="text/html" %>
<jsp:include page="datetime.jsp" />  
<%! static int total = 0; 
    int price1 = 0;
    int price2 = 0;
    int price3 = 0;
    int price4 = 0;
    int price5 = 0;
%>
<%

   session.setAttribute("user",request.getParameter("nm"));  
   String p1 = request.getParameter("p1");
   String p2 = request.getParameter("p2");
   String p3 = request.getParameter("p3");
   String p4 = request.getParameter("p4");
   String p5 = request.getParameter("p5");

   int p1price = Integer.parseInt(request.getParameter("p1price"));
   int p2price = Integer.parseInt(request.getParameter("p2price"));
   int p3price = Integer.parseInt(request.getParameter("p3price"));
   int p4price = Integer.parseInt(request.getParameter("p4price"));
   int p5price = Integer.parseInt(request.getParameter("p5price"));

   out.print("<h1>Your Selected items into Cart Mr." + request.getParameter("nm") + "</h1>");

   
    if(p1 != null){
        out.println("Product Name : " + p1); 
        out.println("Product Price : " + p1price + "<br>");
        price1 = p1price * Integer.parseInt(request.getParameter("p1q"));
        
    }
    if(p2 != null){
        out.println("Product Name : " + p2); 
        out.println("Product Price : " + p2price + "<br>");
        price2 = p2price* Integer.parseInt(request.getParameter("p2q"));
    }
    if(p3 != null){
        out.println("Product Name : " + p3); 
        out.println("Product Price : " + p3price + "<br>");
        price3 = p3price* Integer.parseInt(request.getParameter("p3q"));
    }
    if(p4 != null){
        out.println("Product Name : " + p4); 
        out.println("Product Price : " + p4price + "<br>");
        price4 = p4price * Integer.parseInt(request.getParameter("p4q"));
    }
    if(p5 != null){
        out.println("Product Name : " + p5); 
        out.println("Product Price : " + p5price + "<br>"); 
        price5 = p5price* Integer.parseInt(request.getParameter("p5q"));
    }
     
    total = price1 + price2 + price3 + price4 + price5;
    session.setAttribute("price",total);  
    
  
%>
<pre>
<form action="check.jsp" method="post">
    <input type="submit" name="checkout" value="Check Out">
  
    <a href="index.html">BACK</a>
</form>
</pre>