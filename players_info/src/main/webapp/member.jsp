<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Player details</title>
</head>
<body>
Player details filled by user<br>
player code
<%= session.getAttribute("plcode") %> <br>
player name

<%= session.getAttribute("plname") %> <br>
player runs 
<%= session.getAttribute("plrun") %> <br>
player not out 
<%= session.getAttribute("plnotout") %> <br>
</body>
</html>