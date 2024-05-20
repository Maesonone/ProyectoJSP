<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="connectionpool.ConnectionPool"%>
<%@page import="users.AuthService"%>
<%@page import="users.LoggedUser"%>
<%@page import="views.equipos"%>
<%@page import="views.tablas"%>
<%
        //Usuario de la base de datos
        String dbuser = "ivan";
        //Contraseña de la base de datos
        String dbpassword = "123456";
        //Pool de conexiones a la base de datos
        ConnectionPool pool = new ConnectionPool("jdbc:mysql://localhost:3306/trabajojsp", dbuser, dbpassword);
        LoggedUser user = (LoggedUser)session.getAttribute("user");
        tablas tabla = new tablas(pool.getConnection());
        String tabla_ = request.getParameter("tabla");
        int id = Integer.parseInt(request.getParameter("id"));
        tabla.delete(id, tabla_);

    response.sendRedirect("home.jsp");
%>