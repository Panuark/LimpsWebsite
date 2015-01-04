<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%if (true){%>
<form method="get" action = "/LimpsWebsite/Enregistrer">
Pseudo:<input type="text" name="nb1">
<br>
Password:<input type="text" name="nb2">
<br>
Nom:<input type="text" name="nb3">
<br>
Prenom:<input type="text" name="nb4">
<br>
<input type = "submit" value="OK">
</form><%}%>
<br>
<%=request.getAttribute("team") %>

<form method="get" action = "/LimpsWebsite/Connection">
<input type = "submit" value="OK">
</form>
</body>
</html>