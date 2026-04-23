<%@ page language="java" %>
<%
    String name = request.getParameter("username");

    session.setAttribute("user", name);
    session.setMaxInactiveInterval(60); // 1 min
%>

<html>
<body>

<h2>Hello <%= name %>!</h2>

<p>Session will expire in 1 minute.</p>

<a href="check9b.jsp">Check Session</a>

</body>
</html>