<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form name="dodaj" method="post" action="http://localhost:8080/SchroniskoAPP/AddToDBServlet">
    imie: <input type="text" name="imie"/> <br/>
    plec <input type="radio" name="plec" value="samiec" checked> samiec	
  <input type="radio" name="plec" value="samica"> samica<br>
     wiek: <input type="text" name="wiek"/> <br/>
      waga: <input type="text" name="waga"/> <br/>
      opiekun: <input type="text" name="opiekun"/> <br/>
     
    <input type="submit" value="Dodaj do bazy danych" />
    <br/>
    <br/>
</form>
<form name="maintenance" method="post" action="http://localhost:8080/SchroniskoAPP/AddToDBServlet">

 <button onclick="self.close()">Zamknij</button>
</form>
</body>
</html>