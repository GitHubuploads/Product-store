package com.js.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.js.dao.CustomerCRUD;
import com.js.dao.ProductCRUD;
import com.js.dto.Product;
@WebServlet("/insert")

public class InsertProduct extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id = Integer.parseInt(req.getParameter("id"));
		String name= req.getParameter("name");
		String brand= req.getParameter("brand");
		double price =Double.parseDouble(req.getParameter("price"));
		int quantity= Integer.parseInt(req.getParameter("quantity"));
		
		Product p= new Product(id, name, brand, price, quantity);
		int res = ProductCRUD.InsertProduct(p);
		RequestDispatcher rd = req.getRequestDispatcher("result.jsp");
		if(res==1) {
			req.setAttribute("msg", "Product inserted successfully");
			rd.forward(req, resp);
		}
		else
		{
			req.setAttribute("msg", "Product inserted failed");
			rd.forward(req, resp);
		}	
	}

}
