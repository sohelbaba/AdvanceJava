import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;


public class Login extends HttpServlet{
	public void doPost(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException{

		String name = req.getParameter("unm");
		String Passw = req.getParameter("pass");

		PrintWriter out = res.getWriter();

		ServletContext context=getServletContext();
		String user=context.getInitParameter("user");
		String pss=context.getInitParameter("ps");

		out.println(name);
		out.println(pss);


	}
}