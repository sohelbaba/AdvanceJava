<!-- <%@ page language="java" contentType ="text/html" %> -->
<%@ page language="java" contentType="text/html"%>
<html>
    <head>
        <title>Currency Converter</title>
    </head>
    <body>
        <pre>
            <% 
                
                int amount = Integer.parseInt(request.getParameter("amount"));
                int Converter = Integer.parseInt(request.getParameter("curr"));
                out.println("");
                out.println("Amount In Ruppe : " + amount);
                out.println("Converter Rate : " + Converter);
                out.println("Converted Amount : " + amount * Converter);
            %>
        </pre>
    </body>
</html>