<%@page import="views.LoginView"%>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login</title>
    <link rel="stylesheet" href="assets/style.css">
    <link rel="icon" type="image/x-icon" href="assets/IMG/favicon.png">
</head>
<body>
    <%
        out.print(new LoginView());
    %>
</body>
</html>
