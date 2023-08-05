package com.js.controller;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.js.dao.CustomerCRUD;
import com.js.dto.Customer;
@WebServlet("/register")

public class InsertServlet extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int id = Integer.parseInt(req.getParameter("id"));
		String name= req.getParameter("name");
		String email= req.getParameter("email");
		int pwd= Integer.parseInt(req.getParameter("pwd"));
		long phone = Long.parseLong(req.getParameter("phone"));
		
		Customer c = new Customer(id, name, email, pwd, phone);
		int res = CustomerCRUD.insertCustomer(c);
		RequestDispatcher rd = req.getRequestDispatcher("result.jsp");
		if(res>0) {
			req.setAttribute("msg", "Register Successfully");
			rd.forward(req, resp);
		}
		else
		{
			req.setAttribute("msg", "Register Failed");
			rd.forward(req, resp);
		}	
		
	}



	}


