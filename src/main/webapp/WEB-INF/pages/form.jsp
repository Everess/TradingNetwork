<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!doctype html>
<html lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <title>Document</title>
</head>
<body>
<form method="post" action="/form/add">
    <input type="hidden" name="_csrf" value="${_csrf.token}">
    <input type="text" placeholder="name of shop" name="nameOfShop" value="${nameOfShop}"><br>
    <input type="number" placeholder="id of settlement" name="idSettlement" value="${idSettlement}"><br>
    <button>Add shop</button>
</form>
<a href="/shops"><button>List of shops</button></a><br>
<%-- Date refresh with reload page --%>
<% java.util.Date nonStaticDate = new java.util.Date(); %>
<%= nonStaticDate %>
<br>
<%-- Declaration, run once --%>
<%! java.util.Date date = new java.util.Date(); %>
<%= date %>
</body>
</html>

