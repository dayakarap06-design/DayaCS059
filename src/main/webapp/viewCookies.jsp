<%@ page import="javax.servlet.http.Cookie" %>
<html>
<head>
    <title>Active Cookies</title>
</head>
<body>

<h2>Active Cookie List</h2>

<%
    Cookie[] cookies = request.getCookies();

    if (cookies != null) {
        for (Cookie c : cookies) {
%>
            <p>
                Name: <%= c.getName() %> <br>
                Value: <%= c.getValue() %> <br>
                Max Age: <%= c.getMaxAge() %>
            </p>
            <hr>
<%
        }
    } else {
%>
        <h3>No Cookies Found</h3>
<%
    }
%>

</body>
</html>