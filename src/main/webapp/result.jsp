<%@ page language="java" %>
<html>
<body>

<h2>User Details</h2>

Name: <%= request.getAttribute("name") %><br>
Email: <%= request.getAttribute("email") %><br>
Designation: <%= request.getAttribute("desig") %><br>

<br>
<a href="index.jsp">Go Back</a>

</body>
</html>