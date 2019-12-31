import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ProductShow extends HttpServlet{
    public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException{
      
        PrintWriter out = res.getWriter();    

        int mprice = 1800;
        int mqan = 3;

        if(req.getParameter("mcheck") != null){
            out.println("Mobile Selectd.");
            out.println("INVOICE");
            out.println("ITEM NAME : MOBILE");
            out.println("ITEM PRICE : "+mprice);
            out.println("ITEM QUANTITY : "+mqan);
            out.println("CGST : 18%");
            out.println("SGST : 18%");
            double tot = mqan * mprice;
            out.println("TOTAL AMOUNT : " + tot);     
        }


       
        
    
    }
}