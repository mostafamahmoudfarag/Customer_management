package io.mostafa.customermanagement.bean;

public class Customer {
private int id ;
private String customer_name;
private String country;
private String city;
private String address;
private int tax_number;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}

public String getCustomer_name() {
	return customer_name;
}
public void setCustomer_name(String customer_name) {
	this.customer_name = customer_name;
}
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public int getTax_number() {
	return tax_number;
}
public void setTax_number(int tax_number) {
	this.tax_number = tax_number;
}
public Customer(int id, String customer_name, String country, String city, String address, int tax_number) {
	super();
	this.id = id;
	this.customer_name = customer_name;
	this.country = country;
	this.city = city;
	this.address = address;
	this.tax_number = tax_number;
}
public Customer(String customer_name, String country, String city, String address, int tax_number) {
	super();
	this.customer_name = customer_name;
	this.country = country;
	this.city = city;
	this.address = address;
	this.tax_number = tax_number;
}
public Customer() {
	super();
	// TODO Auto-generated constructor stub
}

}
