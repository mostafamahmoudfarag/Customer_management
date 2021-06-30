package io.mostafa.cutomermanagement.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import io.mostafa.customermanagement.bean.Customer;
import io.mostafa.cutomermanagement.dao.CustomerDao;

@WebServlet("/updateandredirect")
public class updateandredirect extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    int id=Integer.parseInt(request.getParameter("id"));
    String customername=request.getParameter("username");
    String country=request.getParameter("country");
    String city=request.getParameter("city");
    String address=request.getParameter("address");
    int tax_number=Integer.parseInt(request.getParameter("tax_number"));
    Customer c=new Customer(id,customername,country,city,address,tax_number);
    new CustomerDao().updatecustomer(c);
    response.sendRedirect("home.jsp");
	
	}

}
