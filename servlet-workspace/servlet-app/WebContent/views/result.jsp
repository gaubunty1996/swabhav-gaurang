<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1 align="center">Beer recommendation JSP</h1>
	
	<%
		List styles=(List)request.getAttribute("styles");
		Iterator it=styles.iterator();
		while(it.hasNext()){
			out.println("<br> try: "+it.next());
		}
	%>
</body>
</html>