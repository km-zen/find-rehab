<%--
  Created by IntelliJ IDEA.
  User: konrad
  Date: 07.05.2022
  Time: 08:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>Wyszukiwanie placówek</title>
</head>

<header>
    <a href="/home"> FindRehab</a>
</header>
<body>

<form:form method="post" modelAttribute="filias">
    <form:select path="empty" items="${filias}" itemLabel="city" itemValue="city" />
    <input type="submit" value="wyszukaj placówkę">
</form:form>

</body>
</html>
