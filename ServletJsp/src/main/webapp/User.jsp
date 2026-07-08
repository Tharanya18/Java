<%@ page language="java" contentType="text/html; charset=UTF-8"%>

<%@ page import="javax.servlet.http.Cookie" %>

<%
String user = "";

Cookie[] cookies = request.getCookies();

if(cookies != null)
{
    for(Cookie c : cookies)
    {
        if("username".equals(c.getName()))
        {
            user = c.getValue();
            break;
        }
    }
}
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User</title>
</head>
<body>

<h1>Welcome to User Page</h1>

<h2>Hello <%= user %></h2>

</body>
</html>