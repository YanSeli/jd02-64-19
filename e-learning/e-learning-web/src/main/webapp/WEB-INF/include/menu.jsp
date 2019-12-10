<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div style="background: #E0E0E0; height: 55px; padding: 5px;">
<div style="float: left">
    <h1 style="margin-top: 10px">My Site</h1>
</div>

<div style="float: right; padding: 15px; text-align: right;">

<!-- User store in session with attribute: loginedUser -->
<c:if test="${user != null}"> Hello <b>${user.userName}</b>
    <a href="${pageContext.request.contextPath}/logout">logout</a>
</c:if>