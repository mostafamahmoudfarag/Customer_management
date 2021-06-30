package io.mostafa.cutomermanagement.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import io.mostafa.customermanagement.bean.Customer;
import io.mostafa.cutomermanagement.dao.CustomerDao;

/**
 * Servlet implementation class addCustomer
 */
@WebServlet("/addnewcustomer")
public class addCustomer extends HttpServlet {

	protected void doPost(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
		String username=req.getParameter("username");
		int tax_number=Integer.parseInt(req.getParameter("tax_number"));
		String city=req.getParameter("city");
		String country=req.getParameter("country");
		String address=req.getParameter("address");
		CustomerDao service=new CustomerDao();
		Customer c=new Customer(username,country,city,address,tax_number);
		service.insert(c);
	response.sendRedirect("home.jsp");
	}

}
