<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div> Enter details of cricket player</div>
<form method="post" action="logincheck">

		<table>
			<tr>
				<td>Enter player code</td>
				<td><input type="number" name="plcode" ></td>
			</tr>
			<tr>
				<td>Enter Player name </td>
				<td><input type="text" name="plname"></td>
			</tr>
			<tr>
				<td>Enter player run</td>
				<td><input type="number" name="plrun" ></td>
			</tr>
			<tr>
				<td>Enter Player not outs</td>
				<td><input type="number" name="plnotout"></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="login"></td>
			</tr>
		</table>
	</form>
</body>
</html>