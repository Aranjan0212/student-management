<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Western</title>
</head>
<body>
<form action ="Signup.java" method="post">
Name:<input type = "text" name = "name1"/><br></br>
Email:<input type = "text" name = "Email1"/><br></br>
password:<input type = "password" name = "password1"/><br></br>
gender: <input type="radio" name="gender1" value="male"> Male
<input type="radio" name="gender 1" value="female"> Female<br></br>
city:<select name = "city1">
<option> select city</option>
<option> Goa</option>
<option> pondicherry</option>
<option> kanya kumari</option>
<option> lakshawdweep</option>
</select><br></br>

        <input type ="submit" value ="Signup"/>
</form>

</body>
</html>