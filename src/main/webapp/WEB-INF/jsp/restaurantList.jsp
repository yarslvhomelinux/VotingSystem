<%--
  Created by IntelliJ IDEA.
  User: pavel
  Date: 02.07.19
  Time: 19:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<title>Restaurants List</title>
<jsp:include page="header.jsp"/>

<body>
<h1 class="text-center">Restaurants List</h1>
<table class="table table-align">
    <thead class="thead-dark">
    <tr>
        <th scope="col">ID</th>
        <th scope="col">Name</th>
        <th scope="col">Edit</th>
        <th scope="col">Delete</th>
    </tr>
    </thead>
    <tbody>
        <c:forEach var="restaurant" items="${restaurants}">
            <tr scope="row">
                <td>${restaurant.id}</td>
                <td>${restaurant.name}</td>
                <td><a href="${pageContext.request.contextPath}/editRestaurant/${restaurant.id}">Edit</a></td>
                <td><a href="${pageContext.request.contextPath}/deleteRestaurant/${restaurant.id}">Delete</a></td>
            </tr>
        </c:forEach>
    </tbody>
</table>
<br/>
<div class="text-center"><a class="btn btn-dark" href="${pageContext.request.contextPath}/createRestaurant" role="button">Add new restaurant</a></div>

</body>
</html>
