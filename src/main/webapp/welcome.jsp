<%@ page language="java" %>
<%
    String name = request.getParameter("username");

    // Create session
    session.setAttribute("user", name);

    // Set session expiry to 60 seconds (1 minute)
    session.setMaxInactiveInterval(60);
%>

<html>
<head>
    <title>Welcome Page</title>
</head>
<body>
    <h2>Hello <%= name %>!</h2>

    <p>Session will expire in 1 minute.</p>

    <a href="check.jsp">Check Session Status</a>
</body>
</html>