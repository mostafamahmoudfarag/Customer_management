package io.mostafa.cutomermanagement.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import io.mostafa.customermanagement.bean.Customer;
import io.mostafa.cutomermanagement.dao.CustomerDao;

@WebServlet("/delete")
public class delete extends HttpServlet {
	

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int i=Integer.parseInt(request.getParameter("id"));
		new CustomerDao().deletecustomer(i);
		response.sendRedirect("home.jsp");
	}


}
