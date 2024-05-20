<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="connectionpool.ConnectionPool"%>
<%@page import="users.AuthService"%>
<%@page import="users.LoggedUser"%>
<%@page import="views.equipos"%>
<%@page import="views.tablas"%>
<%
    String nombre = request.getParameter("actnombre");
    String entrenador = request.getParameter("actentrenador");
    String record = request.getParameter("actrecord");
    int id = Integer.parseInt(request.getParameter("actid"));
    String tabla_ = request.getParameter("acttabla");
    //Usuario de la base de datos
    String dbuser = "ivan";
    //Contraseña de la base de datos
    String dbpassword = "123456";
    //Pool de conexiones a la base de datos
    ConnectionPool pool = new ConnectionPool("jdbc:mysql://localhost:3306/trabajojsp", dbuser, dbpassword);
    LoggedUser user = (LoggedUser)session.getAttribute("user");
    AuthService auth = new AuthService(pool.getConnection());

    tablas tabla = new tablas(pool.getConnection());
    equipos equipo = new equipos(record, nombre, entrenador, id);
    int affectedrows = tabla.update(equipo, tabla_);

    response.sendRedirect("home.jsp");
%>