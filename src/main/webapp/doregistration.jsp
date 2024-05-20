<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="connectionpool.ConnectionPool"%>
<%@page import="users.AuthService"%>
<%@page import="users.LoggedUser"%>
<%
    String username = request.getParameter("username");
    String password = request.getParameter("password");
    String name = request.getParameter("name");
    String surname = request.getParameter("surname");
    String email = request.getParameter("email");
    //Usuario de la base de datos
    String dbuser = "ivan";
    //Contraseña de la base de datos
    String dbpassword = "123456";
    //Pool de conexiones a la base de datos
    ConnectionPool pool = new ConnectionPool("jdbc:mysql://localhost:3306/trabajojsp", dbuser, dbpassword);
    AuthService auth = new AuthService(pool.getConnection());
    LoggedUser user = auth.register(username, name, surname, password, email);
    response.sendRedirect("login.jsp");
%>