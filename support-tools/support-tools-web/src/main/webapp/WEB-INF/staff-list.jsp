<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Staff List</title>
</head>
<body>

<table>
    <tr>
        <td>Id</td>
        <td>Last name</td>
        <td>First name</td>
        <td>Post</td>
        <td>ShiftEmployee</td>
    </tr>
    <c:forEach items="${productList}" var="product">
        <tr>
            <td><c:out value="${product.id}"/></td>
            <td><c:out value="${product.name}"/></td>
            <td><c:out value="${product.price}"/></td>
            <td><c:out value="${product.price}"/></td>
            <td><c:out value="${product.price}"/></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
