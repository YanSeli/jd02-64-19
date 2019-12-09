<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create Product</title>
</head>
<body>

<form method="post" action="${pageContext.request.contextPath}/productCreate">
    <label> Name: <input type="text" name="name"/> </label>
    <br>
    <label> Price: <input type="number" name="price"/> </label>
    <br>
    <input type="submit">
</form>
</body>
</html>
