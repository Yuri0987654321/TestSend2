<!DOCTYPE HTML>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html xmlns:th="http://www.thymeleaf.org">
<head>
    <title>Getting Started: Serving Web Content</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
</head>
<body>
<c:foreach >

</c:foreach>
<p th:text="'Hello, ' + ${name} + '!'" />
<h1>Welcome message : <c:out value="${name}"></c:out></h1>
</body>
</html>