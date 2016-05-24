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
    <script src="http://code.jquery.com/jquery-1.12.0.min.js"></script>

</head>
<body>
<div id="container" >
    <div>
        <img src="http://logok.org/wp-content/uploads/2015/05/SEAT-logo.png" height="100px">
        <h1>Seat</h1>
        <c:if test="${sessionScope.type == 'student'}">
            <div style="float:right">Student</div>
        </c:if>
        <c:if test="${sessionScope.type == 'professor'}">
            <div style="float:right">Professor</div>
        </c:if>
    </div>
    <br>
    <div align="center">
        <c:if test="${not empty sessionScope.user}">
             <a href="logout">Logout</a>
        </c:if>
        <c:if test="${empty sessionScope.user}">
             <a href="login">Login</a>
        </c:if>
        <c:if test="${sessionScope.type == 'student'}">
            <a href="publication">Publication</a>
            <a href="student-report">Upload Report</a>
            <a href="conference">Conference</a>
            <a href="payment-reimbursent">Payment Proof</a>
            <a href="submit-thesis">Submit Thesis</a>
        </c:if>
            
        <c:if test="${sessionScope.type == 'professor'}">
            <a href="validate-report">Validate Report</a>
            <a href="select-student">Assign Course</a>
            <a href="view-thesis">Thesis Comment</a>
            <a href="courses">Grade</a>
        </c:if>
        
    </div>