<%@ page language="java" contentType="text/html; charset=windows-1256"
    pageEncoding="windows-1256"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="java.util.List,io.mostafa.cutomermanagement.dao.CustomerDao" %>
<%@ page import="io.mostafa.customermanagement.bean.Customer" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="windows-1256">
<title>all customers</title>
<style>
a{
margin: 50px;
margin-top:50px;
size: 30px
}

caption {
	font-size: 30px;
	color: blue;
	
}
td{
text-align: center}
th{
padding:15px
}
</style>
</head>
<body>
<a href="newcustomer.jsp" ><input type ="button" width="100px" height="40px" value="add Customer"></a>
<%
List<Customer>list=new CustomerDao().allCustomer();
session.setAttribute("list", list);
%>

<table border="1px" width="600px">
<caption>Customers</caption>
<tr>
<th>Cust_Id</th>
<th>Cust_name</th>
<th>Cust_country</th>
<th>Cust_city</th>
<th>Cust_address</th>
<th>Cust_taxNumber</th>
<th>Actions</th>
</tr>
<c:forEach items="${list }" var="i">
<tr>
<td>${i.id }</td>
<td>${i.customer_name }
<td>${i.country }</td>
<td>${i.city }</td>
<td>${i.address }</td>
<td>${i.tax_number }</td>
 <td>
 <a href="update?id=${i.id }">update</a>
 <a href="delete?id=${i.id }">delete</a> 
 <td>
</tr>

</c:forEach>

</table>

</body>
</html>