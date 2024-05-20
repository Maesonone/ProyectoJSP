<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="connectionpool.ConnectionPool"%>
<%@page import="users.AuthService"%>
<%@page import="users.LoggedUser"%>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login</title>
    <link rel="stylesheet" href="assets/style.css">
    <link rel="icon" type="image/x-icon" href="assets/IMG/favicon.png">
</head>
<body>
    <%
        //Usuario de la base de datos
        String dbuser = "ivan";
        //Contraseña de la base de datos
        String dbpassword = "123456";
        //Pool de conexiones a la base de datos
        ConnectionPool pool = new ConnectionPool("jdbc:mysql://localhost:3306/trabajojsp", dbuser, dbpassword);
        AuthService auth = new AuthService(pool.getConnection());
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        LoggedUser user = auth.login(username, password);
        if(user!=null){
            session.setAttribute("user", user);
            response.sendRedirect("home.jsp");
        }
        else
            response.sendRedirect("index.jsp?error=Usuario o contraseña no válido");
    %>
</body>
</html>