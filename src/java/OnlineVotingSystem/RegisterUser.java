/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package OnlineVotingSystem;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "RegisterUser", urlPatterns = {"/RegisterUser"})
public class RegisterUser extends HttpServlet {

  
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
		
        try (PrintWriter out = response.getWriter()) {
        	
           String name = request.getParameter("name");
           String voter_card_number = request.getParameter("voternumber");
           String address = request.getParameter("address");
           String dob = request.getParameter("dob");
           String contact = request.getParameter("number");
           String email = request.getParameter("email");
           
           
           DatabaseManager2 db = new DatabaseManager2();
		   java.sql.Connection  con = db.getConnection();
		   
          PreparedStatement preparedStatement = con.prepareStatement("insert into voters (name,pnumber,email,addrs,dob,voter_card_number)values('"+name+"','"+contact+"','"+email+"','"+address+"','"+dob+"','"+voter_card_number+"')");
		  preparedStatement.executeUpdate();
		  out.println("registration success");
		  response.sendRedirect("index.jsp");
        
        } catch (SQLException ex) {
        	System.out.println(ex.getMessage());
        } 
      
    }

   

}
