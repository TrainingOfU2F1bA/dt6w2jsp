<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>employees</title>
    <style>
        .demo_employees{
            border: 1px black solid;
        }
        .demo_employees thead{
            color: white;
            background: black;
        }
        .demo_employees th{
            height: 40px;
            width: 200px;
            border: 1px black solid;
        }
        .demo_employees tbody tr:nth-child(odd){
            background-color: rgb(238,238,238);
        }

    </style>
<body>
<table class="demo_employees" cellspacing="0">
    <thead>
    <tr>
        <th>学号</th>
        <th>姓名</th>
        <th>年龄</th>
        <th>性别</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="employee" items="${list}">
        <tr>
            <th>${employee.id}</th>
            <th>${employee.name}</th>
            <th>${employee.age}</th>
            <th>${employee.gender}</th>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>