<%@ page language="java" %>
<%
    String name = request.getParameter("username");
    int time = Integer.parseInt(request.getParameter("time"));

    session.setAttribute("user", name);
    session.setMaxInactiveInterval(time);
%>

<html>
<body>

<h2>Hello <%= name %>!</h2>

<p>Session set for <%= time %> seconds.</p>

<a href="check9c.jsp">Check Session</a>

</body>
</html>