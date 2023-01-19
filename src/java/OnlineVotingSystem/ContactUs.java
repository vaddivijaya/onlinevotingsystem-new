/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package OnlineVotingSystem;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.PreparedStatement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author vijaya
 */
@WebServlet(name = "ContactUs", urlPatterns = {"/ContactUs"})
public class ContactUs extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        DatabaseManager2 db = new DatabaseManager2();
	java.sql.Connection  con = db.getConnection();
        
        String name=request.getParameter("name");
	    String pnumber=request.getParameter("number");
	    String email=request.getParameter("email");
	    String comment=request.getParameter("comment");
            
             try {
	    	PreparedStatement preparedStatement = con.prepareStatement("insert into contact(name,pnumber,email,cment)values('"+name+"','"+pnumber+"','"+email+"','"+comment+"')");
			preparedStatement.executeUpdate();
			response.sendRedirect("index.jsp");
	    } catch (Exception e) {
			e.printStackTrace();
		}
    }
    
}
