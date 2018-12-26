<%-- 
    Document   : index
    Created on : Dec 26, 2018, 9:23:55 PM
    Author     : thinkpad
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <form action="registerController" method="post">
            <label for="name">name</label>
            <input type="text" id="name" name="name"/>
            <label for="pass">pass</label>
            <input type="password" id="pass" name="pass"/>
            <button type="submit"> ok </button>
        </form>
    </body>
</html>
