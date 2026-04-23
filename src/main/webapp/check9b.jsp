<%@ page language="java" %>
<%
    String user = (String) session.getAttribute("user");
%>

<html>
<body>

<%
    if (user == null) {
%>
    <h2>Session Expired!</h2>
<%
    } else {
%>
    <h2>Hello <%= user %>! Session Active.</h2>
<%
    }
%>

</body>
</html>