<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Manager Schroniska-Strona Logowania</title>
</head>
<body>
<h1>Strona Logowania</h1>
<jsp:include page="style.css"/>
<div class="center_content" >
<form name="loginForm" method="post" action="LoginServlet">
    Użytkownik: <input type="text" name="username"/> <br/>
    Hasło:      <input type="password" name="password"/> <br/>
    <input type="submit" value="Zaloguj" />
    
</form>
</div>
</body>
</html>