<%@ page language="java" %>
<html>
<head>
<title>User Form</title>

<script>
function validateForm() {
    var name = document.forms["f"]["username"].value;
    var email = document.forms["f"]["email"].value;
    var desig = document.forms["f"]["designation"].value;

    if (name == "" || email == "" || desig == "") {
        alert("All fields are required!");
        return false;
    }

    if (email.indexOf("@") == -1) {
        alert("Invalid Email!");
        return false;
    }

    return true;
}
</script>

</head>
<body>

<h2>User Form</h2>

<form name="f" action="UserDataServlet" method="post" onsubmit="return validateForm()">
    Username: <input type="text" name="username"><br><br>
    Email: <input type="text" name="email"><br><br>
    Designation: <input type="text" name="designation"><br><br>

    <input type="submit" value="Submit">
</form>

</body>
</html>