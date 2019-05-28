<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body>
    <form action="/login" method="post">
        <input type="hidden" name="_csrf" value="${_csrf.token}" />
        <input type="text" name="login" placeholder="login"><br>
        <input type="text" name="password" placeholder="password">
    </form>
    <button>Send</button>
    <a href="/registration"><button>Registration</button></a>

    ${message}

</body>
</html>