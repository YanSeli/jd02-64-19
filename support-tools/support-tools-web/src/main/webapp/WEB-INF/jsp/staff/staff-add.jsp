<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>

<html>
<head>Add Staff</head>
<body>
<form method="post" action="${pageContext.request.contextPath}/staff-add">
    <label>Last Name
        <input type="text" name="lastName"/>
    </label>
    <label>First Name
        <input type="text" name="firstName"/>
    </label>
    <label>Post
        <input type="text" name="post"/>
    </label>
    <label>Shift employee
        <input type="text" name="shiftEmployee"/>
    </label>
    <input type="submit">
</form>
</body>
</html>