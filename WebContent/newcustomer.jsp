<%@ page language="java" contentType="text/html; charset=windows-1256"
    pageEncoding="windows-1256"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="windows-1256">
<title>Insert title here</title>

</head>
<body >
<form action="addnewcustomer" method="post">
<input type="text" name="username">
<label>Cutomer name</label>
<br>
<input type="text" name="country">
<label>country</label>
<br>
<input type="text" name="city">
<label>city</label>
<br>
<input type="text" name="address">
<label>address</label>
<br>
<input type="text" name="tax_number">
<label>tax_number</label>
<br>
<input type="checkbox" name="verify">
<label>verify</label>
<br>

<input type="submit" value="add customer">


</form>
</body>
</html>