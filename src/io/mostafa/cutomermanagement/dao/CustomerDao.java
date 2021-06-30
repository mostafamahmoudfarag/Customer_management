package io.mostafa.cutomermanagement.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import io.mostafa.customermanagement.bean.Customer;
public class CustomerDao {
private String Url="jdbc:mysql://localhost:3306/customer";
private String username="root";
private String password="123456";
private static final String Insert_Customer="insert into customers"
		+ "(customer_name,country,city,address,tax_number) values(?,?,?,?,?) ";
private static final String select_customerByid="select * from customers where id=?";
private static final String select_allCustomers="select * from customers";
private static final String update_customer="update customers set customer_name=? ,country=?,city=?,address=?,tax_number=? where id=?";
private Connection getConnection() {
	Connection conn=null;
	try {
	Class.forName("com.mysql.jdbc.Driver");
	
		conn=DriverManager.getConnection(Url,username,password);
	} catch (Exception e) {
	System.out.println(e.getMessage());
	}
	return conn;
}
public List<Customer> allCustomer(){
	List<Customer> l=new LinkedList<Customer>();
	try {
		PreparedStatement ps=getConnection().prepareStatement(select_allCustomers);
	ResultSet rs=ps.executeQuery();
	
	while(rs.next()) {
		l.add(new Customer(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getInt(6)));

	}
	
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
	return l;
}

public void insert(Customer c)  {
	System.out.println("insert method");
	try {
		PreparedStatement ps=getConnection().prepareStatement(Insert_Customer);
	ps.setString(1, c.getCustomer_name());
	ps.setString(2, c.getCountry());
	ps.setString(3, c.getCity());
	ps.setString(4, c.getAddress());
	ps.setInt(5, c.getTax_number());
	System.out.println(ps);
	ps.executeUpdate();
	
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
}
public void deletecustomer(int id) {
	try {
		PreparedStatement ps=getConnection().prepareStatement("delete from customers where id=?");
	ps.setInt(1, id);
	ps.executeUpdate();
	
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}	
}
public Customer getCustomer(int id )
{
	Customer c=new Customer();
	
	try {
		PreparedStatement ps=getConnection().prepareStatement(select_customerByid);
		ps.setInt(1, id);
	ResultSet rs=ps.executeQuery();
while(rs.next()) {
	c.setId(rs.getInt(1));
    c.setCustomer_name(rs.getString(2));
    c.setCountry(rs.getString(3));
    c.setCity(rs.getString(4));
    c.setAddress(rs.getString(5));
    c.setTax_number(rs.getInt(6));
}
	} catch (Exception e) {

	System.out.println(e.getMessage());
	}
	return c;
	
}
public void updatecustomer(Customer c) {
	
	try {
		PreparedStatement ps=getConnection().prepareStatement(update_customer);
	ps.setString(1, c.getCustomer_name());
	ps.setString(2, c.getCountry());
	ps.setString(3, c.getCity());
	ps.setString(4, c.getAddress());
	ps.setInt(5, c.getTax_number());
	ps.setInt(6, c.getId());
	System.out.println(ps);
	ps.executeUpdate();
	
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
}
}
