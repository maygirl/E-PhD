<%--
  Created by IntelliJ IDEA.
  User: Mac
  Date: 07/04/16
  Time: 9:44 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8"
         language="java" %>

<%@ taglib prefix="c"
           uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <meta charset="UTF-8">
    <title>WAD</title>
    <link rel="stylesheet" type="text/css" href="style.css">
    <link rel="stylesheet" type="text/css" href="bootstrap/css/bootstrap.min.css">

</head>
<body>
<div id="container" >
    <div>
        <img src="http://logok.org/wp-content/uploads/2015/05/SEAT-logo.png" height="100px">
        <h1>Seat</h1>
        <c:if test="${sessionScope.admin}">
            <div style="float:right">Admin</div>
        </c:if>
    </div>
    <br>
    <div align="center">
        <c:if test="${empty sessionScope.user}">
            <a href="login">Login</a>
            <a href="register">Register</a>
        </c:if>
        <a href="products">Products</a>
        <c:if test="${sessionScope.admin}">
            <a href="add-product">Add Product</a>
        </c:if>
        <a href="cart">Cart</a>
        <c:if test="${not empty sessionScope.user}">
            <a href="history">History</a>
            <a href="logout">Logout</a>
        </c:if>
    </div>