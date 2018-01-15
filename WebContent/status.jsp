<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@page import="com.schronisko.status.*,java.util.*"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
  
<head>  
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">  
<title>Status</title>  
</head>  
<body>  
  

  
<h1>Users List</h1>  
  
<%
List<Zwierze> list=DBConnectionManager.wypisz();  
request.setAttribute("list",list);  
%>  
  
<table border="1" width="90%">  
<tr><th>Id</th><th>Imie</th><th>Plec</th><th>Wiek</th>  
<th>Waga</th><th>Opiekun</th></tr>  
<c:forEach items="${list}" var="z"> 
<tr><td>${z.getId()}</td><td>${z.getImie()}</td><td>${z.getPlec()}</td>  
<td>${z.getWiek()}</td><td>${z.getWaga()}</td><td>${z.getOpiekun()}</td>  
 
</c:forEach>  
</table>  

  
</body>  
</html>  
</body>
</html>