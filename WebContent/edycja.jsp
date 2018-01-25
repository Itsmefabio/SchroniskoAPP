<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<jsp:include page="style.css"/>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Edytuj istniejący wpis</title>
</head>
<body>
<h1>Edytuj Wpis</h1>
<div class="center_content">
<form name="edytuj" method="post" action="http://localhost:8080/SchroniskoAPP/EditDBServlet">
     id: <input type="text" name="id"/> <br/>
    imie: <input type="text" name="imie"/> <br/>
    plec: <input type="radio" name="plec" value="samiec" checked> samiec	
  <input type="radio" name="plec" value="samica"> samica<br>
     wiek: <input type="text" name="wiek"/> <br/>
      waga: <input type="text" name="waga"/> <br/>
      opiekun: <input type="text" name="opiekun"/> <br/>
      <input type="submit" value="Edytuj" />
    <br/>
    <br/>
</form>
<form name="maintenance" method="post" action="http://localhost:8080/SchroniskoAPP/AddToDBServlet">

 <button onclick="self.close()">Zamknij</button>
</form>
</div>
</body>
</html>