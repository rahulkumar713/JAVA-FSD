<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ page import="java.util.*" %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Flight List</title>
</head>
<body align= "center">
<br>
<a href=index.jsp style="color:black;text-decoration:none;font-size:35px;fontweight:bold;">Flight Booking</a>
<br><br>
<%
@SuppressWarnings("unchecked")
List<String[]> flights=(List<String[]>)session.getAttribute("flights");
if(flights!=null){
%>
<h1>Available Flights</h1>
<div align = "center">
<table border="1">
<tr>
<th>Name</th>
<th>Time</th>
<th>Price</th>
</tr>
<%
for(String[] flight:flights){
%>
<tr>
<td><%=flight[0]%></td>
<td><%=flight[1]%></td>
<td><%=flight[2]%></td>
</tr>
</table></div>
<a href=BookFlight.jsp>Book Now</a>
<%
}
%>
<%
}
else{
%>
<h1>There are no available flights</h1>
<%
}
%>
</body>
</html>