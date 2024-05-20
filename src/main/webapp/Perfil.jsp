<%@page import="views.Perfilview"%>
<%@page import="users.LoggedUser"%>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Perfil</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <link rel="stylesheet" href="assets/mainview.css">
    <link rel="icon" type="image/x-icon" href="assets/IMG/favicon.png">
</head>
<body>
    <%
        LoggedUser user = (LoggedUser)session.getAttribute("user");
        if(user==null){
            response.sendRedirect("login.jsp");
        }
        else{
            out.print(new Perfilview(user));
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