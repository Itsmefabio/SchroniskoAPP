<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<jsp:include page="style.css"/>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>usuń Zwierzę</title>
</head>
<body>
<h1>Usuń Zwierzę</h1>
<div class="center_content">
<form name="usunzwierze" method="post" action="/SchroniskoAPP/RemoveFromDBServlet">
    id <input type="text" name="id"/> <br/>
   
    <input type="submit" value="usun record z bazy danych" />

</form>
<form name="maintenance" method="post" action="/SchroniskoAPP/AddToDBServlet">

 <button onclick="self.close()">Zamknij</button>
</form>
 </div>
</body>
</html>