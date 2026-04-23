<%@ page language="java" %>
<html>
<head>
<title>Student Form</title>

<script>
function validateForm() {
    var f = document.forms["f"];

    for (var i = 0; i < f.elements.length; i++) {
        if (f.elements[i].value == "") {
            alert("All fields are required!");
            return false;
        }
    }
    return true;
}
</script>

</head>
<body>

<h2>Student Marks Form</h2>

<form name="f" action="ResultServlet" method="post" onsubmit="return validateForm()">

Roll No: <input type="text" name="roll"><br><br>
Name: <input type="text" name="name"><br><br>

Sub1: <input type="number" name="s1"><br><br>
Sub2: <input type="number" name="s2"><br><br>
Sub3: <input type="number" name="s3"><br><br>
Sub4: <input type="number" name="s4"><br><br>
Sub5: <input type="number" name="s5"><br><br>

<input type="submit" value="Submit">

</form>

</body>
</html>