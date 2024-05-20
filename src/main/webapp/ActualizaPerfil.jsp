<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="connectionpool.ConnectionPool"%>
<%@page import="users.AuthService"%>
<%@page import="users.LoggedUser"%>
<%
    String username = request.getParameter("actusername");
    String name = request.getParameter("actname");
    String email = request.getParameter("actemail");
    String surname = request.getParameter("actsurname");
    //Usuario de la base de datos
    String dbuser = "ivan";
    //Contraseña de la base de datos
    String dbpassword = "123456";
    //Pool de conexiones a la base de datos
    ConnectionPool pool = new ConnectionPool("jdbc:mysql://localhost:3306/trabajojsp", dbuser, dbpassword);
    LoggedUser user = (LoggedUser)session.getAttribute("user");
    AuthService auth = new AuthService(pool.getConnection());
    LoggedUser usuario = auth.update(username, email, name, surname, user.getId());
    response.sendRedirect("logout.jsp");
%>