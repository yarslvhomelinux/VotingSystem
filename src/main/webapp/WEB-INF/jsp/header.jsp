<%--
  Created by IntelliJ IDEA.
  User: pavel
  Date: 02.07.19
  Time: 19:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<head>
    <link rel='stylesheet' href='webjars/bootstrap/4.3.1/css/bootstrap.min.css'>
    <script type='text/javascript' src='webjars/jquery/3.4.1/jquery.min.js'></script>
    <script type='text/javascript' src='webjars/bootstrap/4.3.1/js/bootstrap.min.js'></script>

    <link href="<c:url value="/resources/custom-styles.css"/>" rel="stylesheet">

    <nav class="navbar navbar-expand-lg navbar-light bg-light">
        <a class="navbar-brand" href="#">Voting System</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>

        <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav mr-auto">
                <li class="nav-item active">
                    <a class="nav-link" href="${pageContext.request.contextPath}">Home <span class="sr-only">(current)</span></a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="${pageContext.request.contextPath}/voting">Voting</a>
                </li>
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                        Menu
                    </a>
                    <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                        <a class="dropdown-item" href="${pageContext.request.contextPath}/restaurants">Restaurants</a>
                        <a class="dropdown-item" href="${pageContext.request.contextPath}/menus">Menus</a>
                        <a class="dropdown-item" href="${pageContext.request.contextPath}/users">Users</a>
                    </div>
                </li>
            </ul>
        </div>
    </nav>
</head>
