<%@ page language="java" contentType="text/html; charset=windows-1256"
    pageEncoding="windows-1256"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="windows-1256">
<title>Insert title here</title>
</head>
<body>
<form action="updateandredirect" >

<input type="text" name="id" value="${customer.id }">
<label>id</label>
<br>

<input type="text" name="username" value="${customer.customer_name }">
<label>Cutomer name</label>
<br>
<input type="text" name="country" value="${customer.country}">
<label>country</label>
<br>
<input type="text" name="city" value="${customer.city}">
<label>city</label>
<br>
<input type="text" name="address" value="${customer.address }">
<label>address</label>
<br>
<input type="text" name="tax_number" value="${customer.tax_number }">
<label>tax_number</label>
<br>

<input type="submit" value="update">


</body>
</html>