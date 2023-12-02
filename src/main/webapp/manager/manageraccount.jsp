<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>


<!-- Customized Bootstrap Stylesheet -->
<link rel="stylesheet" href="css/bootstrap.min.css">

  <!-- Custom fonts for this template-->
    <link href="vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">
    
</head>
<body>
<div class="container">
	<div class="mt-5 d-flex flex-row" >
		<h1 class="col-md-8 mr-3 mb-5">Manager complain</h1>
		<a href="manager/employee/addEmployee.jsp" class="col-md-2 btn btn-primary text-center m-3 ">Add Employee</a>
		<a href="customer/login.jsp" class="btn btn-primary col-md-2 text-center m-3">logout</a>
	</div>


<div class="container d-flex flex-row flex-wrap mt-4 justify-content-center">
<c:forEach var="manager" items="${complainDetails}">
	<c:set var="cusid" value="${manager.cusid}"/>
<c:set var="name" value="${manager.name}"/>
<c:set var="email" value="${manager.email}"/>
<c:set var="phone" value="${manager.phone}"/>
<c:set var="topic" value="${manager.topic}"/>
	<c:set var="complain" value="${manager.complain}"/>
	<c:set var="agentid" value="${manager.agentid}"/>
<c:set var = "comId"  value="${manager.comId}"/>

	<c:url value="manager/respond.jsp" var="respondcomplain">
 <c:param name = "comId"  value="${comId}"/>
	<c:param name="agentid" value="${agentid}"/>
	<c:param name="cusid" value="${cusid}"/>
	<c:param name="name" value="${name}"/>
	<c:param name="email" value="${email}"/>
	<c:param name="phone" value="${phone}"/>
	<c:param name="topic" value="${topic}"/>
	<c:param name="complain" value="${complain}"/>
	</c:url>


<c:url value="manager/deletecomplain.jsp" var="deletecomplain">
 <c:param name = "comId"  value="${comId}"/>
	<c:param name="agentid" value="${agentid}"/>
	<c:param name="cusid" value="${cusid}"/>
	<c:param name="name" value="${name}"/>
	<c:param name="email" value="${email}"/>
	<c:param name="phone" value="${phone}"/>
	<c:param name="topic" value="${topic}"/>
	<c:param name="complain" value="${complain}"/>
	</c:url>
	

<div class="card m-2" style="width: 18rem;">
  <div class="card-body">
    <h5 class="card-title">${manager.topic}</h5>
    <p class="card-text">complain id: ${manager.comId}</p>
       <p class="card-text">customer name: ${manager.name}</p>
        <p class="card-text">manager email: ${manager.email}</p>
        <p class="card-text">complain: ${manager.complain}</p>
    	<a href="${respondcomplain}"><input type="button" name="update" value="respond" class="btn btn-warning"></a>
    	<a href="${deletecomplain}"><input type="button" name="delete" value="delete" class="btn btn-warning"></a>
  </div>
</div>







</c:forEach>
</div>
</div>
</body>
</html>