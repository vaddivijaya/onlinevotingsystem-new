package OnlineVotingSystem;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Vote2 extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		DatabaseManager2 db = new DatabaseManager2();
		java.sql.Connection  con = db.getConnection();
		
		String voter_card_number = request.getParameter("voterNumber");
		String party = request.getParameter("party");
		System.out.println(party);
		
		try {
            
        	PreparedStatement preparedStatement = con.prepareStatement("insert into vote(voter_card_number,party)values ('"+voter_card_number+"','"+party+"')");
        	
        	preparedStatement.executeUpdate();
          
            response.sendRedirect("index.jsp");
            
        } catch (SQLException e) {
        	out.println(e.getMessage());
        }
	}

}