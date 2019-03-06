<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"
         prefix="c" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Login Form</title>

    <style>

    body{
         background-color:Maroon;
    }
    h1{
        text-align:center;
        color:black;
    }
    form{
         margin-top:85px;
         padding:5px;
         text-align:center;
         color:white;
         font-size:25px;
         }
     input{
          border-radius:10px;
          font-size:20px;
     }
    </style>
</head>
<body>

<h1>LOGIN FORM</h1>

<form action="login">

    Username <input type="text" name="uname"><br>
    Password <input type="password" name="pass"><br><br>
     <input type="submit">
</form>

</body>
</html>