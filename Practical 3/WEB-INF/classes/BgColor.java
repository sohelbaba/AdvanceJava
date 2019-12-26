import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;


public class BgColor extends HttpServlet
{
	private String uname;
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException,IOException
	{
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		ServletConfig conf=getServletConfig();
		res.setIntHeader("Refresh",1);

		uname = req.getParameter("txtuname");

		String s1=conf.getInitParameter("color");

		out.println("Username = " + uname + " Color = " + s1 + "Hello");
		out.println("<html><body style='background-color:" + s1 + ";color:white'>Hello Welcome</body></html>" );

		out.close();

	}

}