<%@page contentType="test/html" pageEncoding="UTF-8" language="java"%>
<%@page import="connectionpool.ConnectionPool"%>
<%@page import="users.AuthService"%>
<%@page import="users.LoggedUser"%>
<%

    session.invalidate();
    response.sendRedirect("login.jsp");
%>