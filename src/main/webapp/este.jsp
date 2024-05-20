<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="views.esteview"%>
<%@page import="users.LoggedUser"%>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Conferencia Este NBA</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <link rel="stylesheet" href="assets/mainview.css">
    <link rel="icon" type="image/x-icon" href="assets/IMG/Eastern.gif">
</head>
<body>
    <%
        LoggedUser user = (LoggedUser)session.getAttribute("user");
        if(user==null){
            response.sendRedirect("home.jsp");
        }
        else{
            out.print(new esteview(user));
        }
    %>
    <script>
        window.addEventListener("pageshow", function (event) {
            if (event.persisted) {
                window.location.reload();
            }
        });
    </script>
</body>
</html>