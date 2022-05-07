
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Rejestracja</title>
</head>
<body>
<h1>Rejestracja</h1>

<form:form method="post" modelAttribute="user">

<span>Login: <form:input path="login" /> </span>
    <span>First name: <form:input path="firstName" /></span>
    <span>Last name: <form:input path="lastName" /></span>
    <span> email:<form:input path="email" /></span>
    <span> password:<form:input path="password" /></span>
        <span>Phone Number: <form:input path="phoneNumber" /></span>
    <input type="submit" value="Add New User">

</form:form>




</body>
</html>