<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<table>
    <tr>
        <td>Id</td>
        <td>Last Name</td>
        <td>First Name</td>
        <td>Phone</td>
    </tr>
    <c:forEach var="student" items="${students}" begin="">
        <tr>
            <td>${student.id}</td>
            <td>${student.lastName}</td>
            <td>${student.firstName}</td>
            <td>${student.phone}</td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
