package com.form;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		
////		response.getWriter().append("Served at: ").append(request.getContextPath());
//	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			Connection con=DB_connection.myConnection();
			
		String username=request.getParameter("unm");
		String address=request.getParameter("adr");
		String email=request.getParameter("eml");
		
//		request.setAttribute("u", username);
		PreparedStatement prstatement=con.prepareStatement("insert into formdatas values(?,?,?)");
		prstatement.setString(1, username);
		prstatement.setString(2, address);
		prstatement.setString(3, email);
		
		int i=prstatement.executeUpdate();
			if(i>0) {
//				request.getRequestDispatcher("welcome.html").forward(request, response);
				response.sendRedirect("index.html");
			}else {
				
				response.sendRedirect("error.html");
			}
		
		} 
		catch (SQLException e) {
			
			e.printStackTrace();
		}
	}

}
