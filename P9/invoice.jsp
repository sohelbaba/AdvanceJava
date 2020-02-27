<%@ page language="java" contentType="text/html" errorPage="error.jsp" %>

<%!  
    int p1,p2,p3,p4,p5 = 0;
    int gst = 0;
    float gstprice = 0.0f;
    int total = 0; 
    float netprice = 0.0f;
%>

<% 
    p1 = Integer.parseInt(request.getParameter("p1"));
    p2 = Integer.parseInt(request.getParameter("p2"));
    p3 = Integer.parseInt(request.getParameter("p3"));
    p4 = Integer.parseInt(request.getParameter("p4"));
    p5 = Integer.parseInt(request.getParameter("p5"));
    gst = Integer.parseInt(request.getParameter("gst"));
    
    out.println("Price 1 : " + p1);
    out.println("Price 2 : " + p2);
    out.println("Price 3 : " + p3);
    out.println("Price 4 : " + p4);
    out.println("Price 5 : " + p5);
    out.println("GST : " + gst);

    total = p1 + p2 + p3 + p4 + p5;
    gstprice = (total * gst )/100;
    netprice  = total + gstprice;

    out.println("Basic : " + total);
    out.print("GST : " + gstprice );
    out.println("Total Amount with GST  : " + netprice);

%>