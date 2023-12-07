package in.sp.frontend;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@WebServlet("/Signup")
public class Signup extends HttpServlet
{
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
	String name =req.getParameter("name1");
	String email =req.getParameter("Email1");
	String password=req.getParameter("password1");
	String gender =req.getParameter("gender1");
	String city =req.getParameter("city1");
	
	
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/form?autoReconnect=true&useSSL=false","root","9687")
        
		PreparedStatement ps = con.prepareStatement("insert into signup values(?,?,?,?,?)")	;
		ps.setString(1,name);
		ps.setString(2,email);
		ps.setString(3,password);
		ps.setString(4,gender);
		ps.setString(5,city);
		
		ps.executeupdate();
		
		if(count>0) {
			
			resp.setContentType("text/html");
			out.print("<h3 style = 'color:green'>user signup successfully</h3>");
			RequestDispatcher rd = req.getRequestDispatcher("/signup.jsp");
            rd.include(req,resp);		
		}
		else
		{
			resp.setContentType("text/html");
			out.print("<h3 style = 'color:blue'>user not signup successfully</h3>");
			RequestDispatcher rd = req.getRequestDispatcher("/signup.jsp");
            rd.include(req,resp);
			
		}
		
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	}
	}
	       
	

		