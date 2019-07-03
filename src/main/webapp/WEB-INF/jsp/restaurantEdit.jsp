<%--
  Created by IntelliJ IDEA.
  User: pavel
  Date: 03.07.19
  Time: 18:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<title>Create restaurant</title>
<jsp:include page="header.jsp"/>

<body>
<h1 class="text-center">Create New Restaurant</h1>
<div class="w-50 m-auto">
    <form:form method="POST" action="${pageContext.request.contextPath}/saveRestaurant" modelAttribute="restaurant">
        <div class="input-group mb-3">
            <div class="input-group-prepend">
                <span class="input-group-text" id="inputGroup-sizing-default-id">ID</span>
            </div>
            <form:input path="id" disabled="true" cssClass="form-control" aria-label="Name"
                        aria-describedby="inputGroup-sizing-default"/>
            <div class="input-group-prepend">
                <span class="input-group-text" id="inputGroup-sizing-default-name">Name</span>
            </div>
            <form:input path="name" cssClass="form-control" aria-label="Name"
                        aria-describedby="inputGroup-sizing-default"/>
        </div>
        <div class="text-center"><input type="submit" class="btn btn-dark" value="Save"/></div>
    </form:form>
</div>

</body>
</html>
