<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="views.modificarview"%>
<%@page import="connectionpool.ConnectionPool"%>
<%@page import="users.LoggedUser"%>
<%@page import="views.equipos"%>
<%@page import="views.tablas"%>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Modificar Equipo</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <link rel="stylesheet" href="assets/mainview.css">
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
        LoggedUser user = (LoggedUser)session.getAttribute("user");
        tablas tabla = new tablas(pool.getConnection());
        String tabla_ = request.getParameter("tabla");
        int id = Integer.parseInt(request.getParameter("id"));
        equipos equipo = tabla.requestById(id, tabla_);
        if(user==null){
            response.sendRedirect("logout.jsp");
        }
        else{
            out.print(new modificarview(equipo, user, tabla_));
        }
        
    %>

    <!-- Bootstrap JavaScript y dependencias -->
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.2/dist/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>