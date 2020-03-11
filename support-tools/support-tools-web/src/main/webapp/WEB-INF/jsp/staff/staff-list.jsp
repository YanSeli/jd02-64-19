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
        <td>Action</td>
    </tr>
    <jsp:useBean id="staff" scope="request" type="java.util.List"/>
    <c:forEach var="staff" items="${staff}">
        <tr>
            <td>${staff.id}</td>
            <td>${staff.lastName}</td>
            <td>${staff.firstName}</td>
            <td>${staff.post}</td>
            <td>
                <c:url value="/staff-delete" var="delete_link">
                    <c:param name="id" value="${staff.id}"/>
                </c:url>
                <a href="${delete_link}">Delete</a>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
