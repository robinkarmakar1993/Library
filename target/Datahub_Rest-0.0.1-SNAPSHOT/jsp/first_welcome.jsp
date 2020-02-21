<%@page conentype="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Contnet-Type" content="text/html; charset=UTF-8">
		<title>Welcome</title>
	</head>
	<body>
		<%! String uname, pass; %>
		<%
		uname = request.getParameter("uname");
		pass = request.getParameter("pass");
		%>	
		Welcome, <%=uname%>
		<br/>
		Your Password is : <%=pass%>
		<br>
	</body>

</html>