<%@page import="com.js.dto.Product"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body
	style="background-image: linear-gradient(hotpink, white); background-attachment: fixed; font-size: 25px">
	<h2>PRODUCT DETAILS</h2>
	<table border=10px>
		<tr>
			<th>ID</th>
			<th>NAME</th>
			<th>BRAND</th>
			<th>PRICE</th>
			<th>QUANTITY</th>
			<th>DELETE</th>
			<th>UPDATE</th>
			
		</tr>
		<%
			ArrayList<Product> all = (ArrayList) request.getAttribute("output");
			for (Product p : all) {
		%>

		<tr>
			<%
				int id = p.getId();
					String name = p.getName();
					String brand = p.getBrand();
					double price = p.getPrice();
					int qty = p.getQuantity();
			%>
			<td><%=id%></td>
			<td><%=name%></td>
			<td><%=brand%></td>
			<td><%=price%></td>
			<td><%=qty%></td>
			<td><a href="delete?id=<%=id%>">delete</a></td>
			<td><a href="edit?id=<%=id%>">edit</a></td>
		
			
			
		</tr>
		<%
			}
		%>
	</table>
</body>
</html>