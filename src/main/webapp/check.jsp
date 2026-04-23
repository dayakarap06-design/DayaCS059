<%@ page language="java" %>
<%
    String user = (String) session.getAttribute("user");
%>

<html>
<head>
    <title>Session Check</title>
</head>
<body>

<%
    if (user == null) {
%>
        <h2>Session Expired!</h2>
<%
    } else {
%>
        <h2>Session Active. Hello <%= user %>!</h2>
<%
    }
%>

</body>
</html>