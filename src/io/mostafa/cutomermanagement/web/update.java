package io.mostafa.cutomermanagement.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import io.mostafa.customermanagement.bean.Customer;
import io.mostafa.cutomermanagement.dao.CustomerDao;

/**
 * Servlet implementation class update
 */
@WebServlet("/update")
public class update extends HttpServlet {

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	int id=Integer.parseInt(request.getParameter("id"));
	CustomerDao customerDao=new CustomerDao();
	Customer customer=customerDao.getCustomer(id);
	System.out.println(customer.getId()+" "+customer.getAddress());
	HttpSession session=request.getSession();
	session.setAttribute("customer", customer);
	response.sendRedirect("update.jsp");
	
	
	}


}
