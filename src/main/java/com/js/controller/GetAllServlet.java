package com.js.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.js.dao.ProductCRUD;
import com.js.dto.Product;


@WebServlet("/view")
public class GetAllServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ProductCRUD pcrud = new ProductCRUD();
		ArrayList<Product> al = pcrud.getAllProducts();
		if(al.size()>0) {
			RequestDispatcher rd = req.getRequestDispatcher("View.jsp");
			req.setAttribute("output", al);
			rd.forward(req, resp);
		}else {
			RequestDispatcher rd = req.getRequestDispatcher("result.jsp");
			req.setAttribute("msg", "No Products Available");
			rd.forward(req,resp);
		}
	}
}
