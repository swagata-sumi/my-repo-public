package com.form;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.*;



@WebServlet("/Form_Servlet")
public class Form_Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		PreparedStatement preparedStatement = null;
		ResultSet rs;
		
		String name=request.getParameter("usernm");
		String pass=request.getParameter("pass");
		
		try {
			Connection con=DB_connection.myConnection();			
			preparedStatement= con.prepareStatement("select*from formdatas where username=?");
			
			preparedStatement.setString(1, name);
			
			 rs=preparedStatement.executeQuery();
			
			if(rs.next()) {
				response.sendRedirect("welcome.html");
			}
			else {
				response.getWriter().println("please provide a valid username and password");
			}
			
			
		} catch (SQLException e) {
	
			e.printStackTrace();
		}
	}

	
	}

