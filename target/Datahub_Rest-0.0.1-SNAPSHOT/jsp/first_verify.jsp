<%@page conentype="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Verification</title>
</head>
<body>
	<%! String uname, pass; %>
	<%
		uname = request.getParameter("uname");
		pass = request.getParameter("pass");
		if(uname.equals("mca4")&&pass.equals("mca4"))
					{%>
					<jsp:forward page ="welcome.jsp"/>
					<%} else
						
					{%>
					Wrong UserName/Password, Try again!!!
					<jsp:include page="index.jsp"/>
					<%} 
					%>
	
</body>
</html>