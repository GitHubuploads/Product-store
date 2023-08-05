<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="insert" method="get">
	<label>Product ID: </label>
	<input type="id" name="id"><br> <br>
	<label>Product Name: </label>
	<input type="text" name="name"><br> <br>
	<label>Product BRAND:</label>
	<input type="text" name="brand"><br> <br>
	<label>Product Price: </label>
	<input type="number" name="price"><br> <br>
	<label>Product Quantity: </label>
	<input type="number" name="quantity"><br> <br>
	
	<input type="submit" value="save">
	</form>

</body>
</html>