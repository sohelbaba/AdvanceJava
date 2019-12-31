import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;


public class Login extends HttpServlet{
	public void doPost(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException{

		String name = req.getParameter("unm");
		String Passw = req.getParameter("pass");
		PrintWriter out = res.getWriter();
		String username =  getServletConfig().getInitParameter("username"); 

		if(name.equals(username)){
			res.sendRedirect("product_list.html");
		}else{
			res.sendRedirect("login.html");
		}




	}
}