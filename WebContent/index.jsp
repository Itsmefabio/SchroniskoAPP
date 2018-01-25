<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@page import="com.schronisko.status.*,java.util.*,com.schronisko.jpa.*"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<style type="text/css" media="all">
</style>
<title>strona glowna</title>
</head>
<jsp:include page="style.css"/>
<body>
<div class="left">
<form action="/SchroniskoAPP/MenuServlet" method="post" target="_blank">
    <input type="submit" name="b1" value="Dodaj Zwierze" /><br/>
    <input type="submit" name="b2" value="Usun Zwierze" /><br/>
    
</form>
<form action="/SchroniskoAPP/MenuServlet" method="post" target="_blank">
    <input type="submit" name="b3" value="Edytuj Wpis" /><br/>
</form>
</div>
 <div class="right">   

<form action="/SchroniskoAPP/LogoutServlet" method="post">
<input type="submit" name="b3" value="Wyloguj" /><br/>
</form>
</div>
<br/>
<div class="center_content">
<h1>Lista Zwierząt</h1>  
  
<%
List<Zwierze> list=DBActions.wypisz();
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
</div>
</body>
</html>