<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form name="usunzwierze" method="post" action="/SchroniskoAPP/RemoveFromDBServlet">
    id <input type="text" name="id"/> <br/>
   
    <input type="submit" value="usun record z bazy danych" />
 


 
</form>
<form name="maintenance" method="post" action="/SchroniskoAPP/AddToDBServlet">

 <button onclick="self.close()">Zamknij</button>
</form>
</body>
</html>