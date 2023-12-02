<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

 <!-- Custom styles for this template-->
    <link href="css/customer.css" rel="stylesheet">

  <!-- Custom fonts for this template-->
    <link href="vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">
   
</head>
<body>

  <div class="container">
	<div class="mt-5 d-flex flex-row" >
		<h1 class="col-md-8 mr-3 mb-5">company employee</h1>
		<a href="addEmployee.jsp" class="col-md-2 btn btn-primary text-center m-3 ">Add Employee</a>
		<a href="customer/login.jsp" class="btn btn-primary col-md-2 text-center m-3">logout</a>
	</div>

<div class="container d-flex flex-row flex-wrap mt-4 justify-content-center">
<c:forEach var="com" items="${employeeDetails}" > 
	<c:set var="userid" value="${com.userid}" />
	<c:set var="name" value="${com.name}" />
	<c:set var="email" value="${com.email}" />
	<c:set var="phone" value="${com.phone}" />
	<c:set var="address" value="${com.address}" />
	<c:set var="username" value="${com.username}" />
	<c:set var="password" value="${com.password}" />
	<c:set var="position" value="${com.position}" />
	<c:set var="accountid" value="${com.accountid}" />
	

	
	<c:url value="manager/employee/updateEmployee.jsp" var="updateEmployee">
	<c:param name="userid" value="${userid}"/>
	<c:param name="name" value="${name}"/>
	<c:param name="email" value="${email}"/>
	<c:param name="phone" value="${phone}"/>
	<c:param name="address" value="${address}"/>
	<c:param name="username" value="${username}"/>
	<c:param name="password" value="${password}" />
	<c:param name="position" value="${position}" />
	<c:param name="accountid" value="${accountid}" />
	</c:url>
	
	<c:url value="manager/employee/deleteEmployee.jsp" var="deleteEmployee">
	<c:param name="userid" value="${userid}"/>
	<c:param name="name" value="${name}"/>
	<c:param name="email" value="${email}"/>
	<c:param name="phone" value="${phone}"/>
	<c:param name="address" value="${address}"/>
	<c:param name="username" value="${username}"/>
	<c:param name="password" value="${password}" />
	<c:param name="position" value="${position}" />
	<c:param name="accountid" value="${accountid}" />
	</c:url>
	




		<div class="card m-2" style="width: 18rem; ">
  <div class="card-body">
    <h5 class="card-title">name: ${com.name}</h5>
    <h5 class="card-title">userid Id: ${com.userid}</h5>
    <h6 class="card-subtitle mb-2 text-body-secondary">email: ${com.email}</h6>
    <p class="card-text">phone: ${com.phone}</p>
    <p class="card-text">username: ${com.username}</p>
    <p class="card-text">address: ${com.address}</p>
    <a href="${updateEmployee}" class="card-link">update</a>
    <a href="${deleteEmployee}" class="card-link">Delete</a>
  </div>
</div>

	
	</c:forEach>
</div>
</body>
</html>