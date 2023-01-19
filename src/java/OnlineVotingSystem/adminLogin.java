/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package OnlineVotingSystem;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author vijaya
 */
@WebServlet(name = "adminLogin", urlPatterns = {"/adminLogin"})
public class adminLogin extends HttpServlet {
    public adminLogin(){
        super();
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        String adminName = request.getParameter("adminName");
        String password = request.getParameter("password");
        
        DatabaseManager2 db = new DatabaseManager2();
		java.sql.Connection  con = db.getConnection();
        
		try{
			
			PreparedStatement preparedStatement = con.prepareStatement("select * from admin where adminName = '"+adminName+"' and adminPass = '"+password+"'");
			ResultSet rs=((java.sql.Statement) preparedStatement).executeQuery("select * from admin where adminName = '"+adminName+"' and adminPass = '"+password+"'");
			   
			if(rs.next())
			   {
				   HttpSession session=request.getSession();
				   session.setAttribute("adminName", adminName);
				   response.sendRedirect("adminWelcome.jsp");
			     }
			   else  
			   {
				   out.println("WRONG CREDENTIALS");
			   }
		   }
		   catch (Exception e) {
	             out.println(e.getMessage());
		   }
	}

}
