<%@page import="com.js.dto.Product"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% Product p =(Product)request.getAttribute("product"); %>
<form action="edit1" method="get">
	<label>Product ID: </label>
	<input type="id" name="id" value="<%=p.getId() %>" readonly="readonly"><br> <br>
	<label>Product Name: </label>
	<input type="text" name="name" value="<%=p.getName() %>"><br> <br>
	<label>Product BRAND:</label>
	<input type="text" name="brand" value="<%=p.getBrand() %>"><br> <br>
	<label>Product Price: </label>
	<input type="number" name="price" value="<%=p.getPrice() %>"><br> <br>
	<label>Product Quantity: </label>
	<input type="number" name="quantity" value="<%=p.getQuantity() %>"><br> <br>
	
	<input type="submit" value="save">
	</form>
</body>
</html>