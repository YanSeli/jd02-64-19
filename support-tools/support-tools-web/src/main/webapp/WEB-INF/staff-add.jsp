<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<form method="post" action="${pageContext.request.contextPath}/staff-add">--%>
<html>
<table>
    <tr>
        <td><label>Last Name</label></td>
        <td><input type="text" name="lastName"></td>
    </tr>
    <tr>
        <td><label>First Name</label></td>
        <td><input type="text" name="firstName"></td>
    </tr>
    <tr>
        <td><label>Post</label></td>
        <td><input type="text" name="post"></td>
    </tr>
    <tr>
        <td><label>Shift employee</label></td>
        <td><input type="text" name="shiftEmployee"></td>
    </tr>
    <tr>
        <td><label>Id</label></td>
        <td><input type="text" name="id"></td>
    </tr>
    <tr>
        <td colspan="2"><input type="submit"></td>
    </tr>

</table>
</html>